/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservadevuelos.controladores;


import java.sql.*;

public class Conexion{

    private Connection conexion = null;
    private String servidor = "localhost";
    private String database = "reservadevuelos";
    private String usuario = "root";
    private String password = "";
    private String url = "";
    private String query;
    private int id_insertado;

    public Conexion() {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            url = "jdbc:mysql://" + servidor + "/" + database;
            conexion = DriverManager.getConnection(url, usuario, password);
            System.out.println("Conexion a Base de Datos " + url + " . . . . .Ok");//MENSAJE QUE EXPRESA Q LA CONEXION FUEN EXITOSA

        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }

    public int getId_insertado() {
        return id_insertado;
    }


    public Connection cerrarConexion() {
        try {
            conexion.close();
            System.out.println("Cerrando conexion a " + url + " . . . . . Ok");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        conexion = null;
        return conexion;
    }

    public Connection getConexion() {
        return conexion;
    }

}