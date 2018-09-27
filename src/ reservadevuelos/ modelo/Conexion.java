package reservadevuelos.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author asus pc
 */
public class Conexion {
    
    // ATRIBUTOS
    private String url, usuario, password;
    private Connection conexion;
    
    // CONSTRUCTOR
    public Conexion(String url, String usuario, String password) throws ClassNotFoundException {
        this.url = url;
        this.usuario = usuario;
        this.password = password;
        Class.forName("org.mariadb.jdbc.Driver");
    }
    
    // CONSTRUCTOR POR DEFAULT
    /*public Conexion() throws ClassNotFoundException {
        this.url = "jdbc:mysql://localhost/vuelos";
        this.usuario = "root";
        this.password = "";
        Class.forName("org.mariadb.jdbc.Driver");
    }*/
    
    // OBTENER CONEXIÓN
    public Connection getConexion() throws SQLException{
        if(conexion == null){
            conexion = DriverManager
                .getConnection(url + "?useLegacyDatetimeCode=false&serverTimezone=UTC"
                        + "&user=" + usuario + "&password=" + password);
        }
        return conexion;
    }
}
