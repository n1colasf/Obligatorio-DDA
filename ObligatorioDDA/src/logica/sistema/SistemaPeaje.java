/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.sistema;

import java.util.ArrayList;
import logica.dominio.Categoria;
import logica.dominio.Propietario;
import logica.dominio.Puesto;
import logica.dominio.Recarga;

/**
 *
 * @author Nicolas
 */
public class SistemaPeaje {
     //ATRIBUTOS
    private ArrayList<Puesto> puestos = new ArrayList();
    private ArrayList<Recarga> recargas = new ArrayList();
    private ArrayList<TipoBonificacion> tipoBonificaciones= new ArrayList();
    private ArrayList<Categoria> categorias = new ArrayList();
    
    //FUNCIONES AGREGAR
    public void agregarPuesto(String pass,String nombreCompleto){
        puestos.add(new Puesto(pass, nombreCompleto));
    }
    
    public void agregarRecarga(int monto, Propietario propietario) {
        recargas.add(new Recarga(monto, propietario));
    }
    
    public void agregarTipoBonificacion(String nombre){
        tipoBonificaciones.add(new TipoBonificacion(nombre));
    }
    
    public void agregarCategoria(String nombre) {
        categorias.add(new Categoria(nombre));
    }
    
    //GETTERS
    public ArrayList<Puesto> getPuestos() {
        return puestos;
    }

    public ArrayList<Recarga> getRecargas() {
        return recargas;
    }

    public ArrayList<TipoBonificacion> getTipoBonificaciones() {
        return tipoBonificaciones;
    }

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }
    
}
