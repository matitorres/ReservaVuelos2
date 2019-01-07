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
                    p = new Cliente(resultSet.getInt("idCliente"), resultSet.getString("nombre"), resultSet.getString("apellido"), resultSet.getInt("dni"), resultSet.getString("mail"), resultSet.getInt("nroPasaporte"),resultSet.getInt("nroTarjeta"),resultSet.getString("contraseña"));
                    this.listaClientes.add(p);
                }
                resultSet.close();
            }
       

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());//mostrar el Error
        }
        return this.listaClientes;
    }
    
    public Cliente getCliente(String mail) {
        Cliente p = new Cliente() ;
        try {
            ResultSet resultSet = null;
            String consulta = "SELECT * FROM cliente WHERE mail = '" + mail + "';";
           
            PreparedStatement preparedStatement = Conexion.getConexion().prepareStatement(consulta);
            resultSet = preparedStatement.executeQuery();
            if (resultSet != null && resultSet.next()) {
                p = new Cliente(resultSet.getInt("idCliente"), resultSet.getString("nombre"), resultSet.getString("apellido"), resultSet.getInt("dni"), resultSet.getString("mail"), resultSet.getInt("nroPasaporte"),resultSet.getInt("nroTarjeta"),resultSet.getString("contraseña"));
                resultSet.close();
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());//mostrar el Error
        }
        return p;
    }
    
    public int altaCliente(Cliente cliente) throws SQLException {      
        String consulta = "INSERT INTO cliente "
                + "(nombre, apellido, dni, mail, nroPasaporte, nroTarjeta, contraseña) VALUES"
                + "(?,?,?,?,?,?,?);";
        int exito = 0;
     
        PreparedStatement preparedStatement = Conexion.getConexion().prepareStatement(consulta);

            preparedStatement.setString(1, cliente.getNombre());
            preparedStatement.setString(2, cliente.getApellido());
            preparedStatement.setInt(3, cliente.getDni());
            preparedStatement.setString(4, cliente.getMail());
            preparedStatement.setInt(5, cliente.getPasaporte());
            preparedStatement.setInt(6, cliente.getTarjeta());
            preparedStatement.setString(7, cliente.getContraseña());

        exito = preparedStatement.executeUpdate();  
        preparedStatement.close();
        return exito;
    }
    
    public int bajaCliente(int dni) throws SQLException{
        int exito;
        String consulta = "delete from cliente WHERE `dni`=" + dni;
        
        PreparedStatement preparedStatement = Conexion.getConexion().prepareStatement(consulta);
        exito = preparedStatement.executeUpdate();
        preparedStatement.close();
        return exito;
    }
    
    public int modificarCliente(Cliente c) throws SQLException {
        int exito = 0;
        int dni = c.getDni();
        String consulta = "UPDATE cliente " +
                        "SET nombre = '"+c.getNombre()+
                        "', apellido = '"+c.getApellido()+
                        "', dni='"+c.getDni()+
                        "', mail='"+c.getMail()+
                        "', nroPasaporte ='"+c.getPasaporte()+
                        "', nroTarjeta ='"+c.getTarjeta()+
                        "', contraseña ='"+c.getContraseña()+
                        "' WHERE `dni`='"+dni+"';";
            
        PreparedStatement preparedStatement = Conexion.getConexion().prepareStatement(consulta);// con esta sentencia se insertan los datos en la base de datos
        exito = preparedStatement.executeUpdate();//valida si se guardaron los datos; si pst>0 entonces se guardaron
        preparedStatement.close();
        return exito;
  }
    
    public boolean existe(int dni, String mail){
        boolean repetido = false;
        List<Cliente> lista = getClientes();
      
        int i =0;
        while(i < lista.size()){
            if(lista.get(i).getDni() == dni || mail.equals(lista.get(i).getMail())){
                repetido = true;
            }
            i++;
        }
      
        return repetido;
    }

}
    
