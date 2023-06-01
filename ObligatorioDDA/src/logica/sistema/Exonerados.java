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
public class Exonerados extends Bonificacion {

  public Exonerados(String nombre) { super(nombre); }

  @Override
  public double calcular(Date fecha, boolean frecuente) {
    // los exonerados no pagan la tarifa del peaje
    return 0;
  }
}
