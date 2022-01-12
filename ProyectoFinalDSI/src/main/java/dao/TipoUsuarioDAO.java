package dao;

import conexion.Conexion;
import dto.TipoProductoDTO;
import dto.TipoUsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author Gianfranco
 */
public class TipoUsuarioDAO {

    private TipoUsuarioDAO() {
        throw new IllegalStateException("Clase de utilidad");
    }

    /**
     *
     * @param nuevo Usuario ha registrar en la base de datos
     */
    public static void insertar(TipoUsuarioDTO nuevo) {//La tabla es tipo
        String sql = "INSERT INTO tbl_tipo_usuario(categoria) VALUES(?)";
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, nuevo.getTipo());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Clase TipoUsuarioDAO.insertar:\n" + ex);
        }
    }

    /**
     *
     * @param modificado Usuario ha modificar en la base de datos
     */
    public static void modificar(TipoUsuarioDTO modificado) {
        String sql = "UPDATE tbl_tipo_usuario SET categoria=? WHERE id_tipo=?";
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, modificado.getTipo());
            pst.setInt(2, modificado.getIdTipoUsuario());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Clase TipoUsuarioDAO.modificar:\n" + ex);
        }
    }

    /**
     *
     * @param idTipoUsuario Usuario ha eliminar en la base de datos
     */
    public static void eliminar(int idTipoUsuario) {
        String sql = "DELETE FROM tbl_tipo_usuario WHERE id_tipo=?";
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, idTipoUsuario);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Clase TipoUsuarioDAO.eliminar:\n" + ex);
        }
    }

    /**
     *
     * @param idTipoUsuario ID con el que se registro el Fabricante
     * @return El DTO del fabricante
     */
    public static TipoUsuarioDTO buscar(int idTipoUsuario) {
        String sql = "SELECT * FROM tbl_tipo_usuario WHERE id_tipo=?";
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, idTipoUsuario);
            ResultSet rst = pst.executeQuery();
            if (rst.next()) {
                return new TipoUsuarioDTO(rst.getInt(1), rst.getString(2));
            }
        } catch (SQLException ex) {
            System.err.println("Clase TipoUsuarioDAO.buscar:\n" + ex);
        }
        return null;
    }

    public static TipoUsuarioDTO buscar(String formato) {
        String sql = "SELECT * FROM tbl_tipo_usuario WHERE categoria=?";
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, formato);
            ResultSet rst = pst.executeQuery();
            if (rst.next()) {
                return new TipoUsuarioDTO(rst.getInt(1), rst.getString(2));
            }
        } catch (SQLException ex) {
            System.err.println("Clase TipoUsuarioDAO.buscar:\n" + ex);
        }
        return null;
    }

}
