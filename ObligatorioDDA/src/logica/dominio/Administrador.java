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
public class Administrador {
    //ATRIBUTOS
    private int cedula;
    private String password;
    private String nombreCompleto;
    private ArrayList<Asignacion> asignaciones = new ArrayList();
    private ArrayList<Recarga> recargas = new ArrayList();
    
    //CONSTRUCTOR
    public Administrador(int cedula, String password, String nombreCompleto) {
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

    public ArrayList<Asignacion> getAsignaciones() {
        return asignaciones;
    }

    public ArrayList<Recarga> getRecargas() {
        return recargas;
    }
    
    
}
