package dao;

import conexion.Conexion;
import dto.ProductoDTO;
import dto.ProveedorDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author Gianfranco
 */
public class ProductoDAO {

    private ProductoDAO() {
        throw new IllegalStateException("Clase de utilidad");
    }

    /**
     *
     * @param nuevo Usuario ha registrar en la base de datos
     */
    public static void insertar(ProductoDTO nuevo) {
        String sql = "INSERT INTO tbl_producto(id_medicamento,id_tipo,stock,precio_venta) VALUES(?,?,?,?)";
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, nuevo.getIdMedicamento());
            pst.setInt(2, nuevo.getIdTipoProducto());
            pst.setInt(3, nuevo.getStock());
            pst.setFloat(4, nuevo.getPrecioVenta());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Clase ProductoDAO.insertar:\n" + ex);
        }
    }

    /**
     *
     * @param modificado Usuario ha modificar en la base de datos
     */
    public static void modificar(ProductoDTO modificado) {
        String sql = "UPDATE tbl_producto SET stock=?,precio_venta=? WHERE id_medicamento=? AND id_tipo=?";
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, modificado.getStock());
            pst.setFloat(2, modificado.getPrecioVenta());
            pst.setInt(3, modificado.getIdMedicamento());
            pst.setInt(4, modificado.getIdTipoProducto());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Clase ProductoDAO.modificar:\n" + ex);
        }
    }

    /**
     *
     * @param eliminar Usuario ha eliminar en la base de datos
     */
    public static void eliminar(ProductoDTO eliminar) {//Quizas solo pedir la id
        String sql = "DELETE FROM tbl_producto WHERE id_medicamento=? AND id_tipo=?";
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, eliminar.getIdMedicamento());
            pst.setInt(2, eliminar.getIdTipoProducto());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Clase ProductoDAO.eliminar:\n" + ex);
        }
    }

    /**
     *
     * @param idMedicamento ID con el que se registro el Fabricante
     * @param idTipo
     * @return El DTO del fabricante
     */
    public static ProveedorDTO buscar(int idMedicamento, int idTipo) {
        String sql = "SELECT * FROM tbl_producto WHERE id_medicamento=? AND id_tipo=?";
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, idMedicamento);
            pst.setInt(2, idTipo);
            ResultSet rst = pst.executeQuery();
            if (rst.next()) {
                return new ProveedorDTO(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5));
            }
        } catch (SQLException ex) {
            System.err.println("Clase ProductoDAO.eliminar:\n" + ex);
        }
        return null;
    }

}
