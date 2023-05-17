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
public class Puesto {
    //ATRIBUTOS
    private String nombre;
    private String direccion;
    private ArrayList<Tarifa> tarifas = new ArrayList();
    private ArrayList<Transito> transitos = new ArrayList();
    private ArrayList<Bonificacion> bonificaciones = new ArrayList();
    
    //CONSTRUCTOR
    public Puesto(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public ArrayList<Tarifa> getTarifas() {
        return tarifas;
    }

    public ArrayList<Transito> getTransitos() {
        return transitos;
    }

    public ArrayList<Bonificacion> getBonificaciones() {
        return bonificaciones;
    }
    
    
}
