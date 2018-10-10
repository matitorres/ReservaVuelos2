/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;


import clases.Cliente;
import clasesData.ClienteData;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author pedro
 */
public class TestCliente {
    
     public static void main(String[] args) throws SQLException{
         int exito= 0;
         ClienteData gestor = new ClienteData();
         
         // ################ INSERT DE UN CLIENTE ##################
         
         //EL CONTROL DE REPETIDOS, POR EJEMPLO QUE SE INSERTE CLIENTES CON EL MISMO DNI, SE HARA DESDE LA INTERFAZ GRAFICA
         
         // SE PONE ID= 1 POR DEFECTO, YA QUE ESTO LO GESTIONA LA BASE DE DATOS CON UN VALOR AUTOINCREMENTADO
        Cliente nuevo =   new Cliente(1, "Juan", "Ramirez", 32456888, "juanper@yahoo.com.ar", 34560097, 324235673);
        
        //HACEMOE EL ALTA
        exito = gestor.altaCliente(nuevo);
        if(exito >0){  // SI FUE MAYOR QUE CERO, LA CONSULTA FUE EXIOTSA
            System.out.println("Alta exitosa!");
        }
        else{
             System.out.println("Error al insertar cliente!");
        }
        
        /* ######## DELETE #############*/
     
        /* POR DNI DEL CLIENTE : PONEMOS EL DEL CLIENTE INGRESADO ANTERIORMENTE*/
      // LO DAMOS DE BAJA //
         gestor.bajaCliente(32456888); 
        
    
        
        /* UPDATE */
        
        /*¨pasamos como parametro un cliente cuyos datos fueron modificados, a excpecion de su DNI */
        
        //NUEVAMENTE LO INGRESAMOS  y luego lo modificamos por ejemplo su EMAIL Y SU NUMERO DE TARJETA
        
        nuevo =   new Cliente(1, "Juan", "Ramirez", 32456888, "juanper@yahoo.com.ar", 34560097, 324235673);
         
         // EN LA INTERFAZ SE BUSCARA ESTE CLIENTE POR DNI, Y SE MOSTRARAN TODOS SUS DATOS, PARA QUE EL ADMIN ELIJA Q DATOS MODIFICAR
         
         nuevo =   new Cliente(1, "Juan", "Ramirez", 32456888, "juan345@gmail.com", 34560097, 1111333355);
         
         
           gestor.altaCliente(nuevo);
           gestor.modificarCliente(nuevo);
           
           /* CONSULTA: CONSULTA DE UN CLIENTE PARTICULAR POR DNI, Y TBN CONSULTA DEL LISTADO DE CLIENTES ACTUALES */
           
           Cliente clienteConsultado = gestor.getCliente(32456888);
           
           System.out.println("Los datos del cliente consultado son:");
             System.out.println("Nombre : "+clienteConsultado.getNombre()+"\n");
                System.out.println("Apellido : "+clienteConsultado.getApellido()+"\n");
                   System.out.println("DNI : "+clienteConsultado.getDni()+"\n");
                      System.out.println("Email : "+clienteConsultado.getMail()+"\n");
                         System.out.println("Nro Pasaporte : "+clienteConsultado.getPasaporte()+"\n");
                            System.out.println("Nro Tarjeta : "+clienteConsultado.getTarjeta()+"\n"); 
                            
         /* CONSULTA DE TODOS LOS CLIENTES ACTUALES */
      
         List<Cliente> lista = gestor.getClientes();
         
         int i= 0;
         while(i<lista.size()){
             
              System.out.println("Numero: "+i+"\n");
          
             System.out.println("Nombre : "+lista.get(i).getNombre()+"\n");
                System.out.println("Apellido : "+lista.get(i).getApellido()+"\n");
                   System.out.println("DNI : "+lista.get(i).getDni()+"\n");
                      System.out.println("Email : "+lista.get(i).getMail()+"\n");
                         System.out.println("Nro Pasaporte : "+lista.get(i).getPasaporte()+"\n");
                            System.out.println("Nro Tarjeta : "+lista.get(i).getTarjeta()+"\n\n");
                            
                i++;            
         }
         
                         
                                           
           
           
        
        
        
     }
    
}
