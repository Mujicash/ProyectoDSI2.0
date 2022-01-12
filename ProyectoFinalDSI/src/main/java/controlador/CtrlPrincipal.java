package controlador;

import interfaces.ControlStrategy;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import vista.FrmPrincipal;

/**
 *
 * @author Gianfranco
 */
public class CtrlPrincipal implements MouseListener, ControlStrategy {

    private FrmPrincipal vista;
    private CtrlMaster ctrl;

    /**
     *
     * @param ctrl
     */
    public CtrlPrincipal(CtrlMaster ctrl) {
        this.vista = new FrmPrincipal();
        this.ctrl = ctrl;
    }

    /**
     * Realiza todas las acciones necesarias para iniciar la visualizacion del
     * Frame
     */
    @Override
    public void iniciar() {
        this.vista.setTitle("BOTICA CRUZ DE MAYO - JAUJA");
        this.vista.setSize(1070, 650);
        this.vista.setResizable(false);
        this.vista.jPanelBotBuscarOrdenCompra.addMouseListener(this);
        this.vista.jPanelBotBuscarProducto.addMouseListener(this);
        this.vista.jPanelBotRegistrarDatosProducto.addMouseListener(this);
        this.vista.jPanelBotRegistrarDatosProveedor.addMouseListener(this);
        this.vista.jPanelBotRegistrarGuiaRemision.addMouseListener(this);
        this.vista.jPanelBotRegistrarOrdenCompra.addMouseListener(this);
        this.vista.jPanelBotRegistrarOrdenSalida.addMouseListener(this);

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

        if (e.getSource() == this.vista.jPanelBotBuscarOrdenCompra) {
            //this.ctrl.visualizar(new CtrlPrincipal(this.ctrl));
        }
        if (e.getSource() == this.vista.jPanelBotBuscarProducto) {

        }
        if (e.getSource() == this.vista.jPanelBotRegistrarDatosProducto) {
            this.ctrl.visualizar(new CtrlRegistrarDatosProducto(this.ctrl));
        }
        if (e.getSource() == this.vista.jPanelBotRegistrarDatosProveedor) {
            this.ctrl.visualizar(new CtrlRegistrarDatosProveedor(this.ctrl));
        }
        if (e.getSource() == this.vista.jPanelBotRegistrarGuiaRemision) {

        }
        if (e.getSource() == this.vista.jPanelBotRegistrarOrdenCompra) {
            this.ctrl.visualizar(new CtrlRegistrarOrdenCompra(this.ctrl));

        }
        if (e.getSource() == this.vista.jPanelBotRegistrarOrdenSalida) {
            this.ctrl.visualizar(new CtrlRegistroOrdenSalida(this.ctrl));

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
