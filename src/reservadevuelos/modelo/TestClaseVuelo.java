/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservadevuelos.modelo;

import java.sql.SQLException;
import java.time.LocalDate;
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
            
            Vuelo vuelo = new Vuelo("Emirates", "Boeing 747", 1, 2, LocalDate.now(), LocalDate.now(), "n");
            vueloData.altaVuelo(vuelo);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(reservadevuelos.modelo.TestClaseVuelo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
