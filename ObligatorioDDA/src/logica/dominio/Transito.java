
package logica.dominio;

import java.time.LocalDate;


public class Transito {
  // ATRIBUTOS
  private LocalDate fecha;
  private double monto;
  private double descuento;
  private double total;
  private Vehiculo vehiculo;
  private Puesto puesto;
  private Asignacion asignacion;

  // CONSTRUCTOR
  public Transito( Vehiculo vehiculo, Puesto puesto) {
    this.fecha=LocalDate.now();
    this.vehiculo = vehiculo;
    this.puesto = puesto;
    this.asignacion = vehiculo.obtenerAsignacion(this.puesto);
    this.monto = vehiculo.getMontoTarifa(this.puesto);
    this.total = CalcularMonto(this.monto, this.fecha, this.puesto);
    this.descuento = this.total - this.monto;
  }

  // GETTERS
  public LocalDate getFecha() { return fecha; }
  public double getMonto() { return monto; }
  public double getDescuento() { return descuento; }
  public double getTotal() { return total; }
  public Vehiculo getVehiculo() { return vehiculo; }
  public Puesto getPuesto() { return puesto; }
  public Asignacion getAsignacion() { return asignacion; }

  // SETTERS
  public void setAsignacion(Asignacion asignacion) {
    this.asignacion = asignacion;
  }

  private double CalcularMonto(double monto, LocalDate fecha,
                               Puesto puesto) {
    double montoFinal = monto;
    double descuento = 1;
    if (asignacion != null) {
      descuento = asignacion.getBonificacion().calcular(fecha, this.vehiculo.frecuenciaVehiculo(puesto, fecha));
      montoFinal = monto * descuento;
    }
    return montoFinal;
  }
}
