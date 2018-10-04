/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservadevuelos.modelo;

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
        switch (tipoAeronave) {
            case "Boeing 747": 
                asientos.add("V001");asientos.add("P002");asientos.add("P003");
                asientos.add("V004");asientos.add("V005");asientos.add("P006");
                asientos.add("P007");asientos.add("V008");asientos.add("V009");
                asientos.add("P010");asientos.add("P011");asientos.add("V012");
                asientos.add("V013");asientos.add("P014");asientos.add("P015");
                asientos.add("V016");asientos.add("V017");asientos.add("P018");
                asientos.add("P019");asientos.add("V020");asientos.add("V021");
                asientos.add("P022");asientos.add("P023");asientos.add("V024");
                asientos.add("V025");asientos.add("P026");asientos.add("P027");
                asientos.add("V028");asientos.add("V029");asientos.add("P030");
                asientos.add("P031");asientos.add("V032");asientos.add("V033");
                asientos.add("P034");asientos.add("P035");asientos.add("V036");
                asientos.add("V037");asientos.add("P038");asientos.add("P039");
                asientos.add("V040");
                break;
            case "Boeing 757": 
                asientos.add("V001");asientos.add("P002");asientos.add("P003");
                asientos.add("V004");asientos.add("V005");asientos.add("P006");
                asientos.add("P007");asientos.add("V008");asientos.add("V009");
                asientos.add("P010");asientos.add("P011");asientos.add("V012");
                asientos.add("V013");asientos.add("P014");asientos.add("P015");
                asientos.add("V016");asientos.add("V017");asientos.add("P018");
                asientos.add("P019");asientos.add("V020");asientos.add("V021");
                asientos.add("P022");asientos.add("P023");asientos.add("V024");
                asientos.add("V025");asientos.add("P026");asientos.add("P027");
                asientos.add("V028");asientos.add("V029");asientos.add("P030");
                asientos.add("P031");asientos.add("V032");asientos.add("V033");
                asientos.add("P034");asientos.add("P035");asientos.add("V036");
                asientos.add("V037");asientos.add("P038");asientos.add("P039");
                asientos.add("V040");
                break;
            case "Boeing 767": 
                asientos.add("V001");asientos.add("P002");asientos.add("P003");
                asientos.add("V004");asientos.add("V005");asientos.add("P006");
                asientos.add("P007");asientos.add("V008");asientos.add("V009");
                asientos.add("P010");asientos.add("P011");asientos.add("V012");
                asientos.add("V013");asientos.add("P014");asientos.add("P015");
                asientos.add("V016");asientos.add("V017");asientos.add("P018");
                asientos.add("P019");asientos.add("V020");asientos.add("V021");
                asientos.add("P022");asientos.add("P023");asientos.add("V024");
                asientos.add("V025");asientos.add("P026");asientos.add("P027");
                asientos.add("V028");asientos.add("V029");asientos.add("P030");
                asientos.add("P031");asientos.add("V032");asientos.add("V033");
                asientos.add("P034");asientos.add("P035");asientos.add("V036");
                asientos.add("V037");asientos.add("P038");asientos.add("P039");
                asientos.add("V040");
                break;
            case "Airbus A320": 
                asientos.add("V001");asientos.add("P002");asientos.add("P003");
                asientos.add("V004");asientos.add("V005");asientos.add("P006");
                asientos.add("P007");asientos.add("V008");asientos.add("V009");
                asientos.add("P010");asientos.add("P011");asientos.add("V012");
                asientos.add("V013");asientos.add("P014");asientos.add("P015");
                asientos.add("V016");asientos.add("V017");asientos.add("P018");
                asientos.add("P019");asientos.add("V020");asientos.add("V021");
                asientos.add("P022");asientos.add("P023");asientos.add("V024");
                asientos.add("V025");asientos.add("P026");asientos.add("P027");
                asientos.add("V028");asientos.add("V029");asientos.add("P030");
                asientos.add("P031");asientos.add("V032");asientos.add("V033");
                asientos.add("P034");asientos.add("P035");asientos.add("V036");
                asientos.add("V037");asientos.add("P038");asientos.add("P039");
                asientos.add("V040");
                break;
            case "Airbus A330": 
                asientos.add("V001");asientos.add("P002");asientos.add("P003");
                asientos.add("V004");asientos.add("V005");asientos.add("P006");
                asientos.add("P007");asientos.add("V008");asientos.add("V009");
                asientos.add("P010");asientos.add("P011");asientos.add("V012");
                asientos.add("V013");asientos.add("P014");asientos.add("P015");
                asientos.add("V016");asientos.add("V017");asientos.add("P018");
                asientos.add("P019");asientos.add("V020");asientos.add("V021");
                asientos.add("P022");asientos.add("P023");asientos.add("V024");
                asientos.add("V025");asientos.add("P026");asientos.add("P027");
                asientos.add("V028");asientos.add("V029");asientos.add("P030");
                asientos.add("P031");asientos.add("V032");asientos.add("V033");
                asientos.add("P034");asientos.add("P035");asientos.add("V036");
                asientos.add("V037");asientos.add("P038");asientos.add("P039");
                asientos.add("V040");
                break;
            case "Airbus A340": 
                asientos.add("V001");asientos.add("P002");asientos.add("P003");
                asientos.add("V004");asientos.add("V005");asientos.add("P006");
                asientos.add("P007");asientos.add("V008");asientos.add("V009");
                asientos.add("P010");asientos.add("P011");asientos.add("V012");
                asientos.add("V013");asientos.add("P014");asientos.add("P015");
                asientos.add("V016");asientos.add("V017");asientos.add("P018");
                asientos.add("P019");asientos.add("V020");asientos.add("V021");
                asientos.add("P022");asientos.add("P023");asientos.add("V024");
                asientos.add("V025");asientos.add("P026");asientos.add("P027");
                asientos.add("V028");asientos.add("V029");asientos.add("P030");
                asientos.add("P031");asientos.add("V032");asientos.add("V033");
                asientos.add("P034");asientos.add("P035");asientos.add("V036");
                asientos.add("V037");asientos.add("P038");asientos.add("P039");
                asientos.add("V040");
                break;
            default: 
                asientos.add("V001");asientos.add("P002");asientos.add("P003");
                asientos.add("V004");asientos.add("V005");asientos.add("P006");
                asientos.add("P007");asientos.add("V008");asientos.add("V009");
                asientos.add("P010");asientos.add("P011");asientos.add("V012");
                asientos.add("V013");asientos.add("P014");asientos.add("P015");
                asientos.add("V016");asientos.add("V017");asientos.add("P018");
                asientos.add("P019");asientos.add("V020");asientos.add("V021");
                asientos.add("P022");asientos.add("P023");asientos.add("V024");
                asientos.add("V025");asientos.add("P026");asientos.add("P027");
                asientos.add("V028");asientos.add("V029");asientos.add("P030");
                asientos.add("P031");asientos.add("V032");asientos.add("V033");
                asientos.add("P034");asientos.add("P035");asientos.add("V036");
                asientos.add("V037");asientos.add("P038");asientos.add("P039");
                asientos.add("V040");
                break;
        }
    }
    
    public Vuelo(String aerolinea, String tipoAeronave, int ciudadOrigen,
            int ciudadDestino, LocalDate salida, LocalDate arrivo,
            String estado) {
        this.idVuelo = -1;
        this.aerolinea = aerolinea;
        this.tipoAeronave = tipoAeronave;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.salida = salida;
        this.arribo = arrivo;
        this.estado = estado;
        switch (tipoAeronave) {
            case "Boeing 747": 
                asientos.add("V001");asientos.add("P002");asientos.add("P003");
                asientos.add("V004");asientos.add("V005");asientos.add("P006");
                asientos.add("P007");asientos.add("V008");asientos.add("V009");
                asientos.add("P010");asientos.add("P011");asientos.add("V012");
                asientos.add("V013");asientos.add("P014");asientos.add("P015");
                asientos.add("V016");asientos.add("V017");asientos.add("P018");
                asientos.add("P019");asientos.add("V020");asientos.add("V021");
                asientos.add("P022");asientos.add("P023");asientos.add("V024");
                asientos.add("V025");asientos.add("P026");asientos.add("P027");
                asientos.add("V028");asientos.add("V029");asientos.add("P030");
                asientos.add("P031");asientos.add("V032");asientos.add("V033");
                asientos.add("P034");asientos.add("P035");asientos.add("V036");
                asientos.add("V037");asientos.add("P038");asientos.add("P039");
                asientos.add("V040");
                break;
            case "Boeing 757": 
                asientos.add("V001");asientos.add("P002");asientos.add("P003");
                asientos.add("V004");asientos.add("V005");asientos.add("P006");
                asientos.add("P007");asientos.add("V008");asientos.add("V009");
                asientos.add("P010");asientos.add("P011");asientos.add("V012");
                asientos.add("V013");asientos.add("P014");asientos.add("P015");
                asientos.add("V016");asientos.add("V017");asientos.add("P018");
                asientos.add("P019");asientos.add("V020");asientos.add("V021");
                asientos.add("P022");asientos.add("P023");asientos.add("V024");
                asientos.add("V025");asientos.add("P026");asientos.add("P027");
                asientos.add("V028");asientos.add("V029");asientos.add("P030");
                asientos.add("P031");asientos.add("V032");asientos.add("V033");
                asientos.add("P034");asientos.add("P035");asientos.add("V036");
                asientos.add("V037");asientos.add("P038");asientos.add("P039");
                asientos.add("V040");
                break;
            case "Boeing 767": 
                asientos.add("V001");asientos.add("P002");asientos.add("P003");
                asientos.add("V004");asientos.add("V005");asientos.add("P006");
                asientos.add("P007");asientos.add("V008");asientos.add("V009");
                asientos.add("P010");asientos.add("P011");asientos.add("V012");
                asientos.add("V013");asientos.add("P014");asientos.add("P015");
                asientos.add("V016");asientos.add("V017");asientos.add("P018");
                asientos.add("P019");asientos.add("V020");asientos.add("V021");
                asientos.add("P022");asientos.add("P023");asientos.add("V024");
                asientos.add("V025");asientos.add("P026");asientos.add("P027");
                asientos.add("V028");asientos.add("V029");asientos.add("P030");
                asientos.add("P031");asientos.add("V032");asientos.add("V033");
                asientos.add("P034");asientos.add("P035");asientos.add("V036");
                asientos.add("V037");asientos.add("P038");asientos.add("P039");
                asientos.add("V040");
                break;
            case "Airbus A320": 
                asientos.add("V001");asientos.add("P002");asientos.add("P003");
                asientos.add("V004");asientos.add("V005");asientos.add("P006");
                asientos.add("P007");asientos.add("V008");asientos.add("V009");
                asientos.add("P010");asientos.add("P011");asientos.add("V012");
                asientos.add("V013");asientos.add("P014");asientos.add("P015");
                asientos.add("V016");asientos.add("V017");asientos.add("P018");
                asientos.add("P019");asientos.add("V020");asientos.add("V021");
                asientos.add("P022");asientos.add("P023");asientos.add("V024");
                asientos.add("V025");asientos.add("P026");asientos.add("P027");
                asientos.add("V028");asientos.add("V029");asientos.add("P030");
                asientos.add("P031");asientos.add("V032");asientos.add("V033");
                asientos.add("P034");asientos.add("P035");asientos.add("V036");
                asientos.add("V037");asientos.add("P038");asientos.add("P039");
                asientos.add("V040");
                break;
            case "Airbus A330": 
                asientos.add("V001");asientos.add("P002");asientos.add("P003");
                asientos.add("V004");asientos.add("V005");asientos.add("P006");
                asientos.add("P007");asientos.add("V008");asientos.add("V009");
                asientos.add("P010");asientos.add("P011");asientos.add("V012");
                asientos.add("V013");asientos.add("P014");asientos.add("P015");
                asientos.add("V016");asientos.add("V017");asientos.add("P018");
                asientos.add("P019");asientos.add("V020");asientos.add("V021");
                asientos.add("P022");asientos.add("P023");asientos.add("V024");
                asientos.add("V025");asientos.add("P026");asientos.add("P027");
                asientos.add("V028");asientos.add("V029");asientos.add("P030");
                asientos.add("P031");asientos.add("V032");asientos.add("V033");
                asientos.add("P034");asientos.add("P035");asientos.add("V036");
                asientos.add("V037");asientos.add("P038");asientos.add("P039");
                asientos.add("V040");
                break;
            case "Airbus A340": 
                asientos.add("V001");asientos.add("P002");asientos.add("P003");
                asientos.add("V004");asientos.add("V005");asientos.add("P006");
                asientos.add("P007");asientos.add("V008");asientos.add("V009");
                asientos.add("P010");asientos.add("P011");asientos.add("V012");
                asientos.add("V013");asientos.add("P014");asientos.add("P015");
                asientos.add("V016");asientos.add("V017");asientos.add("P018");
                asientos.add("P019");asientos.add("V020");asientos.add("V021");
                asientos.add("P022");asientos.add("P023");asientos.add("V024");
                asientos.add("V025");asientos.add("P026");asientos.add("P027");
                asientos.add("V028");asientos.add("V029");asientos.add("P030");
                asientos.add("P031");asientos.add("V032");asientos.add("V033");
                asientos.add("P034");asientos.add("P035");asientos.add("V036");
                asientos.add("V037");asientos.add("P038");asientos.add("P039");
                asientos.add("V040");
                break;
            default: 
                asientos.add("V001");asientos.add("P002");asientos.add("P003");
                asientos.add("V004");asientos.add("V005");asientos.add("P006");
                asientos.add("P007");asientos.add("V008");asientos.add("V009");
                asientos.add("P010");asientos.add("P011");asientos.add("V012");
                asientos.add("V013");asientos.add("P014");asientos.add("P015");
                asientos.add("V016");asientos.add("V017");asientos.add("P018");
                asientos.add("P019");asientos.add("V020");asientos.add("V021");
                asientos.add("P022");asientos.add("P023");asientos.add("V024");
                asientos.add("V025");asientos.add("P026");asientos.add("P027");
                asientos.add("V028");asientos.add("V029");asientos.add("P030");
                asientos.add("P031");asientos.add("V032");asientos.add("V033");
                asientos.add("P034");asientos.add("P035");asientos.add("V036");
                asientos.add("V037");asientos.add("P038");asientos.add("P039");
                asientos.add("V040");
                break;
        }
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
