/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;



import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
/**
 *
 * @author Gabriel
 */
public class Compra {
           //Atributos
    private int idCompra=-1;
    private Asiento asiento;
    private Cliente cliente;
    private java.util.Date fechaCompra;
    private int nroTarjeta;
    
    //Constructores
public Compra(int idCompra,Asiento asiento , Cliente cliente , java.util.Date fechaCompra ){
    this.idCompra=idCompra;
    this.asiento=asiento;
    this.cliente=cliente;
    this.fechaCompra=fechaCompra;
} 
    
public Compra(Asiento asiento,Cliente cliente, java.util.Date fechaCompra ){
    this.asiento=asiento;
    this.cliente=cliente;
    this.fechaCompra=fechaCompra;
}    

public Compra(int idCompra ){
    this.idCompra=idCompra;    
}   

  public  Compra() {
        
    }
//Fin Constructores
  
  //Getters and Setters
    public int getIdCompra() {
        return idCompra;
    }
  public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }
  public Asiento getAsiento() {
        return asiento;
    }
    public void setAsiento(Asiento asiento) {
        this.asiento=asiento; 
    }
    
    
    
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente=cliente;
    }
    public java.util.Date getFechaCompra() {
        return fechaCompra;
    }
    public void setFechaCompra(java.util.Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    
     public void setNroTarjeta(int nro) {
        this.nroTarjeta = nro;
    }
    
    public int getNroTarjeta(){
    return this.nroTarjeta;
    }
}
