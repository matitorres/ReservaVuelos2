/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservadevuelos.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pamela
 */
public class CiudadData {
    
    // ATRIBUTOS
     private Connection connection;
     private Conexion conexion;

    public CiudadData(Conexion conexion) {
        try {
            this.conexion=conexion;
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
        }
    
        public void guardarCiudad(Ciudad ciudad){
        try {
            
            String sql = "INSERT INTO ciudad (idCiudad, String nombre, String pais, int vigencia) VALUES ( ? , ? , ? , ? );";

    PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, ciudad.getCiudad());
            statement.setString(2, ciudad.getNombre());
            statement.setString(3, ciudad.getPais());
            statement.setInt(4, ciudad.getVigencia());
            
     statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();       
            if (rs.next()) {
                ciudad.setIdCiudad (rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar una ciudad");
            }
            statement.close();
        
        } catch (SQLException ex) { 
             Logger.getLogger(CiudadData.class.getName()).log(Level.SEVERE, null, ex);
         } 
}
        public List<Ciudad> obtenerCiudades(){
        List<Ciudad> ciudades = new ArrayList<Ciudad>();
        
        try {
            String sql = "SELECT * FROM ciudades;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Ciudad ciudades;
            while(resultSet.next()){
                ciudad = new Ciudad();
                ciudad.setId(resultSet.getInt("id"));
                ciudad.setNombreCiudad(resultSet.getString("nombre"));
                ciudades.add(ciudad);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las ciudades: " + ex.getMessage());
        }
            return ciudades;
        } 

            public Ciudad buscarCiudad(int id){
    
        CiudadData ad=new CiudadData(conexion);
        
        return ad.buscarCiudad(id);
        
    }
 }


