/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservadevuelos.modelo;

import java.time.LocalDate;

/**
 *
 @author Pamela
 */
public class Ciudad {
    
    //ATRIBUTOS
    
    private int idCiudad;
    private String nombre;
    private String pais;     
    private int vigencia;
    
    
    // CONSTRUCTORES
    
    public Ciudad(int idCiudad, String nombre, String pais, int vigencia) {
        this.idCiudad = idCiudad;
        this.nombre = nombre;
        this.pais = pais;
        this.vigencia = vigencia; 
    }
    
    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getVigencia() {
        return vigencia;
    }

    public void setVigencia(int vigencia) {
        this.vigencia = vigencia;
    }


   }
         
        
        
         

     


