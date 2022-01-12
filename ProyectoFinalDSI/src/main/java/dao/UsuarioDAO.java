package dao;

import conexion.Conexion;
import dto.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author Gianfranco
 */
public class UsuarioDAO {

    private UsuarioDAO() {
        throw new IllegalStateException("Clase de utilidad");
    }

    /**
     *
     * @param nuevo Usuario ha registrar en la base de datos
     */
    public static void insertar(UsuarioDTO nuevo) {
        String sql = "INSERT INTO tbl_usuario(usuario,nombre,apellido_pat,apellido_mat,pasword,fecha_creacion,ultima_conexion,tipo) VALUES(?,?,?,?,?,?,?,?)";
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, nuevo.getUsername());
            pst.setString(2, nuevo.getNombres());
            pst.setString(3, nuevo.getApellidoPaterno());
            pst.setString(4, nuevo.getApellidoMaterno());
            pst.setString(5, nuevo.getPassword());
            pst.setDate(6, nuevo.getFechaCreacion());
            pst.setDate(7, nuevo.getUltimaConexion());
            pst.setInt(8, nuevo.getIdTipoUsuario());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Clase UsuarioDAO.insertar:\n" + ex);
        }
    }

    /**
     *
     * @param nuevo Usuario ha modificar en la base de datos
     */
    public static void modificar(UsuarioDTO nuevo) {
        String sql = "UPDATE tbl_usuario SET usuario=?,nombre=?,apellido_pat=?,apellido_mat=?,pasword=?,ultima_conexion=?,tipo=? WHERE id_usuario=?";
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, nuevo.getUsername());
            pst.setString(2, nuevo.getNombres());
            pst.setString(3, nuevo.getApellidoPaterno());
            pst.setString(4, nuevo.getApellidoMaterno());
            pst.setString(5, nuevo.getPassword());
            pst.setDate(6, nuevo.getUltimaConexion());
            pst.setInt(7, nuevo.getIdTipoUsuario());
            pst.setInt(8, nuevo.getIdUsuario());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Clase UsuarioDAO.modificar:\n" + ex);
        }
    }

    /**
     *
     * @param idUsuario Usuario ha eliminar en la base de datos
     */
    public static void eliminar(int idUsuario) {//Quizas solo pedir la id
        String sql = "DELETE FROM tbl_usuario WHERE id_usuario=?";
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, idUsuario);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Clase UsuarioDAO.eliminar:\n" + ex);
        }
    }

    /**
     *
     * @param username Nombre de usuario con el que se registro
     * @param password Contraseña con la que se registro
     */
    public static UsuarioDTO buscar(String username, String password) {
        String sql = "SELECT * FROM tbl_usuario WHERE usuario=? AND pasword=?";
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, username);
            pst.setString(2, password);
            ResultSet rst = pst.executeQuery();
            if (rst.next()) {
                return new UsuarioDTO(rst.getInt(1), rst.getString(2), rst.getString(6), rst.getString(3), rst.getString(4), rst.getString(5), rst.getDate(7), rst.getDate(8), rst.getInt(9));
            }
        } catch (SQLException ex) {
            System.err.println("Clase UsuarioDAO.buscar:\n" + ex);
        }
        return null;
    }

}
