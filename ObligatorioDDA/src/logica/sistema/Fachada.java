/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license Click
 * nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this
 * template
 */
package logica.sistema;

import java.util.ArrayList;
import logica.dominio.Categoria;
import logica.dominio.Propietario;
import logica.dominio.Puesto;

/**
 *
 * @author Nicolas
 */
public class Fachada {
    
    //INICIALIZAR CONTROLES
    private SistemaAcceso sAcceso = new SistemaAcceso();
    private SistemaPeaje sPeaje = new SistemaPeaje();


    //INSTANCIA ESTATICA
    private static Fachada instancia = new Fachada();

    //GET INSTANCIA
    public static Fachada getInstancia() {
        return instancia;
    }
    
    //CONSTRUCTOR
    private Fachada() {
    }
    
    //AGREGAR PROPIETARIO
    public void agregarPropietario(int cedula,String pass,String nombreCompleto){
        sAcceso.agregarPropietario(cedula, pass, nombreCompleto);
    }
    
    //AGREGAR ADMINISTRADOR
    public void agregarAdministrador(int cedula,String pass,String nombreCompleto){
        sAcceso.agregarAdministrador(cedula, pass, nombreCompleto);  
    } 
        
    //LOGIN ADMINISTRADOR
     public void loginAdministrador(int cedula, String pass) {
         sAcceso.loginAdministrador(cedula, pass);
     }
     
     //LOGIN PROPIETARIO
     public void loginPropietario(int cedula,String pass){ 
         sAcceso.loginPropietario(cedula, pass);
     }
     
    //AGREGAR PUESTO
     public void agregarPuesto(String pass,String nombreCompleto){
        sPeaje.agregarPuesto(pass, nombreCompleto);
    }
     
    //AGREGAR RECARGA
     public void agregarRecarga(int monto, Propietario propietario){
         sPeaje.agregarRecarga(monto, propietario);
     }
     
     //AGREGAR BONIFICACION
     public void agregarTipoBonificacion(String nombre){
        sPeaje.agregarTipoBonificacion(nombre);
     }
    
     //AGREGAR CATEGORIA
     public void agregarCategoria(String nombre) {
         sPeaje.agregarCategoria(nombre);
     }
     
     //GET CATEGORIAS
     public ArrayList<Categoria> getCategorias() {
        return sPeaje.getCategorias();
    }

    //GET PUESTOS
    public ArrayList<Puesto> getPuestos() {
        return sPeaje.getPuestos();
    }
    
    //GET PROPIETARIOS
    public ArrayList<Propietario> getPropietarios() {
        return sAcceso.getPropietarios();
    }
    
    public ArrayList<TipoBonificacion> getTipoBonificaciones() {
        return sPeaje.getTipoBonificaciones();
    }
}
