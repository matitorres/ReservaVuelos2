/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservadevuelos.modelo;



public class Cliente implements Comparable <Cliente>{
    private int id;
    private String nombre;
    private String apellido;
    private int tarjeta;
    private int pasaporte;
    private int dni;
    private String mail;

    public Cliente(int id, String nombre, String apellido, int dni, String mail, int pasaporte, int tarjeta) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tarjeta = tarjeta;
        this.pasaporte = pasaporte;
        this.dni = dni;
        this.mail = mail;
    }
    
    //CONSTRUCTOR POR DEFECTO, UTILIZADO PARA LUEGO MODIFICARLO CAMPO POR CAMPO
    public Cliente(){
        this.id = 0;
        this.nombre = "defecto";
        this.apellido = "defecto";
        this.tarjeta = 0;
        this.pasaporte = 0;
        this.dni = 0;
        
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    

    public String getMail() {
        return mail;
    }
    

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getTarjeta() {
        return tarjeta;
    }

    public int getPasaporte() {
        return pasaporte;
    }

    public int getDni() {
        return dni;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTarjeta(int tarjeta) {
        this.tarjeta = tarjeta;
    }

    public void setPasaporte(int pasaporte) {
        this.pasaporte = pasaporte;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
    
     public int compareTo(Cliente o) {
        return(this.dni - o.getPasaporte());
    }
    
 

}
