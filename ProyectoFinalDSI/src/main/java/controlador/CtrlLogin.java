package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import vista.FrmLogin;

/**
 *
 * @author André Mujica
 */
public class CtrlLogin implements MouseListener {

    private FrmLogin vista;

    /**
     *
     * @param vista Frame de Login
     */
    public CtrlLogin(FrmLogin vista) {
        this.vista = vista;
    }

    /**
     * Realiza todas las acciones necesarias para iniciar la visualizacion del
     * Frame
     */
    public void visualizar() {

        //this.vista.jPanelBotonIngresar.addMouseListener(this);
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }

    public void cerrar() {
        this.vista.dispose();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        /*
        if(e.getSource()==this.vista.jPanelBotonIngresar){
            
        }
         */
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}
