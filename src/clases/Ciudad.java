/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 @author Pamela
 */
public class Ciudad {
    
    //ATRIBUTOS
    
    private int idCiudad;
    private String nombre;
    private String pais;     
    private boolean vigencia;
    
    
    // CONSTRUCTORES
    
    public Ciudad(int idCiudad, String nombre, String pais, boolean vigencia) {
        this.idCiudad = idCiudad;
        this.nombre = nombre;
        this.pais = pais;
        this.vigencia = vigencia; 
    }
    
    //CONSTRUCTOR POR DEFECTO
    
    public Ciudad (){
        this.idCiudad = 0;
        this.nombre = "nombre";
        this.pais = "pais";
        this.vigencia = false; 
    
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

    public boolean getVigencia() {
        return vigencia;
    }

    public void setVigencia(boolean vigencia) {
        this.vigencia = vigencia;
    }


   }
         
        
        
         

     


