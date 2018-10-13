/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesData;

/**
 *
 * @author pedro
*/



import clases.Cliente;
import conexion.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;




public class ClienteData {
    

   //ya no tengo atributo conexion ya que el motodo GetConexion es estatico, quiere decir que lo puedo usar en cualquier otra clase
    private List listaClientes;

    public ClienteData() {
        this.listaClientes = new ArrayList<>();
    }

    public List getClientes() {
        try {
          
            ResultSet resultSet = null;
            String consulta = "SELECT * FROM `cliente`";
            
            //PARA USAR EL METODO ESTATICO SE PONE EL NOMBRE DE LA CLASE SEGUIDO DE LA FUNCION
            
            //EN ESTE CASO: Conexion.getConexion()
     
            PreparedStatement preparedStatement = Conexion.getConexion().prepareStatement(consulta);
            resultSet = preparedStatement.executeQuery();
            Cliente p;
            if (resultSet != null) {
                while (resultSet.next()) {
                    p = new Cliente(resultSet.getInt("idCliente"), resultSet.getString("nombre"), resultSet.getString("apellido"), resultSet.getInt("dni"), resultSet.getString("mail"), resultSet.getInt("nroPasaporte"),resultSet.getInt("nroTarjeta"));
                    this.listaClientes.add(p);
                }
                resultSet.close();
            }
       

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());//mostrar el Error
        }
        return this.listaClientes;
    }

    public Cliente getCliente(int id) {
    // ESTE NOS SERVIRA PARA NO REPETIR CLIENTES CON EL MISMO DNI
        //ES DECIR Q EN CASO DE Q LA CONSULTA FRACASE SE QUEDARA POR DEFECO CON ESE DNI
         Cliente p = new Cliente() ;
        try {
            ResultSet resultSet = null;
            String consulta = "SELECT * FROM `cliente` WHERE `idCliente`=" + id;
           
            PreparedStatement preparedStatement = Conexion.getConexion().prepareStatement(consulta);
            resultSet = preparedStatement.executeQuery();
            if (resultSet != null && resultSet.next()) {
                 p = new Cliente(resultSet.getInt("idCliente"), resultSet.getString("nombre"), resultSet.getString("apellido"), resultSet.getInt("dni"), resultSet.getString("mail"), resultSet.getInt("nroPasaporte"),resultSet.getInt("nroTarjeta"));
                resultSet.close();
            }
            
            //  db.cerrarConexion();

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());//mostrar el Error
        }
        return p;
    }
  public int altaCliente(Cliente cliente) throws SQLException {      
                String insertTableSQL = "INSERT INTO cliente "
                + "(nombre, apellido, dni,mail, nroPasaporte, nroTarjeta) VALUES"
                + "(?,?,?,?,?,?)";
          int exito = 0;
     
        
           PreparedStatement preparedStatement = Conexion.getConexion().prepareStatement(insertTableSQL);

            preparedStatement.setString(1, cliente.getNombre());
            preparedStatement.setString(2, cliente.getApellido());
            preparedStatement.setInt(3, cliente.getDni());
             preparedStatement.setString(4, cliente.getMail());
              preparedStatement.setInt(5, cliente.getPasaporte());
            preparedStatement.setInt(6, cliente.getTarjeta());

            //  Ejecutamos el insert
           exito = preparedStatement.executeUpdate();
           
           preparedStatement.close();
          // db.getConexion().close();
           return exito;
      
    }
  public int bajaCliente(int dni) throws SQLException{
      int exito = 0;
      String consulta = "delete from cliente WHERE `dni`=" + dni;
        
            PreparedStatement preparedStatement = Conexion.getConexion().prepareStatement(consulta);
            exito = preparedStatement.executeUpdate();
             // SI EXITO ES MAYOR QUE 0 SIGINIFICA QUE EL DELETE FUE EXITOSO, ESTO SE CONTROLARA DESDE LA INTERFAZ GRAFICA
             
           preparedStatement.close();
        //   db.getConexion().close();
      return exito;
              
  }
  
  public int modificarCliente(Cliente c) throws SQLException{
      int exito = 0;
   
     
      
          String consulta = "UPDATE cliente " +
                    "SET nombre = '"+c.getNombre()+"', apellido = '"+c.getApellido()+"', dni='"+c.getDni()+"', mail='"+c.getMail()+"', nroPasaporte ='"+c.getPasaporte()+"', nroTarjeta ='"+c.getTarjeta()+"' where idCliente= '"+c.getId()+"'";
            
          PreparedStatement preparedStatement = Conexion.getConexion().prepareStatement(consulta);// con esta sentencia se insertan los datos en la base de datos
           exito = preparedStatement.executeUpdate();//valida si se guardaron los datos; si pst>0 entonces se guardaron
           preparedStatement.close();
           
           return exito;
  }
  
  public boolean existe(int dni){
      //DEBERIA CONTROLAR QUE ESTE DNI NO DEBA EXISTIR EN LA BSE DE DATOS, PARA LUEGO DARLO DE ALTA
      boolean repetido = false;
      List<Cliente> lista = getClientes(); //LISTA DE CLIENTES EN DONDE VOY A BUSCAR SI YA EXISTE EL DNI
      int i =0;
      while(i<lista.size()){
          if(lista.get(i).getDni() == dni){
              repetido = true;
          }
          i++;
      }
      return repetido;
      
  }

}
