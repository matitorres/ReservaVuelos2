/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesData;



import clases.Asiento;
import clases.Ciudad;
import clases.Cliente;
import clases.Compra;
import clases.Vuelo;
import conexion.Conexion;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Date;

/**
 *
 * @author Gabriel
 */
public class CompraData {
                //Atributos
    private List listaCompras;
     
     //Constructores
      public CompraData() {
          this.listaCompras=new ArrayList<>();
       }

       public Compra getCompra(int id) { // Hay que revisar los parametros de compra pra la variable p
    // ESTE NOS SERVIRA PARA NO REPETIR CLIENTES CON EL MISMO DNI
        //ES DECIR Q EN CASO DE Q LA CONSULTA FRACASE SE QUEDARA POR DEFECO CON ESE DNI
         Compra compra = new Compra() ;
        try {
            ResultSet resultSet = null;
            String consulta = "SELECT * FROM `compra` WHERE `idCompra`=" + id;
           
            PreparedStatement preparedStatement = Conexion.getConexion().prepareStatement(consulta);
            resultSet = preparedStatement.executeQuery();
            if (resultSet != null && resultSet.next()) {
                
                 compra = new Compra(resultSet.getInt("idCompra"));
                resultSet.close();
            }
            
            //  db.cerrarConexion();

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());//mostrar el Error
        }
        return compra;
    }//Revisar este metodo falta completar


  public int modificarCompra(int idCompra, int nuevaTarjeta) throws SQLException{
      
      int exito = 0;
   
     
      
          String consulta = "UPDATE compra " +
                    "SET nroTarjeta = '"+nuevaTarjeta+"';";
            
          PreparedStatement preparedStatement = Conexion.getConexion().prepareStatement(consulta);// con esta sentencia se insertan los datos en la base de datos
           exito = preparedStatement.executeUpdate();//valida si se guardaron los datos; si pst>0 entonces se guardaron
           preparedStatement.close();
           
           return exito;
  }

       public int guardarCompra(Compra compra) throws SQLException{
            int exito;
            String sql = "INSERT INTO compra (idAsiento, idCliente, fechaCompra, nroTarjeta) VALUES ( ? , ? , ?, ? );";

            PreparedStatement statement = Conexion.getConexion().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, compra.getAsiento().getIdAsiento());
            statement.setInt(2, compra.getCliente().getId());
            statement.setTimestamp(3, (Timestamp) compra.getFechaCompra());
            
               statement.setInt(4, compra.getNroTarjeta());
            
            exito=statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                compra.setIdCompra(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar la Compra");
            }
            statement.close();
            return exito; 
        
    }
       
           public int borrarCompra(int id) throws SQLException{
            int exito;
            String sql = "DELETE FROM compra WHERE idCompra =?;";
            PreparedStatement statement = Conexion.getConexion().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
            exito=statement.executeUpdate();
              //System.out.println(statement.executeUpdate()); Para saber que tipo de valor devuelve 
            statement.close();
            return exito;   
           }
           
        public Compra buscarCompra(int id){
            DateFormat dateFormat;                
    Compra compra= new Compra();
    Asiento asiento=new Asiento();
    Cliente cliente=new Cliente();
    Vuelo vuelo=new Vuelo();
    Ciudad ciudadOrigen, ciudadDestino;
    Integer idCiudadOrigen, idCiudadDestino;
    try {   
            String sql = "SELECT * FROM compra,cliente,asiento,vuelo WHERE compra.idCliente=cliente.idCliente and compra.idAsiento=asiento.idAsiento and asiento.idVuelo=vuelo.idVuelo and idCompra =?;";
            PreparedStatement statement = Conexion.getConexion().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
            ResultSet resultSet=statement.executeQuery();
            
            while(resultSet.next()){
                           
                compra = new Compra();
                asiento = new Asiento();
                cliente = new Cliente();
                vuelo = new Vuelo();
                compra.setIdCompra(resultSet.getInt("idCompra"));
                asiento.setIdAsiento(resultSet.getInt("idAsiento"));
                vuelo.setIdVuelo(resultSet.getInt("idVuelo"));
                vuelo.setAerolinea(resultSet.getString("aerolinea"));
                vuelo.setTipoAeronave(resultSet.getString("tipoAeronave"));
                vuelo.setEstado(resultSet.getString("estado"));
                vuelo.setFechaSalida(resultSet.getTimestamp("fechaSalida"));
                vuelo.setFechaArribo(resultSet.getTimestamp("fechaArribo"));
                 
                
                idCiudadOrigen=resultSet.getInt("idCiudadOrigen");
                idCiudadDestino=resultSet.getInt("idCiudadDestino");
                //setear ciudadOrigen y CiudadDestino
                     ciudadOrigen = new Ciudad();
                     String sqlCiudad = "SELECT * FROM ciudad WHERE idCiudad =?;";
                     PreparedStatement statementCiudad = Conexion.getConexion().prepareStatement(sqlCiudad, Statement.RETURN_GENERATED_KEYS);
                     statementCiudad.setInt(1, idCiudadOrigen);
                     ResultSet resultSetCiudad=statementCiudad.executeQuery();
            
                     while(resultSetCiudad.next()){
                         ciudadOrigen.setNombre(resultSetCiudad.getString("nombre"));
                         ciudadOrigen.setPais(resultSetCiudad.getString("pais"));
                         ciudadOrigen.setVigencia(resultSetCiudad.getBoolean("vigencia"));
                     }      
                       statementCiudad.close();
                       sqlCiudad="";
                       resultSetCiudad=null;
                     
                       
                     vuelo.setCiudadOrigen(ciudadOrigen);
                
                     ciudadDestino = new Ciudad();
                     sqlCiudad = "SELECT * FROM ciudad WHERE idCiudad =?;";
                     statementCiudad = Conexion.getConexion().prepareStatement(sqlCiudad, Statement.RETURN_GENERATED_KEYS);
                     statementCiudad.setInt(1, idCiudadDestino);
                     resultSetCiudad=statementCiudad.executeQuery();
            
                     while(resultSetCiudad.next()){
                         ciudadDestino.setNombre(resultSetCiudad.getString("nombre"));
                         ciudadDestino.setPais(resultSetCiudad.getString("pais"));
                         ciudadDestino.setVigencia(resultSetCiudad.getBoolean("vigencia"));
                     }      
                       statementCiudad.close();
                       sqlCiudad="";
                       resultSetCiudad=null;
                       
                vuelo.setCiudadDestino(ciudadDestino);
                //Fin setear Ciudades origen y destino
                
                asiento.setVuelo(vuelo);
                asiento.setDisponible(resultSet.getBoolean("disponible"));
                asiento.setCodigoAsiento(resultSet.getString("ubicacion"));
                asiento.setPrecio(resultSet.getFloat("precio"));
                compra.setAsiento(asiento);
                
                cliente.setId(resultSet.getInt("idCliente"));
                cliente.setNombre(resultSet.getString("nombre"));
                cliente.setApellido(resultSet.getString("apellido"));
                cliente.setDni(resultSet.getInt("dni"));
                cliente.setMail(resultSet.getString("mail"));
                cliente.setPasaporte(resultSet.getInt("nroPasaporte"));
                cliente.setTarjeta(resultSet.getInt("nroTarjeta"));
                
                compra.setCliente(cliente);
                //dateFormat= new SimpleDateFormat("dd-MM-yy HH");
                compra.setFechaCompra(resultSet.getTimestamp("fechaCompra"));
                                       
               }      
            statement.close();
                
        } catch (SQLException ex) {
            System.out.println("Error al buscar una compra: " + ex.getMessage());
        }
        
        return compra;
    }     
        
        public int actualizarCompra(Compra compra) throws SQLException{
               int exito;
          
            String sql = "UPDATE compra SET idCompra = ?, idAsiento = ?, idCliente = ? , fechaCompra =? WHERE idCompra = ?;";

            PreparedStatement statement = Conexion.getConexion().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, compra.getIdCompra());
            statement.setInt(2, compra.getAsiento().getIdAsiento());
            statement.setInt(3, compra.getCliente().getId());
            statement.setTimestamp(4, (Timestamp) compra.getFechaCompra());
            statement.setInt(5, compra.getIdCompra());
            exito=statement.executeUpdate();
            statement.close();
           return exito;
        
    
    }    
        
   public List obtenerCompras(){
      DateFormat dateFormat;
       try {
            String sql = "SELECT * FROM compra,cliente,asiento,vuelo WHERE compra.idCliente=cliente.idCliente and compra.idAsiento=asiento.idAsiento and asiento.idVuelo=vuelo.idVuelo;";
            PreparedStatement statement = Conexion.getConexion().prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Compra compra;
            Asiento asiento;
            Cliente cliente;
            Vuelo vuelo;
            Ciudad ciudadOrigen, ciudadDestino;
            Integer idCiudadOrigen, idCiudadDestino;
            
            while(resultSet.next()){
                compra = new Compra();
                asiento = new Asiento();
                cliente = new Cliente();
                vuelo = new Vuelo();
                compra.setIdCompra(resultSet.getInt("idCompra"));
                asiento.setIdAsiento(resultSet.getInt("idAsiento"));
                vuelo.setIdVuelo(resultSet.getInt("idVuelo"));
                vuelo.setAerolinea(resultSet.getString("aerolinea"));
                vuelo.setTipoAeronave(resultSet.getString("tipoAeronave"));
                vuelo.setEstado(resultSet.getString("estado"));
                
                compra.setFechaCompra(resultSet.getTimestamp("fechaCompra"));
                
                vuelo.setFechaSalida(resultSet.getTimestamp("fechaSalida"));
                vuelo.setFechaArribo(resultSet.getTimestamp("fechaArribo"));
                
                idCiudadOrigen=resultSet.getInt("idCiudadOrigen");
                idCiudadDestino=resultSet.getInt("idCiudadDestino");
                //setear ciudadOrigen y CiudadDestino
                     ciudadOrigen = new Ciudad();
                     String sqlCiudad = "SELECT * FROM ciudad WHERE idCiudad =?;";
                     PreparedStatement statementCiudad = Conexion.getConexion().prepareStatement(sqlCiudad, Statement.RETURN_GENERATED_KEYS);
                     statementCiudad.setInt(1, idCiudadOrigen);
                     ResultSet resultSetCiudad=statementCiudad.executeQuery();
            
                     while(resultSetCiudad.next()){
                         ciudadOrigen.setNombre(resultSetCiudad.getString("nombre"));
                         ciudadOrigen.setPais(resultSetCiudad.getString("pais"));
                         ciudadOrigen.setVigencia(resultSetCiudad.getBoolean("vigencia"));
                     }      
                       statementCiudad.close();
                       sqlCiudad="";
                       resultSetCiudad=null;
                       
                       
                vuelo.setCiudadOrigen(ciudadOrigen);
                
                     ciudadDestino = new Ciudad();
                     sqlCiudad = "SELECT * FROM ciudad WHERE idCiudad =?;";
                     statementCiudad = Conexion.getConexion().prepareStatement(sqlCiudad, Statement.RETURN_GENERATED_KEYS);
                     statementCiudad.setInt(1, idCiudadDestino);
                     resultSetCiudad=statementCiudad.executeQuery();
            
                     while(resultSetCiudad.next()){
                         ciudadDestino.setNombre(resultSetCiudad.getString("nombre"));
                         ciudadDestino.setPais(resultSetCiudad.getString("pais"));
                         ciudadDestino.setVigencia(resultSetCiudad.getBoolean("vigencia"));
                     }      
                       statementCiudad.close();
                       sqlCiudad="";
                       resultSetCiudad=null;
                       
                vuelo.setCiudadDestino(ciudadDestino);
                //Fin setear Ciudades origen y destino
                              
                asiento.setVuelo(vuelo);
                asiento.setDisponible(resultSet.getBoolean("disponible"));
                asiento.setCodigoAsiento(resultSet.getString("ubicacion"));
                asiento.setPrecio(resultSet.getFloat("precio"));
                compra.setAsiento(asiento);
                
                cliente.setId(resultSet.getInt("idCliente"));
                cliente.setNombre(resultSet.getString("nombre"));
                cliente.setApellido(resultSet.getString("apellido"));
                cliente.setDni(resultSet.getInt("dni"));
                cliente.setMail(resultSet.getString("mail"));
                cliente.setPasaporte(resultSet.getInt("nroPasaporte"));
                cliente.setTarjeta(resultSet.getInt("nroTarjeta"));
                
                compra.setCliente(cliente);
                
                dateFormat= new SimpleDateFormat("dd-MM-yy HH:mm:ss");
                compra.setFechaCompra(resultSet.getTimestamp("fechaCompra"));
                
                this.listaCompras.add(compra);
            }      
              statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las compras:---- " + ex.getMessage());
        }
        
        
        return this.listaCompras;
    }     
        
        
  public boolean existe(int idCompra){
      //DEBERIA CONTROLAR QUE ESTE DNI NO DEBA EXISTIR EN LA BSE DE DATOS, PARA LUEGO DARLO DE ALTA
      boolean repetido = false;
      List<Compra> lista = obtenerCompras(); //LISTA DE CLIENTES EN DONDE VOY A BUSCAR SI YA EXISTE EL DNI
      int i =0;
      while(i<lista.size()){
          if(lista.get(i).getIdCompra() == idCompra){
              repetido = true;
          }
          i++;
      }
      return repetido;
      
  }    

    private Date get(int DATE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
}
