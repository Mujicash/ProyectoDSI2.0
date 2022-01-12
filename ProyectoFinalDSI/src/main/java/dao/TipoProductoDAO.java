package dao;

import conexion.Conexion;
import dto.TipoProductoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author Gianfranco
 */
public class TipoProductoDAO {

    private TipoProductoDAO() {
        throw new IllegalStateException("Clase de utilidad");
    }

    /**
     *
     * @param nuevo Usuario ha registrar en la base de datos
     */
    public static void insertar(TipoProductoDTO nuevo) {//La tabla es tipo
        String sql = "INSERT INTO tbl_tipo(formato) VALUES(?)";
        Connection conn = Conexion.getInstance().getConn();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, nuevo.getFormato());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Clase TipoProductoDAO.insertar:\n" + ex);
        }
    }

    /**
     *
     * @param modificado Usuario ha modificar en la base de datos
     */
    public static void modificar(TipoProductoDTO modificado) {
        String sql = "UPDATE tbl_tipo SET formato=? WHERE id_tipo=?";
        Connection conn = Conexion.getInstance().getConn();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, modificado.getFormato());
            pst.setInt(2, modificado.getIdTipo());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Clase TipoProductoDAO.modificar:\n" + ex);
        }
    }

    /**
     *
     * @param idTipoProducto Usuario ha eliminar en la base de datos
     */
    public static void eliminar(int idTipoProducto) {
        String sql = "DELETE FROM tbl_tipo WHERE id_tipo=?";
        Connection conn = Conexion.getInstance().getConn();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, idTipoProducto);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Clase TipoProductoDAO.eliminar:\n" + ex);
        }
    }

    /**
     *
     * @param idTipoProducto ID con el que se registro el Fabricante
     * @return El DTO del fabricante
     */
    public static TipoProductoDTO buscar(int idTipoProducto) {
        String sql = "SELECT * FROM tbl_tipo WHERE id_tipo=?";
        Connection conn = Conexion.getInstance().getConn();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, idTipoProducto);
            ResultSet rst = pst.executeQuery();
            if (rst.next()) {
                return new TipoProductoDTO(rst.getInt(1), rst.getString(2));
            }
        } catch (SQLException ex) {
            System.err.println("Clase TipoProductoDAO.buscar:\n" + ex);
        }
        return null;
    }

    public static TipoProductoDTO buscar(String formato) {
        String sql = "SELECT * FROM tbl_tipo WHERE formato=?";
        Connection conn = Conexion.getInstance().getConn();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, formato);
            ResultSet rst = pst.executeQuery();
            if (rst.next()) {
                return new TipoProductoDTO(rst.getInt(1), rst.getString(2));
            }
        } catch (SQLException ex) {
            System.err.println("Clase TipoProductoDAO.buscar:\n" + ex);
        }
        return null;
    }

}
