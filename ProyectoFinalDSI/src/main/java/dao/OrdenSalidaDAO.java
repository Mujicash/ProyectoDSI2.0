package dao;

import conexion.Conexion;
import dto.OrdenSalidaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author Gianfranco
 */
public class OrdenSalidaDAO {

    private OrdenSalidaDAO() {
        throw new IllegalStateException("Clase de utilidad");
    }

    /**
     *
     * @param nuevo Usuario ha registrar en la base de datos
     */
    public static void insertar(OrdenSalidaDTO nuevo) {
        String sql = "INSERT INTO tbl_orden_salida(fecha,motivo,id_usuario) VALUES(?,?,?)";
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setDate(1, new java.sql.Date(nuevo.getFecha().getTime()));
            pst.setString(2, nuevo.getMotivo());
            pst.setInt(3, nuevo.getIdUsuario());
            if(pst.executeUpdate() > 0){
                nuevo.setIdOrdenSalida(lastId());
            }
        } catch (SQLException ex) {
            System.err.println("Clase OrdenSalidaDAO.insertar:\n" + ex);
        }
    }
    
    public static int lastId(){
        String sql = "select id_salida from tbl_orden_salida order by id_salida desc limit 1";
        int id = -1;
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                id = rs.getInt("id_salida");
            }
        } catch (SQLException ex) {
            System.err.println("Clase OrdenSalidaDAO.insertar:\n" + ex);
        }
        
        return id;
    }

    /**
     *
     * @param modificado Usuario ha modificar en la base de datos
     */
    public static void modificar(OrdenSalidaDTO modificado) {
        String sql = "UPDATE tbl_orden_salida SET fecha=?,motivo=?,id_usuario=? WHERE id_salida=?";
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setDate(1, new java.sql.Date(modificado.getFecha().getTime()));
            pst.setString(2, modificado.getMotivo());
            pst.setInt(3, modificado.getIdUsuario());
            pst.setInt(4, modificado.getIdOrdenSalida());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Clase OrdenSalidaDAO.modificar:\n" + ex);
        }
    }

    /**
     *
     * @param idOrdenSalida Usuario ha eliminar en la base de datos
     */
    public static void eliminar(int idOrdenSalida) {//Quizas solo pedir la id
        String sql = "DELETE FROM tbl_orden_salida WHERE id_salida=?";
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, idOrdenSalida);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Clase OrdenSalidaDAO.eliminar:\n" + ex);
        }
    }

    /**
     *
     * @param idOrdenSalida ID con el que se registro el Fabricante
     * @return El DTO del fabricante
     */
    public static OrdenSalidaDTO buscar(int idOrdenSalida) {
        String sql = "SELECT * FROM tbl_orden_salida WHERE id_salida=?";
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, idOrdenSalida);
            ResultSet rst = pst.executeQuery();
            if (rst.next()) {
                return new OrdenSalidaDTO(rst.getInt(1), rst.getDate(2), rst.getString(3), rst.getInt(4));
            }
        } catch (SQLException ex) {
            System.err.println("Clase OrdenSalidaDAO.buscar:\n" + ex);
        }
        return null;
    }

}
