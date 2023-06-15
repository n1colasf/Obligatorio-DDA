
package logica.dominio;

import java.util.Date;

public class Recarga {
  // ATRIBUTOS
  private int monto;
  private Date fecha = new Date();
  private Propietario propietario;
  private Administrador administrador = null;

  // CONSTRUCTOR
  public Recarga(int monto, Propietario propietario) {
    this.monto = monto;
    this.propietario = propietario;
  }

  // GETTERS
  public int getMonto() { return monto; }
  public Date getFecha() { return fecha; }
  public Propietario getPropietario() { return propietario; }
  public Administrador getAdministrador() { return administrador; }

  // SETTERS
  public void setAdministrador(Administrador administrador) {
    this.administrador = administrador;
  }

  @Override
  public String toString() {
    return String.valueOf(monto);
  }
}
