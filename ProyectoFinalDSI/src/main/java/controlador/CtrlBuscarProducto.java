package controlador;

import dao.FabricanteDAO;
import dao.MedicamentoDAO;
import dao.ProductoDAO;
import dao.TipoProductoDAO;
import dto.FabricanteDTO;
import dto.MedicamentoDTO;
import dto.ProductoDTO;
import interfaces.ControlStrategy;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import vista.FrmBuscarProducto;

/**
 *
 * @author Andre Mujica
 */
public class CtrlBuscarProducto implements ActionListener, ControlStrategy {

    private final FrmBuscarProducto vista;
    private CtrlMaster ctrl;

    public CtrlBuscarProducto(CtrlMaster ctrl) {
        this.ctrl = ctrl;
        vista = new FrmBuscarProducto();
    }

    @Override
    public void iniciar() {
        this.vista.setTitle("BOTICA CRUZ DE MAYO - JAUJA");
        this.vista.setSize(1180, 666);
        this.vista.setResizable(false);

        this.vista.jPanelRetPrincipal2.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                retroceder(evt);
            }
        });
        this.vista.jButtonBusCodProducto.addActionListener(this);
        this.vista.jButtonBusNomProducto.addActionListener(this);

        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }

    private void retroceder(MouseEvent e) {
        if (e.getSource() == this.vista.jPanelRetPrincipal2) {
            this.ctrl.visualizar(new CtrlPrincipal(this.ctrl));
        }
    }

    @Override
    public void cerrar() {

        this.vista.dispose();
        this.ctrl = null;

    }

    private void llenarTabla(List<MedicamentoDTO> medicamentos) {
        DefaultTableModel model = (DefaultTableModel) this.vista.jTableBusProducto.getModel();
        model.setRowCount(0);
        for (MedicamentoDTO medicamento : medicamentos) {
            List<ProductoDTO> productos = ProductoDAO.buscar(medicamento.getIdMedicamento());
            FabricanteDTO fabricante = FabricanteDAO.buscar(medicamento.getIdFabricante());

            for (ProductoDTO producto : productos) {
                String formato = TipoProductoDAO.buscar(producto.getIdTipoProducto()).getFormato();
                String nombre = medicamento.getNombre() + " " + fabricante.getNombre() + " " + medicamento.getMedida() + " " + formato;
                Object[] datos = {producto.getIdMedicamento(),
                    nombre,
                    producto.getStock(), producto.getPrecioVenta()};
                model.addRow(datos);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.vista.jButtonBusCodProducto) {
            int idMedicamento = Integer.parseInt(this.vista.jTextFieldCodigo.getText());
            List<MedicamentoDTO> medicamentos = MedicamentoDAO.listar(idMedicamento);
            llenarTabla(medicamentos);
        }

        if (e.getSource() == this.vista.jButtonBusNomProducto) {
            String nombre = this.vista.jTextFieldNomProducto.getText();
            List<MedicamentoDTO> medicamentos = MedicamentoDAO.listar(nombre);
            llenarTabla(medicamentos);
        }

    }

}
