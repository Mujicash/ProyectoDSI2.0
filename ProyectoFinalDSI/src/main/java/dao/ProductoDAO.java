package dao;

import conexion.Conexion;
import dto.ProductoDTO;
import dto.ProveedorDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

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
     * @return 
     */
    public static boolean insertar(ProductoDTO nuevo) {
        String sql = "INSERT INTO tbl_producto(id_medicamento,id_tipo,stock,precio_venta) VALUES(?,?,?,?)";
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, nuevo.getIdMedicamento());
            pst.setInt(2, nuevo.getIdTipoProducto());
            pst.setInt(3, nuevo.getStock());
            pst.setFloat(4, nuevo.getPrecioVenta());
            return pst.executeUpdate() > 0;
        } catch (SQLException ex) {
            System.err.println("Clase ProductoDAO.insertar:\n" + ex);
        }
        return false;
    }

    /**
     *
     * @param modificado Usuario ha modificar en la base de datos
     * @return 
     */
    public static boolean modificar(ProductoDTO modificado) {
        String sql = "UPDATE tbl_producto SET stock=?,precio_venta=? WHERE id_medicamento=? AND id_tipo=?";
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, modificado.getStock());
            pst.setFloat(2, modificado.getPrecioVenta());
            pst.setInt(3, modificado.getIdMedicamento());
            pst.setInt(4, modificado.getIdTipoProducto());
            return pst.executeUpdate() > 0;
        } catch (SQLException ex) {
            System.err.println("Clase ProductoDAO.modificar:\n" + ex);
        }
        return false;
    }

    public static boolean aumentarStock(int m, int t, int aum) {
        String sql = "UPDATE tbl_producto SET stock=stock+? WHERE id_medicamento=? AND id_tipo=?";
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, aum);
            pst.setInt(2, m);
            pst.setInt(3, t);
            return pst.executeUpdate() > 0;
        } catch (SQLException ex) {
            System.err.println("Clase ProductoDAO.modificar:\n" + ex);
        }
        return false;
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
    public static ProductoDTO buscar(int idMedicamento, int idTipo) {
        String sql = "SELECT * FROM tbl_producto WHERE id_medicamento=? AND id_tipo=?";
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, idMedicamento);
            pst.setInt(2, idTipo);
            ResultSet rst = pst.executeQuery();
            if (rst.next()) {
                return new ProductoDTO(rst.getInt(1), rst.getInt(2), rst.getInt(3), rst.getFloat(4));
            }
        } catch (SQLException ex) {
            System.err.println("Clase ProductoDAO.buscar:\n" + ex);
        }
        return null;
    }

    public static List<ProductoDTO> buscar(int idMedicamento) {
        String sql = "SELECT * FROM tbl_producto WHERE id_medicamento=?";
        Connection conn = Conexion.getInstance();
        List<ProductoDTO> lista = null;
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, idMedicamento);
            ResultSet rst = pst.executeQuery();
            lista = new LinkedList<>();
            while (rst.next()) {
                lista.add(new ProductoDTO(rst.getInt(1), rst.getInt(2), rst.getInt(3), rst.getFloat(4)));
            }
        } catch (SQLException ex) {
            System.err.println("Clase ProductoDAO.buscar:\n" + ex);
        }
        return lista;
    }

}
