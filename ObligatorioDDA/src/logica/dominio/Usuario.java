/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.dominio;

import controladores.ControladorSolicitarRecargas;
import logica.observador.Observable;

/**
 *
 * @author Nicolas
 */
public abstract class Usuario extends Observable {
    //ATRIBUTOS
    private int cedula;
    private String password;
    private String nombreCompleto;
    
    //CONSTRUCTOR
    public Usuario(int cedula, String password, String nombreCompleto) {
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
}
