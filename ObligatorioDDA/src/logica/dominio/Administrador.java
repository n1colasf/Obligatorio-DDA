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
public class Administrador extends Usuario {
    //ATRIBUTOS
    private ArrayList<Recarga> recargas = new ArrayList();
    
    //CONSTRUCTOR
    public Administrador(int cedula, String password, String nombreCompleto) {
        super(cedula, password, nombreCompleto);
    }
    
    //GETTERS
    public ArrayList<Recarga> getRecargas() {
        return recargas;
    }
}
