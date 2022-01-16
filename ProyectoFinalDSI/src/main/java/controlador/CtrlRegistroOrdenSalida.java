package controlador;

import dao.MedicamentoDAO;
import dao.OrdenSalidaDAO;
import dao.ProductoDAO;
import dao.TipoProductoDAO;
import dto.EncargadoBoticaDTO;
import dto.MedicamentoDTO;
import dto.OrdenSalidaDTO;
import dto.ProductoDTO;
import dto.TipoProductoDTO;
import interfaces.ControlStrategy;
import interfaces.Orden;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import vista.FrmRegistrarOrdenSalida;

/**
 *
 * @author Andre Mujica
 */
public class CtrlRegistroOrdenSalida implements ActionListener, ControlStrategy {

    private final FrmRegistrarOrdenSalida vista;
    private CtrlMaster ctrl;
    private final List<MedicamentoDTO> cbMedicamentos;
    private final List<TipoProductoDTO> cbTipoProducto;
    private ArrayList<Integer> idTipo;
    private ArrayList<Integer> idMedicamento;
    private ArrayList<Integer> cantidades;

    public CtrlRegistroOrdenSalida(CtrlMaster ctrl) {
        this.ctrl = ctrl;
        this.vista = new FrmRegistrarOrdenSalida();
        this.cbMedicamentos = MedicamentoDAO.mostrar();
        this.cbTipoProducto = TipoProductoDAO.mostrar();
        idTipo = new ArrayList<>();
        idMedicamento = new ArrayList<>();
        cantidades = new ArrayList<>();
    }

    @Override
    public void iniciar() {

        this.vista.setTitle("BOTICA CRUZ DE MAYO - JAUJA");
        this.vista.setSize(980, 650);
        vista.jPanelRetPrincipal7.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                retroceder(evt);
            }
        });
        vista.jbtnAgregarProducto.addActionListener(this);
        vista.jButtonCrearOrden.addActionListener(this);
        vista.jButtonDescartar.addActionListener(this);
        vista.jButtonDescartarProducto.addActionListener(this);

        this.cbMedicamentos.forEach(item -> this.vista.jcbMedicamentos.addItem(item.getNombre()));
        this.cbTipoProducto.forEach(item -> this.vista.jcbTipo.addItem(item.getFormato()));

        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        inicializarTabla();
    }

    private void inicializarTabla() {
        String[] colums = {"IDPRODUCTO", "NOMBRE", "CANTIDAD"};
        FrmRegistrarOrdenSalida.modelSalida = new DefaultTableModel(null, colums);
        vista.jTableRegOrdSalida.setModel(FrmRegistrarOrdenSalida.modelSalida);
    }

    private void cargarTabla(int idMedicamento, int idTipo, String nombreProducto, int cantidad) {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        StringBuilder sb = new StringBuilder();
        sb.append(idMedicamento);
        sb.append(idTipo);

        Object[] fila = {sb.toString(), nombreProducto, cantidad};
        FrmRegistrarOrdenSalida.modelSalida.addRow(fila);

        vista.jTableRegOrdSalida.setModel(FrmRegistrarOrdenSalida.modelSalida);

        for (int i = 0; i < vista.jTableRegOrdSalida.getColumnCount(); i++) {
            vista.jTableRegOrdSalida.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }

    @Override
    public void cerrar() {
        this.vista.dispose();
        this.ctrl = null;
    }

    private void limpiarCajas() {
        vista.jcbMedicamentos.setSelectedIndex(-1);
        vista.jcbTipo.setSelectedIndex(-1);
        vista.jTextFieldCantProducto.setText("");
    }

    public void retroceder(MouseEvent e) {
        if (e.getSource() == this.vista.jPanelRetPrincipal7) {
            this.ctrl.visualizar(new CtrlPrincipal(this.ctrl));
        }
    }

    private void descartar() {
        idMedicamento = new ArrayList<>();
        idTipo = new ArrayList<>();
        cantidades = new ArrayList<>();
        limpiarCajas();
        inicializarTabla();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.jButtonCrearOrden) {

            EncargadoBoticaDTO usuario = new EncargadoBoticaDTO(ctrl.getUsuario().getIdUsuario());
            Object[] datosOrden = new Object[]{Calendar.getInstance().getTime(), vista.jTextFieldMotSalida.getText()};
            Object[][] datosDetalle = new Object[idMedicamento.size()][];

            for (int i = 0; i < idMedicamento.size(); i++) {
                datosDetalle[i] = new Object[]{idTipo.get(i), idMedicamento.get(i), cantidades.get(i)};
            }

            Orden salida = usuario.crearOrden(datosOrden);
            OrdenSalidaDAO.insertar((OrdenSalidaDTO) salida);
            System.out.println(((OrdenSalidaDTO) salida).getIdOrdenSalida());
            JOptionPane.showMessageDialog(null, salida.generarDetalle(datosDetalle));

            descartar();
        }

        if (e.getSource() == vista.jButtonDescartar) {

            descartar();

        }

        if (e.getSource() == vista.jButtonDescartarProducto) {
            //Funcionalidad para eliminar un registro producto de la tabla
            
            int filaSelec = vista.jTableRegOrdSalida.getSelectedRow();
            if(filaSelec < 0){
                JOptionPane.showMessageDialog(null, "SELECCIONE EL CODIGO DE UN PRODUCTO DE LA TABLA", "¡ERROR!", JOptionPane.ERROR_MESSAGE); 
            }
            else{
                int filaModelo = vista.jTableRegOrdSalida.convertRowIndexToModel(filaSelec);
                
                idMedicamento.remove(filaModelo);
                idTipo.remove(filaModelo);
                cantidades.remove(filaModelo);
                
                inicializarTabla();
                
                for(int i = 0; i < idMedicamento.size(); i++){
                    cargarTabla(idMedicamento.get(i), idTipo.get(i), MedicamentoDAO.buscar(idMedicamento.get(i)).getNombre(), cantidades.get(i));
                }
                
                
            }
            
        }

        if (e.getSource() == vista.jbtnAgregarProducto) {
            int idMe = vista.jcbMedicamentos.getSelectedIndex() + 1;
            int idTip = vista.jcbTipo.getSelectedIndex() + 1;
            int cant = Integer.valueOf(vista.jTextFieldCantProducto.getText());
            ProductoDTO producto = ProductoDAO.buscar(idMe, idTip);
            if (producto != null) {
                idMedicamento.add(idMe);
                idTipo.add(idTip);
                cantidades.add(cant);

                cargarTabla(idMe, idTip, MedicamentoDAO.buscar(idMe).getNombre(), cant);
                limpiarCajas();
            }

        }

    }

}
