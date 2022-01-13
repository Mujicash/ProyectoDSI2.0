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
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JOptionPane;
import vista.FrmRegistrarDatosProducto;

/**
 *
 * @author Gianfranco
 */
public class CtrlRegistrarDatosProducto implements ActionListener, MouseListener, ControlStrategy {

    private FrmRegistrarDatosProducto vista;
    private CtrlMaster ctrl;
    private List<FabricanteDTO> cbxFabricante;

    /**
     *
     * @param ctrl
     */
    public CtrlRegistrarDatosProducto(CtrlMaster ctrl) {
        this.vista = new FrmRegistrarDatosProducto();
        this.ctrl = ctrl;
        this.cbxFabricante = FabricanteDAO.mostrar();
    }

    /**
     * Realiza todas las acciones necesarias para iniciar la visualizacion del
     * Frame
     */
    @Override
    public void iniciar() {
        this.vista.setTitle("BOTICA CRUZ DE MAYO - JAUJA");
        this.vista.setSize(840, 721);
        this.vista.jPanelRetPrincipal3.addMouseListener(this);
        this.vista.jButtonGuardarDatMedicamento.addActionListener(this);
        this.vista.jButtonModificarDatProducto.addActionListener(this);

        this.cbxFabricante.forEach(item
                -> this.vista.jComboBoxMarca.addItem(item.getNombre())
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
                    this.cbxFabricante.get(this.vista.jComboBoxMarca.getSelectedIndex()).getIdFabricante(),
                    this.vista.jTextFieldNombre.getText(),
                    this.vista.jTextFieldPeso.getText(),
                    Integer.parseInt(this.vista.jTextFieldNumBlister.getText()));
            if (MedicamentoDAO.insertar(nuevo)) {
                this.vista.jTextFieldNombre.setEnabled(false);
                this.vista.jTextFieldPeso.setEnabled(false);
                this.vista.jTextFieldNumBlister.setEnabled(false);
                this.vista.jComboBoxMarca.setEnabled(false);
                this.vista.jButtonGuardarDatMedicamento.setEnabled(false);

                int ultimoID = MedicamentoDAO.ultimoID();

                ProductoDTO caja = new ProductoDTO(ultimoID, 1, 0, 0);
                ProductoDTO blister = new ProductoDTO(ultimoID, 2, 0, 0);

                if (ProductoDAO.insertar(caja) && ProductoDAO.insertar(blister)) {
                    JOptionPane.showMessageDialog(this.vista, "Se ha registrado el Producto correctamente. Por favor registrar el precio de venta", "Registrado", JOptionPane.INFORMATION_MESSAGE);
                    this.vista.jTextFieldCodigoBlister.setText(ultimoID + "");
                    this.vista.jTextFieldCodigoCaja.setText(ultimoID + "");
                    this.vista.jTextFieldPrecioVentaBlister.setEnabled(true);
                    this.vista.jTextFieldPrecioVentaCaja.setEnabled(true);
                    this.vista.jButtonModificarDatProducto.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(this.vista, "No pudo registrar el Producto", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                    this.vista.jTextFieldNombre.setEnabled(true);
                    this.vista.jTextFieldPeso.setEnabled(true);
                    this.vista.jTextFieldNumBlister.setEnabled(true);
                    this.vista.jComboBoxMarca.setEnabled(true);
                    this.vista.jButtonGuardarDatMedicamento.setEnabled(true);
                }

            }
        }
        if (e.getSource() == this.vista.jButtonModificarDatProducto) {
            ProductoDTO modificarCaja = new ProductoDTO(
                    Integer.parseInt(this.vista.jTextFieldCodigoCaja.getText()),
                    1,
                    0,
                    Float.valueOf(this.vista.jTextFieldPrecioVentaCaja.getText()));
            ProductoDTO modificarBlister = new ProductoDTO(
                    Integer.parseInt(this.vista.jTextFieldCodigoBlister.getText()),
                    2,
                    0,
                    Float.valueOf(this.vista.jTextFieldPrecioVentaBlister.getText()));
            if (ProductoDAO.modificar(modificarCaja) && ProductoDAO.modificar(modificarBlister)) {
                this.vista.jTextFieldNombre.setEnabled(true);
                this.vista.jTextFieldPeso.setEnabled(true);
                this.vista.jTextFieldNumBlister.setEnabled(true);
                this.vista.jComboBoxMarca.setEnabled(true);
                this.vista.jButtonGuardarDatMedicamento.setEnabled(true);

                this.vista.jTextFieldCodigoBlister.setText("");
                this.vista.jTextFieldCodigoCaja.setText("");
                this.vista.jTextFieldPrecioVentaBlister.setEnabled(false);
                this.vista.jTextFieldPrecioVentaCaja.setEnabled(false);
                this.vista.jButtonModificarDatProducto.setEnabled(false);

            }

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
