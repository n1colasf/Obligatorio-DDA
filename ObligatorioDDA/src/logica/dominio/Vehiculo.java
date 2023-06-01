/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.dominio;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Nicolas
 */

public class Vehiculo {
    //ATRIBUTOS
    private String matricula;
    private String modelo;
    private String color;
    private Propietario propietario;
    private Categoria categoria;
    private ArrayList<Transito> transitos = new ArrayList();

    //CONSTRUCTOR
    public Vehiculo(String matricula, String modelo, String color, Propietario propietario, Categoria categoria) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
        this.propietario = propietario;
        this.categoria = categoria;
    }

    //GETTERS
    public String getMatricula() {
        return matricula;
    }
    public String getModelo() {
        return modelo;
    }
    public String getColor() {
        return color;
    }
    public Propietario getPropietario() {
        return propietario;
    }
    public Categoria getCategoria() {
        return categoria;
    }
    public ArrayList<Transito> getTransitos() {
        return transitos;
    }

    public boolean frecuenciaVehiculo (Puesto puesto, Date fecha) {
        int frecuencia = 0;
        for (Transito transito : transitos) {
            if (transito.getPuesto().equals(puesto) && transito.getFecha() == fecha) {
                frecuencia++;
            }
        }
        return frecuencia > 1;
    }

    public Asignacion obtenerAsignacion(Puesto puesto) {
       return getPropietario().getAsignacion(puesto);
    }
}
