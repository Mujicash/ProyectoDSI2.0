
package dto;

import interfaces.CreadorOrden;
import interfaces.Orden;
import java.sql.Date;

/**
 *
 * @author Andre Mujica
 */
public class JefeAlmacenDTO extends UsuarioDTO implements CreadorOrden {
    
    public JefeAlmacenDTO() {
    }

    public JefeAlmacenDTO(int idUsuario) {
        super(idUsuario);
    }

    public JefeAlmacenDTO(int idUsuario, String username, String password, String nombres, String apellidoPaterno, String apellidoMaterno, Date fechaCreacion, Date ultimaConexion, int idTipoUsuario) {
        super(idUsuario, username, password, nombres, apellidoPaterno, apellidoMaterno, fechaCreacion, ultimaConexion, idTipoUsuario);
    }

    public JefeAlmacenDTO(String username, String password) {
        super(username, password);
    }

    @Override
    public Orden crearOrden(Object[] datos) {

        int idProveedor = (int) datos[0];
        java.util.Date fechaCompra = (java.util.Date) datos[1];
        java.util.Date fechaEntrega = (java.util.Date) datos[2];
        
        return new OrdenCompraDTO(idProveedor, fechaCompra, fechaEntrega);

    }
    
}
