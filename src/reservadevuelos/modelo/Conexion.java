/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservadevuelos.modelo;

import java.sql.Connection;

/**
 *
 * @author asus pc
 */
public class Conexion {
    
    // ATRIBUTOSs
    
    private String url, usuario, password;
    private Connection conexion;
    
    // CONSTRUCTOR
    
    public Conexion(String url, String usuario, String password) throws ClassNotFoundException {
        this.url = url;
        this.usuario = usuario;
        this.password = password;
        Class.forName("org.mariadb.jdbc.Driver");
    }
    
    
}
