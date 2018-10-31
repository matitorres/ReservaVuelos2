/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesData;

import clases.Asiento;
import clases.Ciudad;
import clases.Vuelo;
import conexion.Conexion;
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
    
    public VueloData(){}
        
    public void altaVuelo(Vuelo vuelo, Asiento asiento) throws SQLException {
            // Crea nuevo vuelo
            String sql = "INSERT INTO vuelo (aerolinea, tipoAeronave, idCiudadOrigen, idCiudadDestino, fechaSalida, fechaArribo, estado) VALUES ( ? , ? , ? , ? , ? , ? , ? );";
            PreparedStatement statement = Conexion.getConexion().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, vuelo.getAerolinea());
            statement.setString(2, vuelo.getTipoAeronave());
            statement.setInt(3, vuelo.getCiudadOrigen().getIdCiudad());
            statement.setInt(4, vuelo.getCiudadDestino().getIdCiudad());
            java.sql.Timestamp salida = new java.sql.Timestamp(vuelo.getFechaSalida().getTime());
            statement.setTimestamp(5, salida);
            java.sql.Timestamp arribo = new java.sql.Timestamp(vuelo.getFechaArribo().getTime());
            statement.setTimestamp(6, arribo);
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
            
            PreparedStatement statement2 = Conexion.getConexion().prepareStatement(sql2, Statement.RETURN_GENERATED_KEYS);
            for(int i=0;i<vuelo.getAsientos().size();i++) {
                statement2.setInt(1, rs.getInt(1));
                statement2.setString(2, vuelo.getAsientos().get(i).getCodigoAsiento());
                statement2.setFloat(3, vuelo.getAsientos().get(i).getPrecio());
                statement2.setBoolean(4, true);
                statement2.executeUpdate();
            }
            
            statement.close();
            statement2.close();
    }
    public void bajaVuelo(int id) throws SQLException {
            String sql = "DELETE FROM vuelo WHERE idVuelo = ? ;";
            PreparedStatement statement = Conexion.getConexion().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
            statement.executeUpdate();
            statement.close();
    }
    public void modificarVuelo(Vuelo vuelo) throws SQLException {
            String sql = "UPDATE vuelo SET aerolinea = '"+vuelo.getAerolinea()+
                    "', tipoAeronave = '"+vuelo.getTipoAeronave()+
                    "', idCiudadOrigen = '"+vuelo.getCiudadOrigen().getIdCiudad()+
                    "', idCiudadDestino = '"+vuelo.getCiudadDestino().getIdCiudad()+
                    "', fechaSalida = '"+new java.sql.Timestamp(vuelo.getFechaSalida().getTime())+
                    "', fechaArribo = '"+new java.sql.Timestamp(vuelo.getFechaArribo().getTime())+
                    "', estado = '"+vuelo.getEstado()+
                    "' WHERE idVuelo = '"+vuelo.getIdVuelo()+"';";
            PreparedStatement statement = Conexion.getConexion().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.executeUpdate();
            statement.close();
    }
    public Vuelo buscarVuelo(int id){
        Vuelo vuelo = new Vuelo();
        Ciudad ciudadOrigen = new Ciudad();
        Ciudad ciudadDestino = new Ciudad();
        try {
            String sql = "SELECT * FROM vuelo WHERE idVuelo = "+id+";";
            PreparedStatement statement = Conexion.getConexion().prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while(rs.next()) {
                vuelo.setIdVuelo(rs.getInt("idVuelo"));
                vuelo.setAerolinea(rs.getString("aerolinea"));
                vuelo.setTipoAeronave(rs.getString("tipoAeronave"));
                ciudadOrigen.setIdCiudad(rs.getInt("idCiudadOrigen"));
                vuelo.setCiudadOrigen(ciudadOrigen);
                ciudadDestino.setIdCiudad(rs.getInt("idCiudadDestino"));
                vuelo.setCiudadDestino(ciudadDestino);
                vuelo.setFechaSalida(rs.getTimestamp("fechaSalida"));
                vuelo.setFechaArribo(rs.getTimestamp("fechaArribo"));
                vuelo.setEstado(rs.getString("estado"));
            }
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al buscar vuelo: " + ex.getMessage());
        }
        return vuelo;
    }
    public List<Vuelo> obtenerVuelos(){
        List<Vuelo> vuelos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM vuelo;";
            PreparedStatement statement = Conexion.getConexion().prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            Vuelo vuelo;
            while(rs.next()){
                vuelo = new Vuelo();
                Ciudad ciudadOrigen = new Ciudad();
                Ciudad ciudadDestino = new Ciudad();
                vuelo.setIdVuelo(rs.getInt("idVuelo"));
                vuelo.setAerolinea(rs.getString("aerolinea"));
                vuelo.setTipoAeronave(rs.getString("tipoAeronave"));
                ciudadOrigen.setIdCiudad(rs.getInt("idCiudadOrigen"));
                vuelo.setCiudadOrigen(ciudadOrigen);
                ciudadDestino.setIdCiudad(rs.getInt("idCiudadDestino"));
                vuelo.setCiudadDestino(ciudadDestino);
                vuelo.setFechaSalida(rs.getTimestamp("fechaSalida"));
                vuelo.setFechaArribo(rs.getTimestamp("fechaArribo"));
                vuelo.setEstado(rs.getString("estado"));
                vuelos.add(vuelo);
            }
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener vuelos: " + ex.getMessage());
        }
        return vuelos;
    }
}
