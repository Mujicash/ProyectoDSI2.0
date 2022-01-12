package dao;

import conexion.Conexion;
import dto.DetalleSalidaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author Gianfranco
 */
public class DetalleSalidaDAO {

    private DetalleSalidaDAO() {
        throw new IllegalStateException("Clase de utilidad");
    }

    /**
     *
     * @param nuevo DTO del Detalle de salida ha registrar en la base de datos
     * @return 
     */
    public static boolean insertar(DetalleSalidaDTO nuevo) {
        String sql = "INSERT INTO tbl_detalle_salida(id_orden,id_tipo,id_medicamento,cantidad) VALUES(?,?,?,?)";
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, nuevo.getIdOrdenSalida());
            pst.setInt(2, nuevo.getIdTipoProducto());
            pst.setInt(3, nuevo.getIdMedicamento());
            pst.setInt(4, nuevo.getCantidad());
            
            if(pst.executeUpdate() > 0){
                return true;
            }
        } catch (SQLException ex) {
            System.err.println("Clase DetalleSalidaDAO.insertar:\n" + ex);
        }
        
        return false;
    }

    /**
     *
     * @param modificado DTO del Detalle de salida ha modificar en la base de
     * datos
     */
    public static void modificar(DetalleSalidaDTO modificado) {
        String sql = "UPDATE tbl_detalle_salida SET cantidad=? WHERE id_orden=? AND id_tipo=? AND id_medicamento=?";
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, modificado.getCantidad());
            pst.setInt(2, modificado.getIdOrdenSalida());
            pst.setInt(3, modificado.getIdTipoProducto());
            pst.setInt(4, modificado.getIdMedicamento());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Clase DetalleSalidaDAO.modificar:\n" + ex);
        }
    }

    /**
     *
     * @param idOrden ID de la Orden de Salida del Detalle de Salida ha eliminar
     * en la base de datos
     * @param idTipo ID del Tipo de producto del Detalle de Salida ha eliminar
     * en la base de datos
     * @param idMedicamento ID ddel Medicamento del Detalle de Salida ha
     * eliminar en la base de datos
     */
    public static void eliminar(int idOrden, int idTipo, int idMedicamento) {
        String sql = "DELETE FROM tbl_detalle_salida WHERE id_orden=? AND id_tipo=? AND id_medicamento=?";
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, idOrden);
            pst.setInt(2, idTipo);
            pst.setInt(3, idMedicamento);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Clase DetalleSalidaDAO.eliminar:\n" + ex);
        }
    }

    /**
     *
     * @param idOrden
     * @param idTipo
     * @param idMedicamento
     * @return La guia de remision buscada
     */
    public static DetalleSalidaDTO buscar(int idOrden, int idTipo, int idMedicamento) {
        String sql = "SELECT * FROM tbl_detalle_salida WHERE id_orden=? AND id_tipo=? AND id_medicamento=?";
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, idOrden);
            pst.setInt(2, idTipo);
            pst.setInt(3, idMedicamento);
            ResultSet rst = pst.executeQuery();
            if (rst.next()) {
                return new DetalleSalidaDTO(rst.getInt(1), rst.getInt(2), rst.getInt(3), rst.getInt(4));
            }
        } catch (SQLException ex) {
            System.err.println("Clase DetalleSalidaDAO.eliminar:\n" + ex);
        }
        return null;
    }

}
