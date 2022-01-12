package dao;

import conexion.Conexion;
import dto.OrdenCompraDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author Gianfranco
 */
public class OrdenCompraDAO {

    private OrdenCompraDAO() {
        throw new IllegalStateException("Clase de utilidad");
    }

    /**
     *
     * @param nuevo Usuario ha registrar en la base de datos
     */
    public static void insertar(OrdenCompraDTO nuevo) {
        String sql = "INSERT INTO tbl_orden_compra(id_proveedor,fecha_compra,fecha_entrega,estado) VALUES(?,?,?,?)";
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, nuevo.getProveedor());
            pst.setDate(2, new java.sql.Date(nuevo.getFechaCompra().getTime()));
            pst.setDate(3, new java.sql.Date(nuevo.getFechaEntrega().getTime()));
            pst.setBoolean(4, nuevo.isEstado());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Clase OrdenCompraDAO.insertar:\n" + ex);
        }
    }

    /**
     *
     * @param modificado Usuario ha modificar en la base de datos
     */
    public static void modificar(OrdenCompraDTO modificado) {
        String sql = "UPDATE tbl_orden_compra SET id_proveedor=?,fecha_compra=?,fecha_entrega=?,estado=? WHERE id_compra=?";
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, modificado.getProveedor());
            pst.setDate(2, new java.sql.Date(modificado.getFechaCompra().getTime()));
            pst.setDate(3, new java.sql.Date(modificado.getFechaEntrega().getTime()));
            pst.setBoolean(4, modificado.isEstado());
            pst.setInt(5, modificado.getIdOrdenCompra());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Clase OrdenCompraDAO.modificar:\n" + ex);
        }
    }

    /**
     *
     * @param idCompra Usuario ha eliminar en la base de datos
     */
    public static void eliminar(int idCompra) {
        String sql = "DELETE FROM tbl_orden_compra WHERE id_compra=?";
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, idCompra);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Clase OrdenCompraDAO.eliminar:\n" + ex);
        }
    }

    /**
     *
     * @param idCompra ID con el que se registro el Fabricante
     * @return La guia de remision buscada
     */
    public static OrdenCompraDTO buscar(int idCompra) {
        String sql = "SELECT * FROM tbl_orden_compra WHERE id_compra=?";
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, idCompra);
            ResultSet rst = pst.executeQuery();
            if (rst.next()) {
                return new OrdenCompraDTO(rst.getInt(1), rst.getInt(2), rst.getDate(3), rst.getDate(4), rst.getBoolean(5));
            }
        } catch (SQLException ex) {
            System.err.println("Clase OrdenCompraDAO.buscar:\n" + ex);
        }
        return null;
    }

}
