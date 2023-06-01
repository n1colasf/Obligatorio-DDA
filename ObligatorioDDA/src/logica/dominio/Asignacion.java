/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.dominio;

import java.util.ArrayList;
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
    private ArrayList<Transito> transitos = new ArrayList();
    private Propietario propietario;
    private Administrador administrador;
    
    //CONSTRUCTOR
    public Asignacion(Date fecha, Bonificacion bonificacion, Propietario propietario, Puesto puesto) {
        this.fecha = fecha;
        this.bonificacion = bonificacion;
        this.propietario = propietario;
        this.puesto = puesto;
    }
    
    //GETTERS
    public Date getFecha() {
        return fecha;
    }
    public Bonificacion getBonificacion() {
        return bonificacion;
    }
    public Propietario getPropietario() {
        return propietario;
    }
    public Administrador getAdministrador() {
        return administrador;
    }
    public Puesto getPuesto() {
        return puesto;
    }
    public ArrayList<Transito> getTransitos() {
        return transitos;
    }
    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }
}
