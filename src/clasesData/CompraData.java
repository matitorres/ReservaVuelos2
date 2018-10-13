/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesData;



import clases.Asiento;
import clases.Cliente;
import clases.Compra;
import conexion.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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

       public void guardarCompra(Compra compra){
        try {
            
            String sql = "INSERT INTO compra (idAsiento, idCliente, fechaCompra) VALUES ( ? , ? , ? );";

            PreparedStatement statement = Conexion.getConexion().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, compra.getAsiento().getIdAsiento());
            statement.setInt(2, compra.getCliente().getId());
            statement.setDate(3, Date.valueOf(compra.getFechaCompra()));
            
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                compra.setIdCompra(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar la Compra");
            }
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar una Compra: " + ex.getMessage());
        }
    }
       
           public void borrarCompra(int id){
    try {
            
            String sql = "DELETE FROM compra WHERE idCompra =?;";

            PreparedStatement statement = Conexion.getConexion().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
                       
            statement.executeUpdate();
              //System.out.println(statement.executeUpdate()); Para saber que tipo de valor devuelve 
                           
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al Eliminar una Compra " + ex.getMessage());
        }
        
    
    }
           
        public Compra buscarCompra(int id){
    Compra compra= new Compra();
    Asiento asiento=new Asiento(1);
    Cliente cliente=new Cliente();
    try {
            
            String sql = "SELECT * FROM compra WHERE idCompra =?;";

            PreparedStatement statement = Conexion.getConexion().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
            ResultSet resultSet=statement.executeQuery();
            
            while(resultSet.next()){
                compra.setIdCompra(resultSet.getInt("idCompra"));
                asiento.setIdAsiento(resultSet.getInt("idAsiento"));
                compra.setAsiento(asiento);
                cliente.setId(resultSet.getInt("idCliente"));
                compra.setCliente(cliente);
                compra.setFechaCompra(resultSet.getDate("fechaCompra").toLocalDate());
             }      
            statement.close();
                
        } catch (SQLException ex) {
            System.out.println("Error al buscar una compra: " + ex.getMessage());
        }
        
        return compra;
    }     
        
        public void actualizarCompra(Compra compra){
    
        try {
            
            String sql = "UPDATE compra SET idAsiento = ?, idCliente = ? , fechaCompra =? WHERE idCompra = ?;";

            PreparedStatement statement = Conexion.getConexion().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, compra.getAsiento().getIdAsiento());
            statement.setInt(2, compra.getCliente().getId());
            statement.setDate(3, Date.valueOf(compra.getFechaCompra()));
            statement.setInt(4, compra.getIdCompra());
            statement.executeUpdate();
                    
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error ACTUALIZAR una Compra: " + ex.getMessage());
        }
    
    }    
        
   public List<Compra> obtenerCompras(){
        List<Compra> compras = new ArrayList<Compra>();
            

        try {
            String sql = "SELECT * FROM compra;";
            PreparedStatement statement = Conexion.getConexion().prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Compra compra;
            Asiento asiento;
            Cliente cliente;
            while(resultSet.next()){
                compra = new Compra();
                asiento = new Asiento();
                cliente = new Cliente();
                
                compra.setIdCompra(resultSet.getInt("idCompra"));
                asiento.setIdAsiento(resultSet.getInt("idAsiento"));
                compra.setAsiento(asiento);
                cliente.setId(resultSet.getInt("idCliente"));
                compra.setCliente(cliente);
                compra.setFechaCompra(resultSet.getDate("fechaCompra").toLocalDate());
                    
                compras.add(compra);
            }      
            
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las compras: " + ex.getMessage());
        }
        
        
        return compras;
    }     
        
        
    
   
    
}
