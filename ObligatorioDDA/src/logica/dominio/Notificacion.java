/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.dominio;

import java.util.Date;

/**
 *
 * @author Nicolas
 */
public class Notificacion {
    //ATRIBUTOS
    private String mensaje;
    private Date fecha = new Date();
    private Propietario propietario;

    //CONSTRUCTOR
    public Notificacion(String mensaje, Date fecha, Propietario propietario) {
        this.mensaje = mensaje;
        this.fecha = fecha;
        this.propietario = propietario;
    }

    //GETTERS
    public String getMensaje() {
        return mensaje;
    }

    public Date getFecha() {
        return fecha;
    }

    public Propietario getPropietario() {
        return propietario;
    } 
}
