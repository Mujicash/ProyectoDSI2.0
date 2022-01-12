
package dto;

import java.sql.Date;

/**
 *
 * @author andre
 */
public class UsuarioDTO {
    
    private int idUsuario;
    private String username;
    private String password;
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Date fechaCreacion;
    private Date ultimaConexion;
    private int idTipoUsuario;

    public UsuarioDTO() {
    }

    public UsuarioDTO(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public UsuarioDTO(int idUsuario, String username, String password, String nombres, String apellidoPaterno, String apellidoMaterno, Date fechaCreacion, Date ultimaConexion, int idTipoUsuario) {
        this.idUsuario = idUsuario;
        this.username = username;
        this.password = password;
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaCreacion = fechaCreacion;
        this.ultimaConexion = ultimaConexion;
        this.idTipoUsuario = idTipoUsuario;
    }

    public UsuarioDTO(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getUltimaConexion() {
        return ultimaConexion;
    }

    public void setUltimaConexion(Date ultimaConexion) {
        this.ultimaConexion = ultimaConexion;
    }

    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    @Override
    public String toString() {
        return "UsuarioDTO{" + "idUsuario=" + idUsuario + ", username=" + username + ", nombres=" + nombres + ", " + apellidoPaterno + " " + apellidoMaterno + '}';
    }
    
}
