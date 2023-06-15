package logica.dominio;

import java.time.LocalDate;
import java.util.ArrayList;

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

  public abstract double calcular(LocalDate fecha, boolean frecuente);
}
