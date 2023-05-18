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
public class Transito {
    //ATRIBUTOS
    private Date fecha = new Date();
    private int monto;
    private Vehiculo vehiculo;
    private Puesto puesto;
    private Asignacion asignacion = null;

    
    //CONSTRUCTOR
    public Transito(Date fecha, int monto, Vehiculo vehiculo, Puesto puesto) {
        this.fecha = fecha;
        this.monto = monto;
        this.vehiculo = vehiculo;
        this.puesto = puesto;
    }
    
    //GETTERS
    public Date getFecha() {
        return fecha;
    }
    public int getMonto() {
        return monto;
    }
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public Puesto getPuesto() {
        return puesto;
    } 
    public Asignacion getAsignacion() {
        return asignacion;
    }
    
    //SETTERS
    public void setAsignacion(Asignacion asignacion) {
        this.asignacion = asignacion;
    }
    
}
