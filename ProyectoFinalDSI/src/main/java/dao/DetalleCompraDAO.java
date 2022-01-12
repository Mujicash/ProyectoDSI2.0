package dao;

import conexion.Conexion;
import dto.DetalleCompraDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author Gianfranco
 */
public class DetalleCompraDAO {

    private DetalleCompraDAO() {
        throw new IllegalStateException("Clase de utilidad");
    }

    /**
     *
     * @param nuevo DTO del Detalle de compra ha registrar en la base de datos
     * @return 
     */
    public static boolean insertar(DetalleCompraDTO nuevo) {
        String sql = "INSERT INTO tbl_detalle_compra(id_orden,id_medicamento,unidades,precio) VALUES(?,?,?,?)";
        Connection conn = Conexion.getInstance().getConn();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, nuevo.getIdOrdenCompra());
            pst.setInt(2, nuevo.getIdMedicamento());
            pst.setInt(3, nuevo.getUnidades());
            pst.setDouble(4, nuevo.getPrecio());
            if(pst.executeUpdate() > 0){
                return true;
            }
        } catch (SQLException ex) {
            System.err.println("Clase DetalleCompraDAO.insertar:\n" + ex);
        }
        return false;
    }

    /**
     *
     * @param modificado DTO del Detalle de compra ha modificar en la base de datos
     */
    public static void modificar(DetalleCompraDTO modificado) {
        String sql = "UPDATE tbl_detalle_compra SET unidades=?,precio=? WHERE id_orden=? AND id_medicamento=?";
        Connection conn = Conexion.getInstance().getConn();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, modificado.getUnidades());
            pst.setDouble(2, modificado.getPrecio());
            pst.setInt(3, modificado.getIdOrdenCompra());
            pst.setInt(4, modificado.getIdMedicamento());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Clase DetalleCompraDAO.modificar:\n" + ex);
        }
    }

    /**
     *
     * @param idOrdenCompra ID de la Orden de Compra del Detalle de compra ha eliminar en la base de datos
     * @param idMedicamento ID del Medicamento del Detalle de compra ha eliminar en la base de datos
     */
    public static void eliminar(int idOrdenCompra, int idMedicamento) {//Quizas solo pedir la id
        String sql = "DELETE FROM tbl_detalle_compra WHERE id_orden=? AND id_medicamento=?";
        Connection conn = Conexion.getInstance().getConn();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, idOrdenCompra);
            pst.setInt(2, idMedicamento);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Clase DetalleCompraDAO.eliminar:\n" + ex);
        }
    }

    /**
     *
     * @param idOrdenCompra
     * @param idMedicamento
     * @return La guia de remision buscada
     */
    public static DetalleCompraDTO buscar(int idOrdenCompra, int idMedicamento) {
        String sql = "SELECT * FROM tbl_detalle_compra WHERE id_orden=? AND id_medicamento=?";
        Connection conn = Conexion.getInstance().getConn();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, idOrdenCompra);
            pst.setInt(2, idMedicamento);
            ResultSet rst = pst.executeQuery();
            if (rst.next()) {
                return new DetalleCompraDTO(rst.getInt(1), rst.getInt(2), rst.getInt(3), rst.getFloat(4));
            }
        } catch (SQLException ex) {
            System.err.println("Clase DetalleCompraDAO.eliminar:\n" + ex);
        }
        return null;
    }

}
