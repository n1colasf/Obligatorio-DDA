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
public class Asignacion {
    //ATRIBUTOS
    private Date fecha = new Date();
    private Bonificacion bonificacion;
    private Puesto puesto;
    private Propietario propietario;
    private Administrador administrador;
    
    //CONSTRUCTOR
    public Asignacion(Date fecha, Bonificacion bonificacion, Puesto puesto, Propietario propietario, Administrador administrador) {
        this.fecha = fecha;
        this.bonificacion = bonificacion;
        this.puesto = puesto;
        this.propietario = propietario;
        this.administrador = administrador;
    }
    
    //GETTERS
    public Date getFecha() {
        return fecha;
    }

    public Bonificacion getBonificacion() {
        return bonificacion;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public Administrador getAdministrador() {
        return administrador;
    }
    
    

    
    
}
