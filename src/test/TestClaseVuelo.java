/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;


import clasesData.VueloData;
import conexion.Conexion;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus pc
 */
public class TestClaseVuelo {
    public static void main(String[] args) throws SQLException, ClassNotFoundException{        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Conexion conexion = new Conexion();
            VueloData vueloData = new VueloData(conexion);
            
            /*Ciudad ciudadOrigen = new Ciudad(7);
            Ciudad ciudadDestino = new Ciudad(8);
            Vuelo vuelo = new Vuelo("LATAM", "Boeing 767", ciudadOrigen, ciudadDestino, LocalDate.now(), LocalDate.now(), "n");
            Asiento asiento = new Asiento(3500f);
            vueloData.altaVuelo(vuelo, asiento);*/
            
            /*vueloData.bajaVuelo(1);*/
            
            /*Ciudad ciudadOrigen = new Ciudad(1);
            Ciudad ciudadDestino = new Ciudad(6);
            Vuelo vuelo = new Vuelo(9,"LATAM", "Airbus A340", ciudadOrigen, ciudadDestino, LocalDate.now(), LocalDate.now(), "n");
            vueloData.modificarVuelo(vuelo);*/
            
            /*Vuelo vuelo = vueloData.buscarVuelo(9);
            System.out.println("|| "+vuelo.getIdVuelo());
            System.out.println("|| "+vuelo.getAerolinea()+" - "+vuelo.getTipoAeronave());
            System.out.println("|| idOrigen: "+vuelo.getCiudadOrigen().getIdCiudad()+" - idDestino: "+vuelo.getCiudadDestino().getIdCiudad());
            System.out.println("|| estado: "+vuelo.getEstado());*/
            
            /*List<Vuelo> vuelos = vueloData.obtenerVuelos();
            for(int i = 0; i < vuelos.size(); i++){
                System.out.println("");
                System.out.println("======================== "+vuelos.get(i).getIdVuelo()+" ==========================");
                System.out.println("|| "+vuelos.get(i).getAerolinea()+" - "+vuelos.get(i).getTipoAeronave());
                System.out.println("|| idOrigen: "+vuelos.get(i).getCiudadOrigen().getIdCiudad()+" - idDestino: "+vuelos.get(i).getCiudadDestino().getIdCiudad());
                System.out.println("|| estado: "+vuelos.get(i).getEstado());
                System.out.println("=====================================================");
            }*/
            
        } catch (ClassNotFoundException ex) {
           
        }
    }
}
