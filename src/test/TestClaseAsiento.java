/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;


import clasesData.AsientoData;
import conexion.Conexion;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus pc
 */
public class TestClaseAsiento {
    public static void main(String[] args) throws SQLException, ClassNotFoundException{        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Conexion conexion = new Conexion();
            AsientoData asientoData = new AsientoData(conexion);
            
            /*Vuelo vuelo = new Vuelo(11);
            Asiento asiento = new Asiento(vuelo, "P016", 1500f, true);
            asientoData.guardarAsiento(asiento);*/
            
            /*asientoData.borrarAsiento(220);*/
            
            /*Vuelo vuelo = new Vuelo(13);
            Asiento asiento = new Asiento(219, vuelo, "P015", 3500f, false);
            asientoData.actualizarAsiento(asiento);*/
            
            /*Asiento asiento = asientoData.buscarAsiento(219);
            System.out.println("|| "+asiento.getIdAsiento());
            System.out.println("|| idVuelo: "+asiento.getVuelo().getIdVuelo());
            System.out.println("|| precio: "+asiento.getPrecio());
            System.out.println("|| disponible: "+asiento.getDisponible());*/
            
            /*List<Asiento> asientos = asientoData.obtenerAsientos();
            for(int i = 0; i < asientos.size(); i++){
                System.out.println("");
                System.out.println("======================== "+asientos.get(i).getIdAsiento()+" ==========================");
                System.out.println("|| idVuelo: "+asientos.get(i).getVuelo().getIdVuelo());
                System.out.println("|| precio: "+asientos.get(i).getPrecio());
                System.out.println("|| disponible: "+asientos.get(i).getDisponible());
                System.out.println("=====================================================");
            }*/
            
        } catch (ClassNotFoundException ex) {
           
        }
    }
}
