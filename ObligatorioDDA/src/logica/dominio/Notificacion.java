package logica.dominio;

import java.time.LocalDate;

public class Notificacion {

  // ATRIBUTOS
  private String mensaje;
  private LocalDate fecha;
  private Propietario propietario;

  // CONSTRUCTOR
  public Notificacion(String mensaje, LocalDate fecha,
                      Propietario propietario) {
    this.mensaje = mensaje;
    this.fecha = fecha;
    this.propietario = propietario;
  }

  // GETTERS
  public String getMensaje() { return mensaje; }

  public LocalDate getFecha() { return fecha; }

  public Propietario getPropietario() { return propietario; }
}
