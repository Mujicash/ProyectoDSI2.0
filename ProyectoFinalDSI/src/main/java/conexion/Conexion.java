
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author André Mujica 
 */
public class Conexion {
    
    private static final String SERVER = "sql10.freemysqlhosting.net";
    private static final String NAME = "sql10464237";
    private static final String USER = "sql10464237";
    private static final String CLAVE = "cMDDiMeXzh";
    private static final String URL = "jdbc:mysql://"+SERVER+"/"+NAME;
    
    private static Conexion instance; //Singleton
    private Connection conn;
    
    private Conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //driver
            conn = DriverManager.getConnection(URL, USER, CLAVE);
            
            System.out.println("conexion exitosa\n");
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    public synchronized static Conexion getInstance(){
        
        if(instance == null){
            instance = new Conexion();
        }
        
        return instance;
    }

    public Connection getConn() {
        return conn;
    }
    
    public void desconectar(){
        instance = null;
    }

}
