/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license Click
 * nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this
 * template
 */
package logica.dominio;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Nicolas
 */
public abstract class Bonificacion {
  // ATRIBUTOS
  private String nombre;
  private Asignacion asignacion;
  private ArrayList<Puesto> puestos = new ArrayList();

  // CONSTRUCTOR
  public Bonificacion(String nombre) { this.nombre = nombre; }

  // GETTERS
  public String getNombre() { return nombre; }
  public Asignacion getAsignacion() { return asignacion; }
  public ArrayList<Puesto> getPuestos() { return puestos; }

  public abstract double calcular(Date fecha, boolean frecuente);
}
