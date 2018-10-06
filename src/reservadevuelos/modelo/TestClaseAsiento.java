/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservadevuelos.modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;

import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
 

public class TestClaseAsiento {
  public static void main(String[] args) throws SQLException  { //throws SQLException                     //argumentos variables del metodo main
   /* String url="jdbc:mysql://localhost/reservadevuelos";
    String usuario="root";
    String password="";*/
    PreparedStatement ps;
    
        
        try {
          Class.forName("org.mariadb.jdbc.Driver");
          //conexion=DriverManager.getConnection(url, usuario, password);
          
          
          Conexion conexion=new Conexion();//Creo la conexion
          AsientoData asientoData=new AsientoData(conexion);//instancio un ClienteData
         
            //Codigo para Testear el ABM de la clase Asiento
          
          
           //Instrucciones para Testear dar de Alta un asiento(guardarAsiento()) 
           //----------------------------------------------------------- 
          // Asiento asiento=new Asiento(5,1,1,"P45",2450);//INSERT(sin id) Instancio un Asiento sin id, para insertar
           //asientoData.guardarAsiento(asiento);
           //-----------------------------------------------------------           

           

            //Instrucciones para Testear actualizar  
           //----------------------------------------------------------- 
           // Asiento asiento=new Asiento(1,5,1,1,"P44",2250);;//UPDATE Instancio una Compra con id para hacer un UPDATE
           // asientoData.actualizarAsiento(asiento);//UPDATE
           //----------------------------------------------------------- 
           
           
           
         
          //BUSCAR COMPRA
          //---------------------------------------------- 
         /* Asiento r=asientoData.buscarAsiento(2);
          
            System.out.println(r.getIdAsiento()); 
            System.out.println(r.getIdVuelo());
            System.out.println(r.getPasillo());
            System.out.println(r.getDisponible());
            System.out.println(r.getUbicacion());
            System.out.println(r.getPrecio());*/
            
            
          //---------------------------------------------- 
          
          
          
          
          //DELETE Tengo que pasar un id registrado en la tabla
          //---------------------------------------------- 
          //asientoData.borrarAsiento(3);
          //---------------------------------------------- 
                   
 
         // OBTENER Asientos Este metodo todavia no esta testeado
         //---------------------------------------------- 
         // asientoData.obtenerAsientos();
         //---------------------------------------------- 
          
          
        
          
       //CONSULTA A BD
       //---------------------------------------------- 
       
      /*   ps= conexion.getConexion().prepareStatement("SELECT * FROM asiento");//
         ResultSet rs=ps.executeQuery();
         
         while(rs.next()){
            
       System.out.print("idAsiento: ");System.out.println(rs.getInt(1));
       System.out.print("idVuelo: ");System.out.println(rs.getInt(2));
       System.out.print("Pasillo: ");System.out.println(rs.getInt(3));
       System.out.print("Disponible: ");System.out.println(rs.getInt(4));
       System.out.print("Ubicacion: ");System.out.println(rs.getString(5)+" ");
       System.out.print("Precio: $ ");System.out.println(rs.getDouble(6));
         
       System.out.println("____________________");       
         }
         */
         // FIN CONSULTA 
                
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestClaseCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
}
