package dao;

import conexion.Conexion;
import dto.MedicamentoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
     * @return
     */
    public static boolean insertar(MedicamentoDTO nuevo) {
        String sql = "INSERT INTO tbl_medicamento(id_fabricante,nombre,medida,num_blister) VALUES(?,?,?,?)";
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, nuevo.getIdFabricante());
            pst.setString(2, nuevo.getNombre());
            pst.setString(3, nuevo.getMedida());
            pst.setInt(4, nuevo.getNum_blister());
            return pst.executeUpdate() > 0;
        } catch (SQLException ex) {
            System.err.println("Clase MedicamentoDAO.insertar:\n" + ex);
        }
        return false;
    }

    /**
     *
     * @param modificado Usuario ha modificar en la base de datos
     * @return
     */
    public static boolean modificar(MedicamentoDTO modificado) {
        String sql = "UPDATE tbl_medicamento SET id_fabricante=?,nombre=?,medida=?,num_blister=? WHERE id_medicamento=?";
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, modificado.getIdFabricante());
            pst.setString(2, modificado.getNombre());
            pst.setString(3, modificado.getMedida());
            pst.setInt(4, modificado.getNum_blister());
            pst.setInt(5, modificado.getIdMedicamento());
            return pst.executeUpdate() > 0;
        } catch (SQLException ex) {
            System.err.println("Clase MedicamentoDAO.modificar:\n" + ex);
        }
        return false;
    }

    /**
     *
     * @param idMedicamento Usuario ha eliminar en la base de datos
     */
    public static void eliminar(int idMedicamento) {
        String sql = "DELETE FROM tbl_medicamento WHERE id_medicamento=?";
        Connection conn = Conexion.getInstance();
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
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, idMedicamento);
            ResultSet rst = pst.executeQuery();
            if (rst.next()) {
                return new MedicamentoDTO(rst.getInt(1), rst.getInt(2), rst.getString(3), rst.getString(4), rst.getInt(5));
            }
        } catch (SQLException ex) {
            System.err.println("Clase MedicamentoDAO.buscar:\n" + ex);
        }
        return null;
    }

    /**
     *
     * @param idMedicamento ID con el que se registro el Fabricante
     * @return La guia de remision buscada
     */
    public static List<MedicamentoDTO> listar(int idMedicamento) {
        String sql = "SELECT * FROM tbl_medicamento WHERE id_medicamento=?";
        Connection conn = Conexion.getInstance();
        List<MedicamentoDTO> lista = null;
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, idMedicamento);
            ResultSet rst = pst.executeQuery();
            lista = new LinkedList<>();
            while (rst.next()) {
                lista.add(new MedicamentoDTO(rst.getInt(1), rst.getInt(2), rst.getString(3), rst.getString(4), rst.getInt(5)));
            }
        } catch (SQLException ex) {
            System.err.println("Clase MedicamentoDAO.buscar:\n" + ex);
        }
        return lista;
    }

    public static List<MedicamentoDTO> listar(String nombre) {
        String sql = "SELECT * FROM tbl_medicamento WHERE nombre=?";
        Connection conn = Conexion.getInstance();
        List<MedicamentoDTO> lista = null;
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, nombre);
            ResultSet rst = pst.executeQuery();
            lista = new LinkedList<>();
            while (rst.next()) {
                lista.add(new MedicamentoDTO(rst.getInt(1), rst.getInt(2), rst.getString(3), rst.getString(4), rst.getInt(5)));
            }
        } catch (SQLException ex) {
            System.err.println("Clase MedicamentoDAO.buscar:\n" + ex);
        }
        return lista;
    }

    public static int ultimoID() {
        String sql = "SELECT MAX(id_medicamento) FROM tbl_medicamento";
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            ResultSet rst = pst.executeQuery();
            if (rst.next()) {
                return rst.getInt(1);
            }
        } catch (SQLException ex) {
            System.err.println("Clase MedicamentoDAO.buscar:\n" + ex);
        }
        return 0;
    }

    public static List<MedicamentoDTO> mostrar() {
        String sql = "SELECT * FROM tbl_medicamento";
        Connection conn = Conexion.getInstance();
        List<MedicamentoDTO> lista = null;
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            ResultSet rst = pst.executeQuery();
            lista = new LinkedList<>();
            while (rst.next()) {
                lista.add(new MedicamentoDTO(rst.getInt(1), rst.getInt(2), rst.getString(3), rst.getString(4), rst.getInt(5)));
            }
        } catch (SQLException ex) {
            System.err.println("Clase FabricanteDAO.buscar:\n" + ex);
        }
        return lista;
    }

}
