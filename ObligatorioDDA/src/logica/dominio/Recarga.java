/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.dominio;

import java.util.Date;

/**
 *
 * @author Nicolas
 */
public class Recarga {
    //ATRIBUTOS
    private int monto;
    private Date fecha = new Date();
    private Propietario propietario;
    private Administrador administrador = null;
    
    //CONSTRUCTOR
    public Recarga(int monto, Propietario propietario) {
        this.monto = monto;
        this.propietario = propietario;
    }
    
    //GETTERS
    public int getMonto() {
        return monto;
    }
    public Date getFecha() {
        return fecha;
    }
    public Propietario getPropietario() {
        return propietario;
    }
    public Administrador getAdministrador() {
        return administrador;
    }
    
    //SETTERS
    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }
}
