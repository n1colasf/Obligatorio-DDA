
package logica.sistema;
import java.time.LocalDate;
import logica.dominio.Bonificacion;

public class Exonerados extends Bonificacion {

  public Exonerados(String nombre) { super(nombre); }

  @Override
  public double calcular(LocalDate fecha, boolean frecuente) {
    // los exonerados no pagan la tarifa del peaje
    return 0;
  }
}
