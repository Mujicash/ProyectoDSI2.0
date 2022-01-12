/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controlador.CtrlLogin;
import controlador.CtrlMaster;
import dao.ProveedorDAO;
import dao.TipoUsuarioDAO;
import dao.UsuarioDAO;
import dto.TipoUsuarioDTO;
import dto.UsuarioDTO;
import java.sql.Date;
import vista.FrmLogin;
import interfaces.ControlStrategy;

/**
 *
 * @author Usuario
 */
public class Main {

    public static void main(String[] args) {
//        TipoUsuarioDTO tipo = new TipoUsuarioDTO(1, "Jefe de Almacen");
//        TipoUsuarioDAO.insertar(tipo);
//
//        UsuarioDTO nuevo = new UsuarioDTO(1, "Ghrand", "123456789", "Gianfranco", "Perez", "Aquise", new Date(new java.util.Date().getTime()), new Date(new java.util.Date().getTime()), 1);
//        UsuarioDAO.insertar(nuevo);

        CtrlMaster controlador = new CtrlMaster();
        controlador.setCtrl(new CtrlLogin(controlador));
        controlador.visualizar();

//        System.out.println(ProveedorDAO.buscarRUC("20486213681"));
    }
}
