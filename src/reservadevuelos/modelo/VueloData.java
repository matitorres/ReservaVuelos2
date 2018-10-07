/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservadevuelos.modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asus pc
 */
public class VueloData {
    private Connection db = null;
    private Conexion conexion;
    public VueloData(Conexion conexion){
        this.conexion = conexion;
        db = conexion.getConexion();
    }
    
    
    public void altaVuelo(Vuelo vuelo, Asiento asiento){
        try {
            // Crea nuevo vuelo
            String sql = "INSERT INTO vuelo (aerolinea, tipoAeronave, idCiudadOrigen, idCiudadDestino, fechaSalida, fechaArribo, estado) VALUES ( ? , ? , ? , ? , ? , ? , ? );";
            PreparedStatement statement = db.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, vuelo.getAerolinea());
            statement.setString(2, vuelo.getTipoAeronave());
            statement.setInt(3, vuelo.getCiudadOrigen().getIdCiudad());
            statement.setInt(4, vuelo.getCiudadDestino().getIdCiudad());
            statement.setDate(5, Date.valueOf(vuelo.getFechaSalida()));
            statement.setDate(6, Date.valueOf(vuelo.getFechaArribo()));
            statement.setString(7, vuelo.getEstado());
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                vuelo.setIdVuelo(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar un vuelo");
            }
            
            // Crea los asientos para ese vuelo
            vuelo.setAsientos(asiento);
            
            String sql2 = "INSERT INTO asiento (idVuelo, ubicacion, precio,"
                    + "disponible) VALUES ( ? , ? , ? , ? );";
            
            PreparedStatement statement2 = db.prepareStatement(sql2, Statement.RETURN_GENERATED_KEYS);
            for(int i=0;i<vuelo.getAsientos().size();i++) {
                statement2.setInt(1, rs.getInt(1));
                statement2.setString(2, vuelo.getAsientos().get(i).getCodigoAsiento());
                statement2.setFloat(3, vuelo.getAsientos().get(i).getPrecio());
                statement2.setBoolean(4, true);
                statement2.executeUpdate();
            }
            
            statement.close();
            statement2.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al insertar vuelo: " + ex.getMessage());
        }
    }
    
    
    public void bajaVuelo(int id){
        try {
            String sql = "DELETE FROM vuelo WHERE idVuelo = ? ;";
            PreparedStatement statement = db.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al eliminar vuelo: " + ex.getMessage());
        }
    }
    
    
    public void modificarVuelo(Vuelo vuelo){
        try {
            String sql = "UPDATE vuelo SET aerolinea = '"+vuelo.getAerolinea()+
                    "', tipoAeronave = '"+vuelo.getTipoAeronave()+
                    "', idCiudadOrigen = '"+vuelo.getCiudadOrigen().getIdCiudad()+
                    "', idCiudadDestino = '"+vuelo.getCiudadDestino().getIdCiudad()+
                    "', fechaSalida = '"+vuelo.getFechaSalida()+
                    "', fechaArribo = '"+vuelo.getFechaArribo()+
                    "', estado = '"+vuelo.getEstado()+
                    "' WHERE idVuelo = '"+vuelo.getIdVuelo()+"';";
            PreparedStatement statement = db.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al eliminar vuelo: " + ex.getMessage());
        }
    }
    
    
    public Vuelo buscarVuelo(int id){
        Vuelo vuelo = new Vuelo();
        Ciudad ciudadOrigen = new Ciudad();
        Ciudad ciudadDestino = new Ciudad();
        try {
            String sql = "SELECT * FROM vuelo WHERE idVuelo = "+id+";";
            PreparedStatement statement = db.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while(rs.next()) {
                vuelo.setIdVuelo(rs.getInt("idVuelo"));
                vuelo.setAerolinea(rs.getString("aerolinea"));
                vuelo.setTipoAeronave(rs.getString("tipoAeronave"));
                ciudadOrigen.setIdCiudad(rs.getInt("idCiudadOrigen"));
                vuelo.setCiudadOrigen(ciudadOrigen);
                ciudadDestino.setIdCiudad(rs.getInt("idCiudadDestino"));
                vuelo.setCiudadDestino(ciudadDestino);
                vuelo.setFechaSalida(rs.getDate("fechaSalida").toLocalDate());
                vuelo.setFechaArribo(rs.getDate("fechaArribo").toLocalDate());
                vuelo.setEstado(rs.getString("estado"));
            }
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al eliminar vuelo: " + ex.getMessage());
        }
        return vuelo;
    }
    
    
    public List<Vuelo> obtenerVuelos(){
        List<Vuelo> vuelos = new ArrayList<Vuelo>();
        Ciudad ciudadOrigen = new Ciudad();
        Ciudad ciudadDestino = new Ciudad();
        try {
            String sql = "SELECT * FROM vuelo;";
            PreparedStatement statement = db.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            Vuelo vuelo;
            while(rs.next()){
                vuelo = new Vuelo();
                vuelo.setIdVuelo(rs.getInt("idVuelo"));
                vuelo.setAerolinea(rs.getString("aerolinea"));
                vuelo.setTipoAeronave(rs.getString("tipoAeronave"));
                ciudadOrigen.setIdCiudad(rs.getInt("idCiudadOrigen"));
                vuelo.setCiudadOrigen(ciudadOrigen);
                ciudadDestino.setIdCiudad(rs.getInt("idCiudadDestino"));
                vuelo.setCiudadDestino(ciudadDestino);
                vuelo.setFechaSalida(rs.getDate("fechaSalida").toLocalDate());
                vuelo.setFechaArribo(rs.getDate("fechaArribo").toLocalDate());
                vuelo.setEstado(rs.getString("estado"));
                vuelos.add(vuelo);
            }
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al eliminar vuelo: " + ex.getMessage());
        }
        return vuelos;
    }
}
