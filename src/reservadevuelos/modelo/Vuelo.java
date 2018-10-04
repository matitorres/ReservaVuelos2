/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoabasededatos.modelo;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author asus pc
 */
public class Vuelo {
    
    // ATRIBUTOS
    private int idVuelo = -1;
    private String aerolinea, tipoAeronave, estado;
    private int ciudadOrigen, ciudadDestino;
    private LocalDate salida, arribo;
    private ArrayList<String> asientos = new ArrayList<String>();
    
    //CONSTRUCTORES
    
    //Constructor con 8 parametros, incluye el id
    public Vuelo(int idVuelo, String aerolinea, String tipoAeronave,
            int ciudadOrigen, int ciudadDestino, LocalDate salida,
            LocalDate arribo, String estado) {
        this.idVuelo = idVuelo;
        this.aerolinea = aerolinea;
        this.tipoAeronave = tipoAeronave;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.salida = salida;
        this.arribo = arribo;
        this.estado = estado;
    }
    
    //Constructor con 7 parametros
    public Vuelo(String aerolinea, String tipoAeronave,
            int ciudadOrigen,int ciudadDestino,LocalDate salida,LocalDate arribo,
            String estado) {
        this.idVuelo = -1;
        this.aerolinea = aerolinea;
        this.tipoAeronave = tipoAeronave;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.salida = salida;
        this.arribo = arribo;
        this.estado = estado;
        
        }
    

    public Vuelo() {
        this.idVuelo = -1;
    }
    
    // GETTERS Y SETTERS
    public int getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getTipoAeronave() {
        return tipoAeronave;
    }

    public void setTipoAeronave(String tipoAeronave) {
        this.tipoAeronave = tipoAeronave;
    }

    public int getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(int ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public int getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(int ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public LocalDate getSalida() {
        return salida;
    }

    public void setSalida(LocalDate salida) {
        this.salida = salida;
    }

    public LocalDate getArribo() {
        return arribo;
    }

    public void setArribo(LocalDate arribo) {
        this.arribo = arribo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<String> getAsientos() {
        return asientos;
    }

    public void setAsientos(ArrayList<String> asientos) {
        this.asientos = asientos;
    }
}