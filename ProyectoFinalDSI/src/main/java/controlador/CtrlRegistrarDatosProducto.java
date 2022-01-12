package controlador;

import dao.FabricanteDAO;
import dao.MedicamentoDAO;
import dao.ProductoDAO;
import dao.TipoProductoDAO;
import dto.FabricanteDTO;
import dto.MedicamentoDTO;
import dto.ProductoDTO;
import dto.TipoProductoDTO;
import interfaces.ControlStrategy;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import vista.FrmRegistrarDatosProducto;

/**
 *
 * @author Gianfranco
 */
public class CtrlRegistrarDatosProducto implements ActionListener, MouseListener, ControlStrategy {

    private FrmRegistrarDatosProducto vista;
    private CtrlMaster ctrl;
    private List<FabricanteDTO> cbxFabricante;
    private List<TipoProductoDTO> cbxTipoProducto;

    /**
     *
     * @param ctrl
     */
    public CtrlRegistrarDatosProducto(CtrlMaster ctrl) {
        this.vista = new FrmRegistrarDatosProducto();
        this.ctrl = ctrl;
        this.cbxFabricante = FabricanteDAO.mostrar();
        this.cbxTipoProducto = TipoProductoDAO.mostrar();
    }

    /**
     * Realiza todas las acciones necesarias para iniciar la visualizacion del
     * Frame
     */
    @Override
    public void iniciar() {
        this.vista.setTitle("BOTICA CRUZ DE MAYO - JAUJA");
        this.vista.setSize(800, 575);
        this.vista.jPanelRetPrincipal3.addMouseListener(this);
        this.vista.jButtonGuardarDatMedicamento.addActionListener(this);
        this.vista.jButtonModificarDatProducto.addActionListener(this);
        this.vista.jButtonBuscarDatProducto.addActionListener(this);

        this.cbxFabricante.forEach(item
                -> this.vista.jComboBoxMarca.addItem(item.getNombre())
        );
        this.cbxTipoProducto.forEach(item
                -> this.vista.jComboBoxTipo.addItem(item.getFormato())
        );

        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }

    @Override
    public void cerrar() {
        this.vista.dispose();
        this.ctrl = null;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.vista.jButtonGuardarDatMedicamento) {
            MedicamentoDTO nuevo = new MedicamentoDTO(
                    0,
                    this.cbxFabricante.get(this.vista.jComboBoxTipo.getSelectedIndex()).getIdFabricante(),
                    this.vista.jTextFieldNombre.getText(),
                    this.vista.jTextFieldPeso.getText());
            MedicamentoDAO.insertar(nuevo);
        }
        if (e.getSource() == this.vista.jButtonModificarDatProducto) {
            ProductoDTO modificar = new ProductoDTO(Integer.parseInt(this.vista.jTextFieldCodigo.getText()),
                    this.cbxTipoProducto.get(this.vista.jComboBoxTipo.getSelectedIndex()).getIdTipo(),
                    Integer.parseInt(this.vista.jTextFieldStock.getText()),
                    Float.valueOf(this.vista.jTextFieldPrecioVenta.getText()));
            ProductoDAO.modificar(modificar);
        }
        if (e.getSource() == this.vista.jButtonBuscarDatProducto) {
            ProductoDAO.buscar(Integer.parseInt(this.vista.jTextFieldCodigo.getText()),
                    this.cbxTipoProducto.get(this.vista.jComboBoxTipo.getSelectedIndex()).getIdTipo());
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.vista.jPanelRetPrincipal3) {
            this.ctrl.visualizar(new CtrlPrincipal(this.ctrl));
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //No se utiliza este evento
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //No se utiliza este evento
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //No se utiliza este evento
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //No se utiliza este evento
    }

}
