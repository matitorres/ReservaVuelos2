/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservadevuelos.modelo;

/**
 *
 * @author Gabriel
 */
public class Asiento {
  //ATRIBUTOS
    private int idAsiento=-1;
    private int idVuelo;
    private int pasillo;
    private int disponible;
    private String ubicacion;
    private double precio;
    
//CONSTRUCTORES
public Asiento(){
this.idAsiento=-1;
}
public Asiento(int idAsiento, int idVuelo, int pasillo, int disponible, String ubicacion, double precio){
    this.idAsiento=idAsiento;
    this.idVuelo=idVuelo;
    this.pasillo=pasillo;
    this.disponible=disponible;
    this.ubicacion=ubicacion;
    this.precio=precio;
}

public Asiento(int idVuelo, int pasillo, int disponible, String ubicacion, double precio){
    this.idVuelo=idVuelo;
    this.pasillo=pasillo;
    this.disponible=disponible;
    this.ubicacion=ubicacion;
    this.precio=precio;
}
//FIN CONSTRUCTORES

    public int getIdAsiento() {
        return idAsiento;
    }

    public void setIdAsiento(int idAsiento) {
        this.idAsiento = idAsiento;
    }

    public int getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }

    public int getPasillo() {
        return pasillo;
    }

    public void setPasillo(int pasillo) {
        this.pasillo = pasillo;
    }

    public int getDisponible() {
        return disponible;
    }

    public void setDisponible(int disponible) {
        this.disponible = disponible;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


}
