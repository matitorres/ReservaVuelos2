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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
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
    
     public List<Vuelo> ejecutarConsulta(String sql) throws SQLException{
      List<Vuelo> vuelos = new ArrayList<>();
      Vuelo vuelo; 
             PreparedStatement statement = Conexion.getConexion().prepareStatement(sql);
             ResultSet rs = statement.executeQuery();
             while(rs.next()) {
                vuelo=new Vuelo();
                Ciudad ciudadOrigen = new Ciudad();
                Ciudad ciudadDestino = new Ciudad();
                vuelo.setIdVuelo(rs.getInt("idVuelo"));
                vuelo.setAerolinea(rs.getString("aerolinea"));
                vuelo.setTipoAeronave(rs.getString("tipoAeronave"));
                ciudadOrigen.setIdCiudad(rs.getInt("idCiudadOrigen"));
                ciudadOrigen.setNombre(rs.getString("nombre"));
                ciudadOrigen.setPais(rs.getString("pais"));
                ciudadOrigen.setVigencia(rs.getBoolean("vigencia")); //con estevalor debo verificar si esta vigente la ciudad
                vuelo.setCiudadOrigen(ciudadOrigen);
                
                ciudadDestino.setIdCiudad(rs.getInt("idCiudadDestino"));
                ciudadDestino.setNombre(rs.getString("nombre"));
                ciudadDestino.setPais(rs.getString("pais"));
                ciudadDestino.setVigencia(rs.getBoolean("vigencia")); //con estevalor debo verificar si esta vigente la ciudad
                vuelo.setCiudadDestino(ciudadDestino);
                vuelo.setFechaSalida(rs.getTimestamp("fechaSalida"));
                vuelo.setFechaArribo(rs.getTimestamp("fechaArribo"));
                vuelo.setEstado(rs.getString("estado"));
                vuelos.add(vuelo);
            }
            statement.close();
            return vuelos;
    }
    
    //Obtener vuelos disponibles en la base de datos
     public List<Vuelo> obtenerVuelosDisponiblesEnBD(){
        List<Vuelo> vuelos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM vuelo where estado='n' AND fechaSalida > CURDATE();";
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
    
    //fin obtenervuelos disponibles en base de taos
    
    
    //Agrego este metodo, para poder buscar vuelos por preferencias del usuario(Origen, Destino, Salida)
    
    public List<Vuelo> obtenerVuelosPorPreferencia(String nombreCiudadOrigen,String nombreCiudadDestino,Timestamp fechaSalida,Timestamp fechaVuelta){
          List<Vuelo> vuelos = new ArrayList<>();
           String sql;
           
           
        try{
               if (  ((nombreCiudadOrigen!=null) && (!nombreCiudadOrigen.isEmpty())) &&
                   ((nombreCiudadDestino!=null) && (!nombreCiudadDestino.isEmpty())) &&
                   ((fechaSalida!=null) && (!fechaSalida.toString().isEmpty()))   ){
                     sql="SELECT *\n" +
                     "FROM vuelo,ciudad cO, ciudad cD\n" +
                     "WHERE vuelo.idCiudadOrigen=cO.idCiudad\n" +
                     "AND vuelo.idCiudadDestino=cD.idCiudad \n" +
                     "AND cO.nombre \n" +
                     "LIKE '%"+nombreCiudadOrigen+"%'\n" +
                     "AND cD.nombre \n" +
                     "LIKE '%"+nombreCiudadDestino+"%'\n" +
                     "AND vuelo.estado='n' \n"+        
                     "AND (vuelo.fechaSalida > CURDATE()" +
                     "AND vuelo.fechaSalida BETWEEN '"+fechaSalida+"' AND '"+fechaVuelta+"'  )\n";
                     vuelos=ejecutarConsulta(sql);
                     System.out.println(sql);
                    
            }else{   sql="SELECT *"
                     + "FROM vuelo, ciudad cO, ciudad cD "
                     + "WHERE vuelo.idCiudadOrigen=cO.idCiudad "
                     + "AND vuelo.idCiudadDestino=cD.idCiudad "      
                     + "AND vuelo.estado='n'";
                     
                     if ((nombreCiudadOrigen!=null) && (!nombreCiudadOrigen.isEmpty())){
                     sql=sql+" AND cO.nombre LIKE '%"+nombreCiudadOrigen+"%'";
                     }else {sql=sql+"";}
            
                      if ((nombreCiudadDestino!=null) && (!nombreCiudadDestino.isEmpty())){
                      sql=sql+" AND cD.nombre LIKE '%"+nombreCiudadDestino+"%'";
                      }else {sql=sql+""; }
             
                      if ((fechaSalida!=null &&  fechaVuelta!=null)) {
                       // ts tiene la fecha en type timestamp con esta comparo la fecha de la base de datos
                      sql=sql +" AND (vuelo.fechaSalida >= CURDATE()"
                            + " AND vuelo.fechaSalida BETWEEN '"+fechaSalida+"' AND '"+fechaVuelta+"');\n";
                      // System.out.println(new SimpleDateFormat("dd/MM/yyy HH:mm").format(fechaSalida)); //formateo la fecha para mostrarla por pantalla
                      //vuelos=ejecutarConsulta(sql);
                      }else {sql=sql+"AND vuelo.fechaSalida > CURDATE()"; }
                                            
                      
                      vuelos=ejecutarConsulta(sql);
                      System.out.println(sql);
                 }//fin else  
                    
         } catch (SQLException ex) {
            System.out.println("Error al buscar vuelo: " + ex.getMessage());
           } 
        return vuelos;
 }
    
    
    
    
    
    public List<String> obtenerMailClientesVuelo(Vuelo vuelo) {
        List<String> mails = new ArrayList<>();
        try {
            String sql = "SELECT mail FROM cliente, compra, asiento WHERE cliente.idCliente = compra.idCliente AND asiento.idAsiento = compra.idAsiento AND asiento.idVuelo ="+vuelo.getIdVuelo()+";";
            PreparedStatement statement = Conexion.getConexion().prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                mails.add(rs.getString("mail"));
            }
        } catch (SQLException ex) {
            System.out.println("Error al obtener mails: " + ex.getMessage());
        }
        return mails;
    }
}
