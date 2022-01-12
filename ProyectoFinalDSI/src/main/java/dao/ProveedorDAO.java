package dao;

import conexion.Conexion;
import dto.ProveedorDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author Gianfranco
 */
public class ProveedorDAO {

    private ProveedorDAO() {
        throw new IllegalStateException("Clase de utilidad");
    }

    /**
     *
     * @param nuevo Usuario ha registrar en la base de datos
     */
    public static void insertar(ProveedorDTO nuevo) {
        String sql = "INSERT INTO tbl_proveedor(nombre,ruc,telefono,direccion) VALUES(?,?,?,?)";
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, nuevo.getNombre());
            pst.setString(2, nuevo.getRuc());
            pst.setString(3, nuevo.getTelefono());
            pst.setString(4, nuevo.getDireccion());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Clase ProveedorDAO.insertar:\n" + ex);
        }
    }

    /**
     *
     * @param modificado Usuario ha modificar en la base de datos
     */
    public static void modificar(ProveedorDTO modificado) {
        String sql = "UPDATE tbl_proveedor SET nombre=?,ruc=?,telefono=?,direccion=? WHERE id_proveedor=?";
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, modificado.getNombre());
            pst.setString(2, modificado.getRuc());
            pst.setString(3, modificado.getTelefono());
            pst.setString(4, modificado.getDireccion());
            pst.setInt(5, modificado.getIdProveedor());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Clase ProveedorDAO.modificar:\n" + ex);
        }
    }

    /**
     *
     * @param idProveedor Usuario ha eliminar en la base de datos
     */
    public static void eliminar(int idProveedor) {
        String sql = "DELETE FROM tbl_proveedor WHERE id_proveedor=?";
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, idProveedor);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Clase ProveedorDAO.eliminar:\n" + ex);
        }
    }

    /**
     *
     * @param idProveedor ID con el que se registro el Fabricante
     * @return El DTO del fabricante
     */
    public static ProveedorDTO buscar(int idProveedor) {
        String sql = "SELECT * FROM tbl_proveedor WHERE id_proveedor=?";
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, idProveedor);
            ResultSet rst = pst.executeQuery();
            if (rst.next()) {
                return new ProveedorDTO(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5));
            }
        } catch (SQLException ex) {
            System.err.println("Clase ProveedorDAO.buscar:\n" + ex);
        }
        return null;
    }

    public static ProveedorDTO buscar(String nombre) {
        String sql = "SELECT * FROM tbl_proveedor WHERE nombre=?";
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, nombre);
            ResultSet rst = pst.executeQuery();
            if (rst.next()) {
                return new ProveedorDTO(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5));
            }
        } catch (SQLException ex) {
            System.err.println("Clase ProveedorDAO.buscar:\n" + ex);
        }
        return null;
    }

    public static boolean buscarRUC(String ruc) {
        String sql = "SELECT * FROM tbl_proveedor WHERE ruc=?";
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, ruc);
            ResultSet rst = pst.executeQuery();
            return rst.next();

//            return rst.getString(3).equals(ruc);
        } catch (SQLException ex) {
            System.err.println("Clase ProveedorDAO.buscar:\n" + ex);
        }
        return false;
    }

}
