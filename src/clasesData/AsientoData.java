/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesData;

import clases.Asiento;
import clases.Vuelo;
import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabriel
 */
public class AsientoData {    
     
    public AsientoData() {}

    public void guardarAsiento(Asiento asiento){
        try {
            
            String sql = "INSERT INTO asiento (idVuelo, ubicacion, precio, disponible) VALUES ( ? , ? , ? , ? );";

            PreparedStatement statement = Conexion.getConexion().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            statement.setInt(1, asiento.getVuelo().getIdVuelo());
            statement.setString(2, asiento.getCodigoAsiento());
            statement.setFloat(3, asiento.getPrecio());
            statement.setBoolean(4, asiento.getDisponible());
            
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                asiento.setIdAsiento(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar el Asiento");
            }
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un Asiento: " + ex.getMessage());
        }
    }   
    public void borrarAsiento(int id){
    try {
            
            String sql = "DELETE FROM asiento WHERE idAsiento =?;";

            PreparedStatement statement = Conexion.getConexion().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
                       
            statement.executeUpdate();
              //System.out.println(statement.executeUpdate()); Para saber que tipo de valor devuelve 
                           
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al Eliminar una Asiento " + ex.getMessage());
        }
        
    
    }
    public Asiento buscarAsiento(int id){
            Asiento asiento=null;
            Vuelo vuelo = new Vuelo();
    try {
            
            String sql = "SELECT * FROM asiento WHERE idAsiento =?;";

            PreparedStatement statement = Conexion.getConexion().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
           
            
            ResultSet resultSet=statement.executeQuery();
            
            while(resultSet.next()){
                asiento = new Asiento();
                asiento.setIdAsiento(resultSet.getInt("idAsiento"));
                vuelo.setIdVuelo(resultSet.getInt("idVuelo"));
                asiento.setVuelo(vuelo);
                asiento.setCodigoAsiento(resultSet.getString("ubicacion"));
                asiento.setPrecio(resultSet.getFloat("precio"));
                asiento.setDisponible(resultSet.getBoolean("disponible"));
             }      
            statement.close();
                
        } catch (SQLException ex) {
            System.out.println("Error al buscar un Asiento: " + ex.getMessage());
        }
        
        return asiento;
    }     
    public Asiento buscarAsientoPorVuelo(Vuelo vuelo){
            Asiento asiento=null;
    try {
            
            String sql = "SELECT * FROM asiento WHERE idVuelo =?;";

            PreparedStatement statement = Conexion.getConexion().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, vuelo.getIdVuelo());
           
            
            ResultSet resultSet=statement.executeQuery();
            
            while(resultSet.next()){
                asiento = new Asiento();
                asiento.setIdAsiento(resultSet.getInt("idAsiento"));
                asiento.setVuelo(vuelo);
                asiento.setCodigoAsiento(resultSet.getString("ubicacion"));
                asiento.setPrecio(resultSet.getFloat("precio"));
                asiento.setDisponible(resultSet.getBoolean("disponible"));
             }      
            statement.close();
                
        } catch (SQLException ex) {
            System.out.println("Error al buscar un Asiento: " + ex.getMessage());
        }
        
        return asiento;
    }
    public void actualizarAsiento(Asiento asiento){
    
        try {
            
            String sql = "UPDATE asiento SET idVuelo = ? , ubicacion =?, precio=?, disponible=? WHERE idAsiento = ?;";

            PreparedStatement statement = Conexion.getConexion().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            statement.setInt(1, asiento.getVuelo().getIdVuelo());
            statement.setString(2, asiento.getCodigoAsiento());
            statement.setFloat(3, asiento.getPrecio());
            statement.setBoolean(4, asiento.getDisponible());
            statement.setInt(5, asiento.getIdAsiento());
            statement.executeUpdate();
                    
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error ACTUALIZAR el Asiento : " + ex.getMessage());
        }
    
    }
    public List<Asiento> obtenerAsientos(){
        List<Asiento> asientos = new ArrayList<Asiento>();
            
        try {
            String sql = "SELECT * FROM asiento;";
            PreparedStatement statement = Conexion.getConexion().prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Asiento asiento;
            while(resultSet.next()){
                asiento = new Asiento();
                Vuelo vuelo = new Vuelo();
                asiento.setIdAsiento(resultSet.getInt("idAsiento"));
                vuelo.setIdVuelo(resultSet.getInt("idVuelo"));
                asiento.setVuelo(vuelo);
                asiento.setCodigoAsiento(resultSet.getString("ubicacion"));
                asiento.setPrecio(resultSet.getFloat("precio"));
                asiento.setDisponible(resultSet.getBoolean("disponible"));
                
                asientos.add(asiento);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los Asientos: " + ex.getMessage());
        }
        
        
        return asientos;
    }
    public Asiento obtenerAsientosVueloUbicacion(Vuelo vuelo, String ubicacion) {
        Asiento asiento = new Asiento();;
        try {
            String sql = "SELECT * FROM asiento WHERE idVuelo="+vuelo.getIdVuelo()+" AND ubicacion = '"+ubicacion+"';";
            PreparedStatement statement = Conexion.getConexion().prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                asiento.setIdAsiento(resultSet.getInt("idAsiento"));
                asiento.setVuelo(vuelo);
                asiento.setCodigoAsiento(resultSet.getString("ubicacion"));
                asiento.setPrecio(resultSet.getFloat("precio"));
                asiento.setDisponible(resultSet.getBoolean("disponible"));
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los Asientos: " + ex.getMessage());
        }
        return asiento;
    }
}
