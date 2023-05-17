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
    private Vehiculo vehiculo;
    private Puesto puesto;
    
    //CONSTRUCTOR
    public Transito(Date fecha, Vehiculo vehiculo, Puesto puesto) {
        this.fecha = fecha;
        this.vehiculo = vehiculo;
        this.puesto = puesto;
    }
    
    //GETTERS
    public Date getFecha() {
        return fecha;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Puesto getPuesto() {
        return puesto;
    }
    
    
}
