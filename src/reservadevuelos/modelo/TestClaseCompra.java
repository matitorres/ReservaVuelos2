/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoabasededatos.modelo;

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
 

public class TestClaseCompra {
  public static void main(String[] args) throws SQLException  { //throws SQLException                     //argumentos variables del metodo main
   /* String url="jdbc:mysql://localhost/reservadevuelos";
    String usuario="root";
    String password="";*/
    PreparedStatement ps;
    
        
        try {
          Class.forName("org.mariadb.jdbc.Driver");
          //conexion=DriverManager.getConnection(url, usuario, password);
          
          
          Conexion conexion=new Conexion();//Creo la conexion
          CompraData compraData=new CompraData(conexion);//instancio un ClienteData
         
            //Codigo para Testear el ABM de la clase Compra
          
          
           //Instrucciones para Testear dar de Alta una Compra(guardarCompra()) 
           //----------------------------------------------------------- 
           //Compra compra=new Compra(2,1,LocalDate.now());//INSERT(sin id) Instancio una Compra sin id, para insertar
           //compraData.guardarCompra(compra);//INSERT LLamo a guardarCompra-> guarda en la base de datos
           //-----------------------------------------------------------           

           

            //Instrucciones para Testear actualizar una Compra(actualizarCompra()) 
           //----------------------------------------------------------- 
           Compra compra=new Compra(7,2,2,LocalDate.now());//UPDATE Instancio una Compra con id para hacer un UPDATE
           compraData.actualizarCompra(compra);//UPDATE
           //----------------------------------------------------------- 
           
           
           
         
          //BUSCAR COMPRA
          //---------------------------------------------- 
          /*Compra r=compraData.buscarCompra(7);
          
            System.out.println(r.getIdCompra()); 
            System.out.println(r.getIdAsiento());
            System.out.println(r.getIdCliente());
            System.out.println(r.getFechaCompra());  */
          //---------------------------------------------- 
          
          
          
          
          //DELETE Tengo que pasar un id registrado en la tabla
          //---------------------------------------------- 
          //compraData.borrarCompra(6);
          //---------------------------------------------- 
                   
 
         // OBTENER COMPRAS Este metodo todavia no esta testeado
         //---------------------------------------------- 
         // compraData.obtenerCompras();
         //---------------------------------------------- 
          
          
        
          
       //CONSULTA A BD
       //---------------------------------------------- 
       /*
         ps= conexion.getConexion().prepareStatement("SELECT * FROM compra");//
         ResultSet rs=ps.executeQuery();
         
         while(rs.next()){
            
       System.out.print("idCompra: ");System.out.println(rs.getInt(1));
       System.out.print("idAsiento: ");System.out.println(rs.getInt(2));
       System.out.print("idCliente: ");System.out.println(rs.getInt(3));
       System.out.print("fechaCompra: ");System.out.println(rs.getString(4)+" ");
       System.out.println("____________________");       
         }
         */
         // FIN CONSULTA 
                
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestClaseCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
}
