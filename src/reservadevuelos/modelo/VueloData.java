/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoabasededatos.modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author asus pc
 */
public class VueloData {
    
    // ATRIBUTOS
    private Connection connection = null;
    private Conexion conexion;

    // CONSTRUCTOR
    public VueloData(Conexion conexion) {
     this.conexion=conexion;
          connection = conexion.getConexion();
    }
    
    // MÉTODOS
    public void altaVuelo(Vuelo vuelo){
        try {
            // Crea nuevo vuelo
            String sql = "INSERT INTO vuelo (aerolinea, tipoAeronave,idCiudadOrigen, idCiudadDestino,fechaSalida,fechaArribo, estado) VALUES ( ? , ? , ? , ? , ? , ? , ? );";

            PreparedStatement statement = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, vuelo.getAerolinea());
            statement.setString(2, vuelo.getTipoAeronave());
            statement.setInt(3, vuelo.getCiudadOrigen());
            statement.setInt(4, vuelo.getCiudadDestino());
            statement.setDate(5, Date.valueOf(vuelo.getSalida()));
            statement.setDate(6, Date.valueOf(vuelo.getArribo()));
            statement.setString(7, vuelo.getEstado());
            
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                vuelo.setIdVuelo(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar un vuelo");
            }
            statement.close();
             
           
        } catch (SQLException ex) {
            System.out.println("Error al insertar vuelo: " + ex.getMessage());
        }
    }
}