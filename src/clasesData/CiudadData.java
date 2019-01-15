/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesData;

import clases.Ciudad;
import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pamela
 */
public class CiudadData {

    private List<Ciudad> listaCiudades;

    public CiudadData() {

        this.listaCiudades = new ArrayList<>();

    }

    public int guardarCiudad(Ciudad ciudad) throws SQLException {
        int exito = 0;

        String insertTableSQL = "INSERT INTO ciudad "
                + "(nombre, pais, vigencia) VALUES"
                + "(?,?,?)";

        PreparedStatement prepared = Conexion.getConexion().prepareStatement(insertTableSQL);
        prepared.setString(1, ciudad.getNombre());
        prepared.setString(2, ciudad.getPais());
        prepared.setBoolean(3, ciudad.getVigencia());

        //  Ejecutamos el insert
        exito = prepared.executeUpdate();

        prepared.close();
        // Conexion.getConexion().close();
        return exito;
    }

    public int modificarCiudad(Ciudad c) throws SQLException {
        int exito = 0;
        String consulta = "UPDATE ciudad SET nombre = '" + c.getNombre() + "', pais = '" + c.getPais() + "', vigencia='" + c.getVigencia() + "' where idCiudad= '" + c.getIdCiudad() + "'";
        PreparedStatement preparedStatement = Conexion.getConexion().prepareStatement(consulta);
        // con esta sentencia se insertan los datos en la base de datos
        exito = preparedStatement.executeUpdate();//valida si se guardaron los datos; si pst>0 entonces se guardaron
        preparedStatement.close();

        return exito;
    }

    public void borrarCiudad(int id) throws SQLException {
        int exito = 0;
        String consulta = "delete from ciudad WHERE idCiudad ='" + id + "';";

        PreparedStatement preparedStatement = Conexion.getConexion().prepareStatement(consulta);
        preparedStatement.executeUpdate();
        // SI EXITO ES MAYOR QUE 0 SIGINIFICA QUE EL DELETE FUE EXITOSO, ESTO SE CONTROLARA DESDE LA INTERFAZ GRAFICA
        preparedStatement.close();
        // Conexion.getConexion().close();

    }

    public Ciudad getCiudad(int id) {
        // SERVIRA PARA NO REPETIR CIUDADES CON UN MISMO ID
        Ciudad p = new Ciudad();
        try {
            ResultSet resultSet = null;
            String consulta = "SELECT * FROM `ciudad` WHERE `idCiudad`=" + id;

            PreparedStatement preparedStatement = Conexion.getConexion().prepareStatement(consulta);
            resultSet = preparedStatement.executeQuery();
            if (resultSet != null && resultSet.next()) {
                p = new Ciudad(resultSet.getInt("idCiudad"), resultSet.getString("nombre"), resultSet.getString("pais"), resultSet.getBoolean("vigencia"));
                resultSet.close();
            }
            //  Conexion.cerrarConexion();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
            //mostrar el Error
        }
        return p;
    }

    public boolean existeCiudad(Ciudad c) throws SQLException {
        // SERVIRA PARA NO REPETIR CIUDADES CON UN MISMO ID

        boolean exito = false;

        ResultSet resultSet = null;
        String consulta = "SELECT * FROM `ciudad` WHERE nombre = '" + c.getNombre() + "' AND pais = '" + c.getPais() + "'";

        PreparedStatement preparedStatement = Conexion.getConexion().prepareStatement(consulta);
        resultSet = preparedStatement.executeQuery();
        exito = resultSet.next();

        //  Conexion.cerrarConexion();
        return exito;
    }

    public List getCiudades() {
        try {
            ResultSet resultSet = null;
            String consulta = "SELECT * FROM `ciudad`";
            PreparedStatement preparedStatement = Conexion.getConexion().prepareStatement(consulta);
            resultSet = preparedStatement.executeQuery();
            Ciudad p;
            if (resultSet != null) {
                while (resultSet.next()) {
                    p = new Ciudad(resultSet.getInt("idCiudad"), resultSet.getString("nombre"), resultSet.getString("pais"), resultSet.getBoolean("vigencia"));
                    this.listaCiudades.add(p);
                }
                resultSet.close();
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
            //mostrar el Error
        }
        return this.listaCiudades;
    }

    public List filtrarCiudades(String nombreCiudad) throws SQLException {

        ResultSet resultSet = null;
        String consulta = "SELECT * FROM `ciudad` where nombre  like '%" + nombreCiudad + "%'";
        PreparedStatement preparedStatement = Conexion.getConexion().prepareStatement(consulta);
        resultSet = preparedStatement.executeQuery();
        Ciudad p;
        if (resultSet != null) {
            while (resultSet.next()) {
                p = new Ciudad(resultSet.getInt("idCiudad"), resultSet.getString("nombre"), resultSet.getString("pais"), resultSet.getBoolean("vigencia"));
                this.listaCiudades.add(p);
            }
            resultSet.close();
        }

        return this.listaCiudades;
    }
}
