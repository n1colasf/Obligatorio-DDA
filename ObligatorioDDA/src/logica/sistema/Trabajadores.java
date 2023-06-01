/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license Click
 * nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this
 * template
 */
package logica.sistema;

import java.util.Date;
import logica.dominio.Bonificacion;

/**
 *
 * @author Nicolas
 */
public class Trabajadores extends Bonificacion {

  public Trabajadores(String nombre) { super(nombre); }

  @Override
  public double calcular(Date fecha, boolean frecuente) {
    // Trabajadores: Tienen un 80% de descuento si el tránsito por el puesto se
    // realiza en un día de semana.
    if (fecha.getDay() == 0 || fecha.getDay() == 6) {
      return 1;
    } else {
      return 0.2;
    }
  }
}