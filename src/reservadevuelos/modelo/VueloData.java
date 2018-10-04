/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservadevuelos.modelo;

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

    // CONSTRUCTOR
    public VueloData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion"
                    + ex.getMessage());
        }
    }
    
    // MÉTODOS
    public void altaVuelo(Vuelo vuelo){
        try {
            // Crea nuevo vuelo
            String sql = "INSERT INTO vuelo (aerolinea, tipoAeronave,"
                    + "idCiudadOrigen, idCiudadDestino, fechaSalida,"
                    + "fechaArribo, estado)"
                    + "VALUES ( ? , ? , ? , ? , ? , ? , ? );";

            PreparedStatement statement = connection.prepareStatement(sql,
                    Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, vuelo.getAerolinea());
            statement.setString(2, vuelo.getTipoAeronave());
            statement.setInt(3, vuelo.getCiudadOrigen());
            statement.setInt(4, vuelo.getCiudadDestino());
            statement.setDate(5, Date.valueOf(vuelo.getSalida()));
            statement.setDate(6, Date.valueOf(vuelo.getArribo()));
            statement.setString(3, vuelo.getEstado());
            
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                vuelo.setIdVuelo(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar"
                        + "un vuelo");
            }
            statement.close();
            
            
            // Crea los asientos para ese vuelo
            String sql2 = "INSERT INTO asiento (idVuelo, ubicación, precio,"
                    + "disponible) VALUES ( ? , ? , ? , ? );";
            
            PreparedStatement statement2 = connection.prepareStatement(sql2,
                    Statement.RETURN_GENERATED_KEYS);
            
            for(int i=1;i<=vuelo.getAsientos().size();i++) {
                statement2.setInt(1, rs.getInt(1));
                statement2.setString(2, vuelo.getTipoAeronave());
                statement2.setFloat(3, 33.33f); // No sé cómo hacer acá
                statement2.setBoolean(4, true);
                statement2.executeUpdate();
            }
            
            statement2.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al insertar vuelo: " + ex.getMessage());
        }
    }
}
