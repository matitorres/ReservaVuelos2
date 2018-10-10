/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;


import clases.Ciudad;
import clasesData.CiudadData;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Pamela
 */
public class TestCiudad {
         public static void main(String[] args) throws SQLException{
             
             //PRUEBAS
             
             //PROBANDO INSERTAR UNA CIUDAD
             
             //CREAR UNA CIUDAD
            // Ciudad ciudad = new Ciudad(1,"Paris", "Francia", );
            // Ciudad ciudad2 = new Ciudad(1,"Estambul", "Suecia", true);
             
             //LA CARGAMOS EN LA BASE DE DATOS
            CiudadData gestor = new CiudadData();
           //  gestor.guardarCiudad(ciudad2);
             
             Ciudad ciudad3 = new Ciudad (5,"Paris", "Francia", 0);
             gestor.modificarCiudad(ciudad3);
             
             //BORRAR CIUDAD TOMA UN PARAMETRO DEL ID DE LA CIUDAD BORRAR.
             
             // gestor.borrarCiudad(4);
             
                      //
            //gestor.consultarCiudad(5);
            
            //Ciudad ciudad4 = gestor.getCiudad(3);
            
            //System.out.println(ciudad4.getNombre()+" "+ciudad4.getPais());
             
            //LISTA CIUDADES
            
            List<Ciudad> lista = gestor.getCiudades();
         
         int i= 0;
         while(i<lista.size()){
             
              System.out.println("Numero: "+i+"\n");
          
             System.out.println("Nombre : "+lista.get(i).getNombre()+"\n");
                System.out.println("Pais : "+lista.get(i).getPais()+"\n");
                   System.out.println("Vigencia : "+lista.get(i).getVigencia()+"\n");
            i++;
         }
   
}
}
