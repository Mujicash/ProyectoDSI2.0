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
    private static final String NAME = "sql10465818";
    private static final String USER = "sql10465818";
    private static final String CLAVE = "izhD42ryUv";
    private static final String URL = "jdbc:mysql://" + SERVER + "/" + NAME;

    private static Connection instance; //Singleton

    private Conexion() {
        throw new IllegalStateException("Clase de conexion");
    }

    public static synchronized Connection getInstance() {

        if (instance == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver"); //driver
                instance = DriverManager.getConnection(URL, USER, CLAVE);

                System.out.println("conexion exitosa\n");

            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return instance;
    }

    public static synchronized void desconectar() {
        try {
            instance.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        instance = null;
    }

}
