/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesData;


import clases.Ciudad;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;



/**
 *
 * @author Pamela
 */
public class CiudadData {
    
    // ATRIBUTOS
     private List<Ciudad> listaCiudades;
     

    public CiudadData() {
        
        this.listaCiudades = new ArrayList<>();
        
        }
    
 public int guardarCiudad(Ciudad ciudad) throws SQLException {      
                String insertTableSQL = "INSERT INTO ciudad "
                + "(nombre, pais, vigencia) VALUES"
                + "(?,?,?)";
          int exito = 0;
     
        
           PreparedStatement prepared = Conexion.getConexion().prepareStatement(insertTableSQL);

            prepared.setString(1, ciudad.getNombre());
            prepared.setString(2, ciudad.getPais());
            prepared.setInt(3, ciudad.getVigencia());


            //  Ejecutamos el insert
           exito = prepared.executeUpdate();
           
           prepared.close();
           // Conexion.getConexion().close();
           return exito;
      
    }
public int modificarCiudad(Ciudad c) throws SQLException{
      int exito = 0;
   
     
      
          String consulta = "UPDATE ciudad " +
                    "SET nombre = '"+c.getNombre()+"', pais = '"+c.getPais()+"', vigencia='"+c.getVigencia()+"' where idCiudad= '"+c.getIdCiudad()+"'";
            
            
          PreparedStatement preparedStatement = Conexion.getConexion().prepareStatement(consulta);
          // con esta sentencia se insertan los datos en la base de datos
           exito = preparedStatement.executeUpdate();//valida si se guardaron los datos; si pst>0 entonces se guardaron
           preparedStatement.close();
           
           return exito;
  }
    public int borrarCiudad(int id) throws SQLException{
    int exito = 0;
      String consulta = "delete from ciudad WHERE `IdCiudad`=" + id;
        
            PreparedStatement preparedStatement = Conexion.getConexion().prepareStatement(consulta);
            exito = preparedStatement.executeUpdate();
             // SI EXITO ES MAYOR QUE 0 SIGINIFICA QUE EL DELETE FUE EXITOSO, ESTO SE CONTROLARA DESDE LA INTERFAZ GRAFICA
             
           preparedStatement.close();
           // Conexion.getConexion().close();
      return exito;
              
  }      
          public Ciudad getCiudad(int id) {
         // SERVIRA PARA NO REPETIR CIUDADES CON UN MISMO ID
        
         Ciudad p = new Ciudad() ;
        try {
            ResultSet resultSet = null;
            String consulta = "SELECT * FROM `ciudad` WHERE `idCiudad`=" + id;
           
            PreparedStatement preparedStatement = Conexion.getConexion().prepareStatement(consulta);
            resultSet = preparedStatement.executeQuery();
            if (resultSet != null && resultSet.next()) {
                 p = new Ciudad(resultSet.getInt("idCiudad"), resultSet.getString("nombre"), resultSet.getString("pais"), resultSet.getInt("vigencia"));
                resultSet.close();
            }
            
            //  Conexion.cerrarConexion();

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
            //mostrar el Error
        }
        return p;
    }
        public List getCiudades() {
        try {
          
            ResultSet resultSet = null;
            String consulta = "SELECT * FROM `ciudad`";
            
     
            PreparedStatement preparedStatement = Conexion.getConexion().prepareStatement(consulta);
            resultSet = preparedStatement.executeQuery();
            Ciudad p;
            if (resultSet != null) {
                while (resultSet.next()) {
                    p = new Ciudad(resultSet.getInt("idCiudad"), resultSet.getString("nombre"), resultSet.getString("pais"), resultSet.getInt("vigencia"));
                    this.listaCiudades.add(p);
                }
                resultSet.close();
            }
       

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
            //mostrar el Error
        }
        return this.listaCiudades;
    }  
}     
