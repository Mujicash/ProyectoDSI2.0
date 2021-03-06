package dao;

import conexion.Conexion;
import dto.GuiaRemisionDTO;
import extra.ImagenMySQL;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.imageio.ImageIO;

/**
 *
 * @author Gianfranco
 */
public class GuiaRemisionDAO {

    private GuiaRemisionDAO() {
        throw new IllegalStateException("Clase de utilidad");
    }

    /**
     *
     * @param nuevo Usuario ha registrar en la base de datos
     */
    public static void insertar(GuiaRemisionDTO nuevo) {


        String sql = "INSERT INTO tbl_guia_remision(num_guia,punto_partida,motivo,fecha_inicio,fecha_entrega,id_guia,img,gestionado) VALUES(?,?,?,?,?,?,?,?)";
      
        Connection conn = Conexion.getInstance();

        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, nuevo.getNumGuia());
            pst.setString(2, nuevo.getPuntoPartida());
            pst.setString(3, nuevo.getMotivo());
            pst.setDate(4, new java.sql.Date(nuevo.getFechaInicio().getTime()));
            pst.setDate(5, new java.sql.Date(nuevo.getFechaEntrega().getTime()));
            pst.setInt(6, nuevo.getIdGuia());
            pst.setBinaryStream(7, nuevo.getFoto().getFis(), (int) nuevo.getFoto().getFich().length());
            pst.setBoolean(8, true);
            
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Clase GuiaRemisionDAO.insertar:\n" + ex);
        }
    }

    /**
     *
     * @param modificado Usuario ha modificar en la base de datos
     */
    public static void modificar(GuiaRemisionDTO modificado) {
        String sql = "UPDATE tbl_guia_remision SET num_guia=?,punto_partida=?,motivo=?,fecha_inicio=?,fecha_entrega=?, gestionado =? WHERE id_guia=?";
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, modificado.getNumGuia());
            pst.setString(2, modificado.getPuntoPartida());
            pst.setString(3, modificado.getMotivo());
            pst.setDate(4, new java.sql.Date(modificado.getFechaInicio().getTime()));
            pst.setDate(5, new java.sql.Date(modificado.getFechaEntrega().getTime()));
            pst.setBoolean(6, modificado.isGestionado());
            pst.setInt(7, modificado.getIdGuia());
            
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Clase GuiaRemisionDAO.modificar:\n" + ex);
        }
    }

    /**
     *
     * @param idGuia Usuario ha eliminar en la base de datos
     */
    public static void eliminar(int idGuia) {
        String sql = "DELETE FROM tbl_guia_remision WHERE id_guia=?";
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, idGuia);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Clase GuiaRemisionDAO.eliminar:\n" + ex);
        }
    }

    /**
     *
     * @param idGuia ID con el que se registro el Fabricante
     * @return La guia de remision buscada
     */
    public static GuiaRemisionDTO buscar(int idGuia){
        
        InputStream imp;
        ImagenMySQL img = new ImagenMySQL();
        
        String sql = "SELECT * FROM tbl_guia_remision WHERE id_guia=?";
        Connection conn = Conexion.getInstance();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, idGuia);
            ResultSet rst = pst.executeQuery();
            
            
            
            
            
            if (rst.next()) {
                
                imp=rst.getBinaryStream(7);
                
                if(imp ==null){
                    img.setBan(false);
                }else{
                    img.setBan(true);
                    
                    try{
                       img.setRuta(ImageIO.read(imp));  
                    }catch(IOException ex){
                        System.out.println(ex);
                    }
                    
                    
                }
                
                
                return new GuiaRemisionDTO(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getDate(5),rst.getBoolean(8),img);
            }
        } catch (SQLException ex) {
            System.err.println("Clase GuiaRemisionDAO.buscar:\n" + ex);
        }
        return null;
    }

}
