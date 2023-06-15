
package logica.sistema;

import java.util.ArrayList;
import java.time.LocalDate;
import logica.dominio.Bonificacion;
import logica.dominio.Vehiculo;


public class Frecuentes extends Bonificacion {

  public Frecuentes(String nombre) { super(nombre); }

  @Override
  public double calcular(LocalDate fecha, boolean frecuente) {

    if (frecuente) {

      return 0.5;
    } else {
      return 1;
    }
  }
  
  
}
