/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license Click
 * nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this
 * template
 */
package logica.sistema;

import java.util.ArrayList;
import java.util.Date;
import logica.dominio.Bonificacion;
import logica.dominio.Vehiculo;

/**
 *
 * @author Nicolas
 */
public class Frecuentes extends Bonificacion {

  public Frecuentes(String nombre) { super(nombre); }

  @Override
  public double calcular(Date fecha, boolean frecuente) {
    // Frecuentes: Tienen un 50% de descuento a partir del segundo transito
    // realizado en el día
    //  por un puesto determinado con el mismo vehículo. En el primer transito
    //  del día (con cada vehículo) no tienen descuento.
    if (frecuente) {
      return 0.5;
    } else {
      return 1;
    }
  }
}
