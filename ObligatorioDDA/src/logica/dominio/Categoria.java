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
    private Tarifa tarifa;
    private ArrayList<Vehiculo> vehiculos;
    
    //CONSTRUCTOR
    public Categoria(String nombre, Tarifa tarifa) {
        this.nombre = nombre;
        this.tarifa = tarifa;
    }
    
    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }
     
    
}
