/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservadevuelos.modelo;


import java.time.LocalDate;
/**
 *
 * @author Gabriel
 */
public class Compra {
           //Atributos
    private int idCompra=-1;
    private Asiento asiento;
    private Cliente cliente;
    private LocalDate fechaCompra;
    
    //Constructores
public Compra(int idCompra,Asiento asiento , Cliente cliente , LocalDate fechaCompra ){
    this.idCompra=idCompra;
    this.asiento=asiento;
    this.cliente=cliente;
    this.fechaCompra=fechaCompra;
} 
    
public Compra(Asiento asiento,Cliente cliente, LocalDate fechaCompra ){
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
    public LocalDate getFechaCompra() {
        return fechaCompra;
    }
    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
}
