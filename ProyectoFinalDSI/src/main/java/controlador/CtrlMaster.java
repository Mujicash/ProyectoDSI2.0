/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import interfaces.ControlStrategy;

/**
 *
 * @author Gianfranco
 */
public class CtrlMaster {

    private ControlStrategy ctrl;

    public CtrlMaster() {
        //Inicialmente se debe establecer el ControlStrategy por el setCtrl()
    }

    public void setCtrl(ControlStrategy ctrl) {
        this.ctrl = ctrl;
    }

    public void visualizar() {
        this.ctrl.iniciar();
    }

    public void visualizar(ControlStrategy ctrl) {
        this.ctrl.cerrar();
        this.ctrl = ctrl;
        this.ctrl.iniciar();
    }

}
