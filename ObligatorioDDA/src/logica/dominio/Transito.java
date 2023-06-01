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
    private double monto;
    private Vehiculo vehiculo;
    private Puesto puesto;
    private Asignacion asignacion;

    
    //CONSTRUCTOR
    public Transito(Date fecha, double monto, Vehiculo vehiculo, Puesto puesto) {
        this.asignacion = vehiculo.obtenerAsignacion(puesto);
        this.fecha = fecha;
        this.monto = CalcularMonto(monto, fecha, vehiculo, puesto);
        this.vehiculo = vehiculo;
        this.puesto = puesto;
    }

    //GETTERS
    public Date getFecha() {
        return fecha;
    }
    public double getMonto() {
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

    private double CalcularMonto(double monto, Date fecha, Vehiculo vehiculo, Puesto puesto) {
        double montoFinal = monto;
        double descuento = 1;
        if (asignacion != null) {
            descuento = asignacion.getBonificacion().calcular(fecha, vehiculo.frecuenciaVehiculo(puesto, fecha));
            montoFinal = monto * descuento;
        }
        return montoFinal;
    }
}
