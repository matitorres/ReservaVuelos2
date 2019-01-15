/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.*;

public class Conexion {

    private static Connection con;
    private static Conexion conexion = null;

    private String servidor = "localhost";
    private String baseDatos = "reservadevuelos";
    private String usuario = "root";
    private String password = "";

    private Conexion() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://" + servidor + "/" + baseDatos;
            con = DriverManager.getConnection(url, usuario, password);

        } catch (SQLException ex) {
            System.out.println("Error al al hacer la conexion");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al pasar nombre de driver");
        }
    }

    // DEVUELVO LA CONEXION Y CONTROLO QUE NO SE HAYA CREADO LA INSTANCIA, QUE SERA LA UNICA 
    //YA QUE EN CASO DE Q NO SEA NULL, O ESTE CERRADA O NO SEA VALIDA,  YA ESTARA CREADA Y SE RETORNARA
    public static Connection getConexion() {

        try {
            if (conexion == null || con.isClosed() || !con.isValid(0)) {
                conexion = new Conexion();
            }

        } catch (SQLException ex) {
            System.out.println("Fallo en getConexion\n");
        }

        return con;
    }

}
