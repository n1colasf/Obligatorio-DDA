/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.dominio;

import java.util.ArrayList;

/**
 *
 * @author Nicolas
 */

public class Propietario extends Usuario {
    //ATRIBUTOS
    private int saldo;
    private ArrayList<Vehiculo> vehiculos = new ArrayList();
    private ArrayList<Notificacion> notificaciones = new ArrayList();
    private ArrayList<Recarga> recargas = new ArrayList();
    private ArrayList<Asignacion> asignaciones = new ArrayList();   
    
    //CONSTRUCTOR
    public Propietario(int saldo, int cedula, String password, String nombreCompleto) {
        super(cedula, password, nombreCompleto);
        this.saldo = saldo;
    }

    //GETTERS
    public int getSaldo() {
        return saldo;
    }
    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }
    public ArrayList<Notificacion> getNotificaciones() {
        return notificaciones;
    }
    public ArrayList<Recarga> getRecargas() {
        return recargas;
    }
    public ArrayList<Asignacion> getAsignaciones() {
        return asignaciones;
    }  
}
