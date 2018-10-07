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
    private int idCompra=-1;
    private int idAsiento;
    private int idCliente;
    private LocalDate fechaCompra;
    
public Compra(int idCompra,int idAsiento ,int idCliente, LocalDate fechaCompra ){
    this.idCompra=idCompra;
    this.idAsiento=idAsiento;
    this.idCliente=idCliente;
    this.fechaCompra=fechaCompra;
} 
    
public Compra(int idAsiento ,int idCliente, LocalDate fechaCompra ){
    this.idAsiento=idAsiento;
    this.idCliente=idCliente;
    this.fechaCompra=fechaCompra;
}    

public Compra(int idCompra ){
    this.idCompra=idCompra;    
}   

  public  Compra() {
        
    }

    public int getIdCompra() {
        return idCompra;
    }
  public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }
  public int getIdAsiento() {
        return idAsiento;
    }
    public void setIdAsiento(int idAsiento) {
        this.idAsiento = idAsiento;
    }
    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public LocalDate getFechaCompra() {
        return fechaCompra;
    }
    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
}
