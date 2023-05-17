/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.dominio;

/**
 *
 * @author Nicolas
 */
public abstract class Usuario {
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
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    
    
}
