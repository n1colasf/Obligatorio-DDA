/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author Nicolas
 */
public class Fachada {
    
    //inicializar los controles...
    
    //instancia estatica de fachada
    private static Fachada instancia = new Fachada();

    public static Fachada getInstancia() {
        return instancia;
    }

    private Fachada() {
    }
    
}
