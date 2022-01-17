/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controlador.CtrlLogin;
import controlador.CtrlMaster;

/**
 *
 * @author Usuario
 */
public class Main {

    public static void main(String[] args) {


        CtrlMaster controlador = new CtrlMaster();
        controlador.setCtrl(new CtrlLogin(controlador));
        controlador.visualizar();


    }
}
