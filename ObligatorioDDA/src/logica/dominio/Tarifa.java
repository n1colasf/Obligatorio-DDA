/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.dominio;

/**
 *
 * @author Nicolas
 */
public class Tarifa {
    //ATRIBUTOS
    private int monto;
    private Categoria categoria;
    private Puesto puesto;
    
    //CONSTRUCTOR
    public Tarifa(int monto, Categoria categoria, Puesto puesto) {
        this.monto = monto;
        this.categoria = categoria;
        this.puesto = puesto;
    }
    
    //GETTERS
    public int getMonto() {
        return monto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Puesto getPuesto() {
        return puesto;
    }
    
    
    
}
