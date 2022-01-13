/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import interfaces.CreadorOrden;
import interfaces.Orden;
import java.sql.Date;

/**
 *
 * @author Andre Mujica
 */
public class EncargadoBoticaDTO extends UsuarioDTO implements CreadorOrden {

    public EncargadoBoticaDTO() {
    }

    public EncargadoBoticaDTO(int idUsuario) {
        super(idUsuario);
    }

    public EncargadoBoticaDTO(int idUsuario, String username, String password, String nombres, String apellidoPaterno, String apellidoMaterno, Date fechaCreacion, Date ultimaConexion, int idTipoUsuario) {
        super(idUsuario, username, password, nombres, apellidoPaterno, apellidoMaterno, fechaCreacion, ultimaConexion, idTipoUsuario);
    }

    public EncargadoBoticaDTO(String username, String password) {
        super(username, password);
    }

    @Override
    public Orden crearOrden(Object[] datos) {
        
        OrdenSalidaDTO orden = new OrdenSalidaDTO();
        orden.setFecha((java.util.Date) datos[0]);
        orden.setMotivo((String) datos[1]);
        orden.setIdUsuario(this.getIdUsuario());

        return orden;

    }

}