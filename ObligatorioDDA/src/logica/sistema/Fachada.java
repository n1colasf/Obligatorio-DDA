/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.sistema;

/**
 *
 * @author Nicolas
 */
public class Fachada {
    
    //INICIALIZAR CONTROLES
    private SistemaAcceso sAcceso = new SistemaAcceso();

    //INSTANCIA ESTATICA
    private static Fachada instancia = new Fachada();

    //GET INSTANCIA
    public static Fachada getInstancia() {
        return instancia;
    }
    
    //CONSTRUCTOR
    private Fachada() {
    }
    
    public void agregarPropietario(int cedula,String pass,String nombreCompleto){
        sAcceso.agregarPropietario(cedula, pass, nombreCompleto);
    }
    
    public void agregarAdministrador(int cedula,String pass,String nombreCompleto){
        sAcceso.agregarAdministrador(cedula, pass, nombreCompleto);  
    } 
}
