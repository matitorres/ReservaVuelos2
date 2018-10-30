/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;


import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author asus pc
 */
public class Vuelo {
    private int idVuelo = -1;
    private String aerolinea, tipoAeronave, estado;
    private Ciudad ciudadOrigen, ciudadDestino;
    private LocalDate fechaSalida, fechaArribo;
    private ArrayList<Asiento> asientos = new ArrayList<>();
    
    
    public Vuelo(int idVuelo, String aerolinea, String tipoAeronave, Ciudad ciudadOrigen, Ciudad ciudadDestino, LocalDate fechaSalida, LocalDate fechaArribo, String estado) {
        this.idVuelo = idVuelo;
        this.aerolinea = aerolinea;
        this.tipoAeronave = tipoAeronave;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.fechaSalida = fechaSalida;
        this.fechaArribo = fechaArribo;
        this.estado = estado;
    }
    public Vuelo(String aerolinea, String tipoAeronave, Ciudad ciudadOrigen, Ciudad ciudadDestino, LocalDate fechaSalida, LocalDate fechaArribo, String estado) {
        this.idVuelo = -1;
        this.aerolinea = aerolinea;
        this.tipoAeronave = tipoAeronave;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.fechaSalida = fechaSalida;
        this.fechaArribo = fechaArribo;
        this.estado = estado;
    }
    public Vuelo(int idVuelo){
        this.idVuelo = idVuelo;
    }
    public Vuelo() {
        this.idVuelo = -1;
    }
    

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
    public Ciudad getCiudadOrigen() {
        return ciudadOrigen;
    }
    public void setCiudadOrigen(Ciudad ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }
    public Ciudad getCiudadDestino() {
        return ciudadDestino;
    }
    public void setCiudadDestino(Ciudad ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }
    public LocalDate getFechaSalida() {
        return fechaSalida;
    }
    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    public LocalDate getFechaArribo() {
        return fechaArribo;
    }
    public void setFechaArribo(LocalDate fechaArribo) {
        this.fechaArribo = fechaArribo;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public ArrayList<Asiento> getAsientos() {
        return asientos;
    }
    public void setAsientos(Asiento asiento) {
        asientos.add(new Asiento (this,"V001",asiento.getPrecio()));
        asientos.add(new Asiento (this,"P002",asiento.getPrecio()));
        asientos.add(new Asiento (this,"P003",asiento.getPrecio()));
        asientos.add(new Asiento (this,"V004",asiento.getPrecio()));
        asientos.add(new Asiento (this,"V005",asiento.getPrecio()));
        asientos.add(new Asiento (this,"P006",asiento.getPrecio()));
        asientos.add(new Asiento (this,"P007",asiento.getPrecio()));
        asientos.add(new Asiento (this,"V008",asiento.getPrecio()));
        asientos.add(new Asiento (this,"V009",asiento.getPrecio()));
        asientos.add(new Asiento (this,"P010",asiento.getPrecio()));
        asientos.add(new Asiento (this,"P011",asiento.getPrecio()));
        asientos.add(new Asiento (this,"V012",asiento.getPrecio()));
        asientos.add(new Asiento (this,"V013",asiento.getPrecio()));
        asientos.add(new Asiento (this,"P014",asiento.getPrecio()));
        asientos.add(new Asiento (this,"P015",asiento.getPrecio()));
        asientos.add(new Asiento (this,"V016",asiento.getPrecio()));
        asientos.add(new Asiento (this,"V017",asiento.getPrecio()));
        asientos.add(new Asiento (this,"P018",asiento.getPrecio()));
        asientos.add(new Asiento (this,"P019",asiento.getPrecio()));
        asientos.add(new Asiento (this,"V020",asiento.getPrecio()));
        asientos.add(new Asiento (this,"V021",asiento.getPrecio()));
        asientos.add(new Asiento (this,"P022",asiento.getPrecio()));
        asientos.add(new Asiento (this,"P023",asiento.getPrecio()));
        asientos.add(new Asiento (this,"V024",asiento.getPrecio()));
        asientos.add(new Asiento (this,"V025",asiento.getPrecio()));
        asientos.add(new Asiento (this,"P026",asiento.getPrecio()));
        asientos.add(new Asiento (this,"P027",asiento.getPrecio()));
        asientos.add(new Asiento (this,"V028",asiento.getPrecio()));
        asientos.add(new Asiento (this,"V029",asiento.getPrecio()));
        asientos.add(new Asiento (this,"P030",asiento.getPrecio()));
        asientos.add(new Asiento (this,"P031",asiento.getPrecio()));
        asientos.add(new Asiento (this,"V032",asiento.getPrecio()));
    }
}
