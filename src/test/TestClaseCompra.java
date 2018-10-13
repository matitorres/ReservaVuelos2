/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import clases.Compra;
import clasesData.CompraData;
import clases.Asiento;
import clases.Cliente;
import clasesData.ClienteData;
import conexion.Conexion;
import java.sql.*;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import java.util.ArrayList;

  import java.text.SimpleDateFormat;

/**
 *
 * @author Gabriel
 */
 

public class TestClaseCompra {
  public static void main(String[] args) throws SQLException  { //throws SQLException                     //argumentos variables del metodo main
     int exito= 0;
         CompraData gestorCompra = new CompraData();
    PreparedStatement ps;
    
        
        try {
          Class.forName("com.mysql.jdbc.Driver");
          //conexion=DriverManager.getConnection(url, usuario, password);
               
            //Codigo para Testear el ABM de la clase Compra
          
          
           //Instrucciones para Testear dar de Alta una Compra(guardarCompra()) 
           //Asiento asiento=new Asiento();
           //asiento.setIdAsiento(1);
          // Cliente cliente=new Cliente();
           //cliente.setId(1);
          
           //Para guardar fecha con hora
          //java.util.Date date = new java.util.Date();
          // java.text.SimpleDateFormat fecha=new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
         //System.out.println( fecha.format(date));
          
           //----------------------------------------------------------- 
           //Compra compra=new Compra(asiento, cliente, LocalDate.now());  //INSERT(sin id) Instancio una Compra sin id, para insertar
        // gestorCompra.guardarCompra(compra);//INSERT LLamo a guardarCompra-> guarda en la base de datos
          
           //-----------------------------------------------------------           

         

          

            //Instrucciones para Testear actualizar una Compra(actualizarCompra()) 
           //----------------------------------------------------------- 
          // Compra compra=new Compra(13,asiento, cliente ,LocalDate.now());  //UPDATE Instancio una Compra con id para hacer un UPDATE
         // gestorCompra.actualizarCompra(compra);  //UPDATE
           //----------------------------------------------------------- 
           
           
           
         
          //BUSCAR COMPRA
          //---------------------------------------------- 
       /*   Compra r=gestorCompra.buscarCompra(19);
          
            System.out.println(r.getIdCompra()); 
            System.out.println(r.getAsiento().getIdAsiento());
            System.out.println(r.getCliente().getId());
            System.out.println(r.getFechaCompra()); */
          //---------------------------------------------- 
          
          
          
          
          //DELETE Tengo que pasar un id registrado en la tabla
          //---------------------------------------------- 
         // gestorCompra.borrarCompra(9);
          //---------------------------------------------- 
                   
 
         // OBTENER COMPRAS Este metodo
         //---------------------------------------------- 
         // gestorCompra.obtenerCompras();
           List<Compra> lista = gestorCompra. obtenerCompras();
         
         int i= 0;
         while(i<lista.size()){
             
              System.out.println("Numero: "+i+"\n");
          
             System.out.println("id : "+lista.get(i).getIdCompra()+"\n");
                System.out.println("idAsiento : "+lista.get(i).getAsiento().getIdAsiento()+"\n");
                   System.out.println("idCliente : "+lista.get(i).getCliente().getId()+"\n");
                      System.out.println("fechaCompra : "+lista.get(i).getFechaCompra()+"\n");
                       System.out.println("________________________________________");     
                i++;            
         }
         
         
         
         
         
         
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
         }*/
         
         // FIN CONSULTA 
                
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestClaseCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
}
