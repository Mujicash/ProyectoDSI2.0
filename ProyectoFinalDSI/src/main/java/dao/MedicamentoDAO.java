package dao;

import conexion.Conexion;
import dto.MedicamentoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author Gianfranco
 */
public class MedicamentoDAO {

    private MedicamentoDAO() {
        throw new IllegalStateException("Clase de utilidad");
    }

    /**
     *
     * @param nuevo Usuario ha registrar en la base de datos
     */
    public static void insertar(MedicamentoDTO nuevo) {
        String sql = "INSERT INTO tbl_medicamento(id_fabricante,nombre,medida) VALUES(?,?,?)";
        Connection conn = Conexion.getInstance().getConn();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, nuevo.getIdFabricante());
            pst.setString(2, nuevo.getNombre());
            pst.setString(3, nuevo.getMedida());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Clase MedicamentoDAO.insertar:\n" + ex);
        }
    }

    /**
     *
     * @param modificado Usuario ha modificar en la base de datos
     */
    public static void modificar(MedicamentoDTO modificado) {
        String sql = "UPDATE tbl_medicamento SET id_fabricante=?,nombre=?,medida=? WHERE id_medicamento=?";
        Connection conn = Conexion.getInstance().getConn();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, modificado.getIdFabricante());
            pst.setString(2, modificado.getNombre());
            pst.setString(3, modificado.getMedida());
            pst.setInt(4, modificado.getIdMedicamento());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Clase MedicamentoDAO.modificar:\n" + ex);
        }
    }

    /**
     *
     * @param idMedicamento Usuario ha eliminar en la base de datos
     */
    public static void eliminar(int idMedicamento) {
        String sql = "DELETE FROM tbl_medicamento WHERE id_medicamento=?";
        Connection conn = Conexion.getInstance().getConn();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, idMedicamento);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Clase MedicamentoDAO.eliminar:\n" + ex);
        }
    }

    /**
     *
     * @param idMedicamento ID con el que se registro el Fabricante
     * @return La guia de remision buscada
     */
    public static MedicamentoDTO buscar(int idMedicamento) {
        String sql = "SELECT * FROM tbl_medicamento WHERE id_medicamento=?";
        Connection conn = Conexion.getInstance().getConn();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, idMedicamento);
            ResultSet rst = pst.executeQuery();
            if (rst.next()) {
                return new MedicamentoDTO(rst.getInt(1), rst.getInt(2), rst.getString(3), rst.getString(4));
            }
        } catch (SQLException ex) {
            System.err.println("Clase MedicamentoDAO.buscar:\n" + ex);
        }
        return null;
    }

}
