package controlador;

import interfaces.ControlStrategy;
import dao.UsuarioDAO;
import dto.UsuarioDTO;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import vista.FrmLogin;

/**
 *
 * @author Gianfranco
 */
public class CtrlLogin implements MouseListener, ControlStrategy {

    private FrmLogin vista;
    private CtrlMaster ctrl;

    /**
     *
     * @param ctrl
     */
    public CtrlLogin(CtrlMaster ctrl) {
        this.vista = new FrmLogin();
        this.ctrl = ctrl;
    }

    /**
     * Realiza todas las acciones necesarias para iniciar la visualizacion del
     * Frame
     */
    @Override
    public void iniciar() {
        this.vista.setTitle("BOTICA CRUZ DE MAYO - JAUJA");
        this.vista.setSize(1128, 658);
        this.vista.setResizable(false);
        this.vista.jPanelBotonIngresar.addMouseListener(this);

        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }

    @Override
    public void cerrar() {
        this.vista.dispose();
        this.ctrl = null;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == this.vista.jPanelBotonIngresar) {
            UsuarioDTO user = UsuarioDAO.buscar(this.vista.jTextFieldUsuario.getText(), String.valueOf(this.vista.jPasswordFieldContraseña.getPassword()));
            if (user != null) {
                this.ctrl.setUsuario(user);
                //System.out.println(this.ctrl.getUsuario());
                this.ctrl.visualizar(new CtrlPrincipal(this.ctrl));
            }
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
