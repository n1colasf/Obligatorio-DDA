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
}
