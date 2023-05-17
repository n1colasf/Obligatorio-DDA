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
public class Bonificacion {
    //ATRIBUTOS
    private String nombre;
    private ArrayList<Asignacion> asignaciones = new ArrayList();
    private ArrayList<Puesto> puestos = new ArrayList();
    
    //CONSTRUCTOR
    public Bonificacion(String nombre) {
        this.nombre = nombre;
    }

    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Asignacion> getAsignaciones() {
        return asignaciones;
    }

    public ArrayList<Puesto> getPuestos() {
        return puestos;
    }
    
    
}
