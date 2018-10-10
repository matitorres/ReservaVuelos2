/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;


/**
 *
 * @author Gabriel
 */
public class Asiento {
    private int idAsiento=-1;
    private Vuelo vuelo;
    private String codigoAsiento;
    private boolean disponible;
    private float precio;
    
    
    public Asiento(){
    this.idAsiento=-1;
  }
    public Asiento(int idAsiento, Vuelo vuelo, String codigoAsiento, float precio, boolean disponible){
    this.idAsiento=idAsiento;
    this.vuelo=vuelo;
    this.codigoAsiento=codigoAsiento;
    this.disponible=disponible;
    this.precio=precio;
  }
    public Asiento(Vuelo vuelo, String codigoAsiento, float precio, boolean disponible){
    this.idAsiento=-1;
    this.vuelo=vuelo;
    this.codigoAsiento=codigoAsiento;
    this.disponible=disponible;
    this.precio=precio;
  }
    public Asiento(Vuelo vuelo, String codigoAsiento, float precio){
    this.idAsiento=-1;
    this.vuelo=vuelo;
    this.codigoAsiento=codigoAsiento;
    this.precio=precio;
  }
    public Asiento (float precio) {
    this.idAsiento = -1;
    this.precio = precio;
    }

    
    public int getIdAsiento() {
        return idAsiento;
    }
    public void setIdAsiento(int idAsiento) {
        this.idAsiento = idAsiento;
    }
    public Vuelo getVuelo() {
        return vuelo;
    }
    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }
    public boolean getDisponible() {
        return disponible;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    public String getCodigoAsiento() {
        return codigoAsiento;
    }
    public void setCodigoAsiento(String codigoAsiento) {
        this.codigoAsiento = codigoAsiento;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }

}
