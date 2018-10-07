/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservadevuelos.modelo;

/**
 *
 * @author asus pc
 */
public class Asiento {
    private int idAsiento = -1;
    private Vuelo vuelo;
    private String codigoAsiento;
    private Float precio;
    private boolean disponible = true;
    
    
    public Asiento (Vuelo vuelo, String codigoAsiento, float precio){
        this.idAsiento = -1;
        this.vuelo = vuelo;
        this.codigoAsiento = codigoAsiento;
        this.precio = precio;
    }
    public Asiento (float precio) {
        this.idAsiento = -1;
        this.precio = precio;
    }
    public Asiento () {
        this.idAsiento = -1;
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

    public String getCodigoAsiento() {
        return codigoAsiento;
    }

    public void setCodigoAsiento(String codigoAsiento) {
        this.codigoAsiento = codigoAsiento;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
