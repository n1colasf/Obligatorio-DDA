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

public class Propietario {
    //ATRIBUTOS
    private int cedula;
    private String password;
    private String nombreCompleto;
    private int saldo;
    private ArrayList<Vehiculo> vehiculos = new ArrayList();
    private ArrayList<Notificacion> notificaciones = new ArrayList();
    private ArrayList<Recarga> recargas = new ArrayList();
    
    //CONSTRUCTOR
    public Propietario(int cedula, String password, String nombreCompleto) {
        this.cedula = cedula;
        this.password = password;
        this.nombreCompleto = nombreCompleto;
    }

    //GETTERS
    public int getCedula() {
        return cedula;
    }
    public String getPassword() {
        return password;
    }
    public String getNombreCompleto() {
        return nombreCompleto;
    }
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
    
    
}
