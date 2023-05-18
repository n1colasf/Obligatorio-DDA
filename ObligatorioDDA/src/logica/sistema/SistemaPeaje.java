/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.sistema;

import java.util.ArrayList;
import logica.dominio.Puesto;

/**
 *
 * @author Nicolas
 */
public class SistemaPeaje {
     //ATRIBUTOS
    private ArrayList<Puesto> puestos = new ArrayList();
    
    //FUNCIONES AGREGAR
    public void agregarPuesto(String pass,String nombreCompleto){
        puestos.add(new Puesto(pass, nombreCompleto));
    }
    
}
