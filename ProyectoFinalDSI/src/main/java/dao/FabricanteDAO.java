package dao;

import conexion.Conexion;
import dto.FabricanteDTO;
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
public class FabricanteDAO {

    private FabricanteDAO() {
        throw new IllegalStateException("Clase de utilidad");
    }

    /**
     *
     * @param nuevo DTO del Fabricante ha registrar en la base de datos
     */
    public static void insertar(FabricanteDTO nuevo) {
        String sql = "INSERT INTO tbl_fabricante(nombre) VALUES(?)";
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, nuevo.getNombre());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Clase FabricanteDAO.insertar:\n" + ex);
        }
    }

    /**
     *
     * @param modificado DTO del Fabricante ha modificar en la base de datos
     */
    public static void modificar(FabricanteDTO modificado) {
        String sql = "UPDATE tbl_fabricante SET nombre=? WHERE id_fabricante=?";
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, modificado.getNombre());
            pst.setInt(2, modificado.getIdFabricante());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Clase FabricanteDAO.modificar:\n" + ex);
        }
    }

    /**
     *
     * @param idFabricante ID del Fabricante ha eliminar en la base de datos
     */
    public static void eliminar(int idFabricante) {
        String sql = "DELETE FROM tbl_fabricante WHERE id_fabricante=?";
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, idFabricante);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Clase FabricanteDAO.eliminar:\n" + ex);
        }
    }

    /**
     *
     * @param idFabricante ID del Fabricante ha eliminar en la base de datos
     * @return El DTO del fabricante
     */
    public static FabricanteDTO buscar(int idFabricante) {
        String sql = "SELECT * FROM tbl_fabricante WHERE id_fabricante=?";
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, idFabricante);
            ResultSet rst = pst.executeQuery();
            if (rst.next()) {
                return new FabricanteDTO(rst.getInt(1), rst.getString(2));
            }
        } catch (SQLException ex) {
            System.err.println("Clase FabricanteDAO.buscar:\n" + ex);
        }
        return null;
    }

    public static FabricanteDTO buscar(String nombre) {
        String sql = "SELECT * FROM tbl_fabricante WHERE nombre=?";
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, nombre);
            ResultSet rst = pst.executeQuery();
            if (rst.next()) {
                return new FabricanteDTO(rst.getInt(1), rst.getString(2));
            }
        } catch (SQLException ex) {
            System.err.println("Clase FabricanteDAO.buscar:\n" + ex);
        }
        return null;
    }

    public static List<FabricanteDTO> mostrar() {
        String sql = "SELECT * FROM tbl_fabricante";
        Connection conn = Conexion.getInstance();
        List<FabricanteDTO> lista = null;
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            ResultSet rst = pst.executeQuery();
            lista = new LinkedList<>();
            while (rst.next()) {
                lista.add(new FabricanteDTO(rst.getInt(1), rst.getString(2)));
            }
        } catch (SQLException ex) {
            System.err.println("Clase FabricanteDAO.buscar:\n" + ex);
        }
        return lista;
    }

}
