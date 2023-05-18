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
public class Categoria {
    //ATRIBUTOS
    private String nombre;
    private ArrayList<Tarifa> tarifas = new ArrayList();
    private ArrayList<Vehiculo> vehiculos;
    
    //CONSTRUCTOR
    public Categoria(String nombre) {
        this.nombre = nombre;
    }
    
    //GETTERS
    public String getNombre() {
        return nombre;
    }
    public ArrayList<Tarifa> getTarifas() {
        return tarifas;
    }
    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }
}
