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
    private int saldo = 0;
    private ArrayList<Vehiculo> vehiculos = new ArrayList();
    private ArrayList<Notificacion> notificaciones = new ArrayList();
    private ArrayList<Recarga> recargas = new ArrayList();
    private ArrayList<Asignacion> asignaciones = new ArrayList();   
    
    //CONSTRUCTOR
    public Propietario(int cedula, String password, String nombreCompleto) {
        super(cedula, password, nombreCompleto);
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
    
    //SETTERS
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
}
