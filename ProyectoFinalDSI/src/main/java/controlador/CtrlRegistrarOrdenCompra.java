package controlador;

import dao.FabricanteDAO;
import dao.MedicamentoDAO;
import dao.OrdenCompraDAO;
import dao.ProveedorDAO;
import dto.FabricanteDTO;
import dto.JefeAlmacenDTO;
import dto.MedicamentoDTO;
import dto.OrdenCompraDTO;
import dto.ProveedorDTO;
import interfaces.ControlStrategy;
import interfaces.CreadorOrden;
import interfaces.Orden;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import vista.FrmRegistrarOrdenCompra;

/**
 *
 * @author Andre Mujica
 */
public class CtrlRegistrarOrdenCompra implements ActionListener, ControlStrategy {

    private FrmRegistrarOrdenCompra vista;
    private CtrlMaster ctrl;
    private List<ProveedorDTO> cbProveedor;
    private ArrayList<Integer> codigos;
    private ArrayList<Integer> cantidades;
    private ArrayList<Double> precios;

    public CtrlRegistrarOrdenCompra(CtrlMaster ctrl) {
        this.vista = new FrmRegistrarOrdenCompra();
        this.ctrl = ctrl;
        this.cbProveedor = ProveedorDAO.mostrar();
        this.codigos = new ArrayList<>();
        this.cantidades = new ArrayList<>();
        this.precios = new ArrayList<>();
    }

    @Override
    public void iniciar() {

        this.vista.setTitle("BOTICA CRUZ DE MAYO - JAUJA");
        this.vista.setSize(990, 660);
        this.vista.jPanelRetPrincipal6.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                retroceder(evt);
            }
        });
        this.vista.jbtnGuardar.addActionListener(this);
        this.vista.jbtnAgregar.addActionListener(this);

        this.cbProveedor.forEach(item
                -> this.vista.JComboProveedor.addItem(item.getNombre())
        );

        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
        inicializarTabla();
    }

    private void inicializarTabla() {
        String[] colums = {"ID", "NOMBRE", "MEDIDA", "FABRICANTE", "CANTIDAD", "COSTO UNITARIO", "TOTAL"};
        FrmRegistrarOrdenCompra.modelCompra = new DefaultTableModel(null, colums);
        vista.jTableOrdCompra.setModel(FrmRegistrarOrdenCompra.modelCompra);
    }

    private void CargarTabla(int id, String nombre, String medida, String fabricante, int cantida, double costo) {

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        Object[] fila = {id, nombre, medida, fabricante, cantida, costo, cantida * costo};
        FrmRegistrarOrdenCompra.modelCompra.addRow(fila);

        vista.jTableOrdCompra.setModel(FrmRegistrarOrdenCompra.modelCompra);

        for (int i = 0; i < vista.jTableOrdCompra.getColumnCount(); i++) {
            vista.jTableOrdCompra.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }

    @Override
    public void cerrar() {
        this.vista.dispose();
        this.ctrl = null;
    }

    public void limpiarCajas() {
        vista.jTextFieldCodProducto.setText("");
        vista.jTextFieldCantidad.setText("");
        vista.jTextFieldPrecCompra.setText("");
        vista.jTextFieldTotal.setText(String.valueOf(calcularTotal()));
    }

    public double calcularTotal() {
        double suma = 0;
        for (int i = 0; i < cantidades.size(); i++) {
            suma += cantidades.get(i) * precios.get(i);
        }

        return suma;
    }
    
    private boolean validaciones(String cod, String cant, String prec){
        
        try{
            int codigo = Integer.valueOf(cod);
        } catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "EL CODIGO DEL MEDICAMENTO DEBE SER UN NUMERO ENTERO", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        try{
            int cantidad = Integer.valueOf(cant);
        } catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "LA CANTIDAD DEBE SER UN NUMERO ENTERO", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        try{
            double precio = Double.valueOf(prec);
        } catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "EL PRECIO DEBE SER UN NUMERO REAL", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.jbtnAgregar) {
            if(validaciones(vista.jTextFieldCodProducto.getText(), vista.jTextFieldCantidad.getText(), vista.jTextFieldPrecCompra.getText())){
                MedicamentoDTO medicamento = MedicamentoDAO.buscar(Integer.valueOf(vista.jTextFieldCodProducto.getText()));
                int codigo = Integer.valueOf(vista.jTextFieldCodProducto.getText());
                int cantidad = Integer.valueOf(vista.jTextFieldCantidad.getText());
                double precio = Double.valueOf(vista.jTextFieldPrecCompra.getText());
                
                if (medicamento != null) {                    
                    FabricanteDTO fabricante = FabricanteDAO.buscar(medicamento.getIdFabricante());
                    codigos.add(codigo);
                    cantidades.add(cantidad);
                    precios.add(precio);

                    CargarTabla(codigo, medicamento.getNombre(), medicamento.getMedida(), fabricante.getNombre(), cantidad, precio);
                }
                else{
                    JOptionPane.showMessageDialog(null, "EL CODIGO DEL MEDICAMENTO NO EXISTE!!!", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
            limpiarCajas();
        }

        if (e.getSource() == vista.jbtnGuardar) {

            //CreadorOrden usuario = (CreadorOrden) CtrlMaster.usuario;
            //JefeAlmacenDTO usuario = (JefeAlmacenDTO) CtrlMaster.usuario;
            JefeAlmacenDTO usuario = new JefeAlmacenDTO(this.ctrl.getUsuario().getIdUsuario());
            Object[] datosOrden = new Object[]{cbProveedor.get(vista.JComboProveedor.getSelectedIndex()).getIdProveedor(), Calendar.getInstance().getTime(), Calendar.getInstance().getTime()};
            Object[][] datosDetalle = new Object[codigos.size()][];

            for (int i = 0; i < codigos.size(); i++) {
                datosDetalle[i] = new Object[]{codigos.get(i), cantidades.get(i), precios.get(i)};
            }

            Orden compra = usuario.crearOrden(datosOrden);
            OrdenCompraDAO.insertar((OrdenCompraDTO) compra);
            System.out.println(((OrdenCompraDTO) compra).getIdOrdenCompra());
            JOptionPane.showMessageDialog(null, compra.generarDetalle(datosDetalle));

            codigos = new ArrayList<>();
            cantidades = new ArrayList<>();
            precios = new ArrayList<>();
            limpiarCajas();
            inicializarTabla();
        }

    }

    public void retroceder(MouseEvent e) {

        this.ctrl.visualizar(new CtrlPrincipal(this.ctrl));
    }

}
