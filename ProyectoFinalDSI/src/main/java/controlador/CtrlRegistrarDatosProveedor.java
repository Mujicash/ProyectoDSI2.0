package controlador;

import dao.ProveedorDAO;
import dto.ProveedorDTO;
import interfaces.ControlStrategy;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import vista.FrmRegistrarDatosProveedor;

/**
 *
 * @author Gianfranco
 */
public class CtrlRegistrarDatosProveedor implements ActionListener, MouseListener, ControlStrategy {

    private FrmRegistrarDatosProveedor vista;
    private CtrlMaster ctrl;

    /**
     *
     * @param ctrl
     */
    public CtrlRegistrarDatosProveedor(CtrlMaster ctrl) {
        this.vista = new FrmRegistrarDatosProveedor();
        this.ctrl = ctrl;
    }

    /**
     * Realiza todas las acciones necesarias para iniciar la visualizacion del
     * Frame
     */
    @Override
    public void iniciar() {
        this.vista.setTitle("BOTICA CRUZ DE MAYO - JAUJA");
        this.vista.setSize(840, 590);
        this.vista.setResizable(false);
        this.vista.setLocationRelativeTo(null);
        this.vista.jPanelRetPrincipal4.addMouseListener(this);
        this.vista.jButtonBuscarRUC.addActionListener(this);
        this.vista.jButtonGuardarDatProveedor1.addActionListener(this);

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
        if (e.getSource() == this.vista.jButtonBuscarRUC) {
            if (ProveedorDAO.buscarRUC(this.vista.jTextFieldRUC.getText())) {
                JOptionPane.showMessageDialog(this.vista, "Este RUC se encuentra registrado", "RUC encontrado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this.vista, "Este RUC no se encuentra registrado", "RUC no encontrado", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        if (e.getSource() == this.vista.jButtonGuardarDatProveedor1) {
            ProveedorDTO nuevo = new ProveedorDTO(0,
                    this.vista.jTextFieldEmpresa.getText(),
                    this.vista.jTextFieldRUC.getText(),
                    this.vista.jTextFieldTelefono.getText(),
                    this.vista.jTextFieldDireccion.getText());
            ProveedorDAO.insertar(nuevo);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.vista.jPanelRetPrincipal4) {
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
