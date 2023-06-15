package logica.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import logica.sistema.Fachada;
import logica.sistema.PeajeException;

public class Propietario extends Usuario {
  // ATRIBUTOS

  private int saldo = 0;
  private ArrayList<Vehiculo> vehiculos = new ArrayList();
  private ArrayList<Notificacion> notificaciones = new ArrayList();
  private ArrayList<Recarga> recargas = new ArrayList();
  private ArrayList<Asignacion> asignaciones = new ArrayList();

  // CONSTRUCTOR
  public Propietario(int cedula, String password, String nombreCompleto) {
    super(cedula, password, nombreCompleto);
  }

  // GETTERS
  public int getSaldo() { return saldo; }

  public ArrayList<Vehiculo> getVehiculos() { return vehiculos; }

  public ArrayList<Notificacion> getNotificaciones() { return notificaciones; }

  public ArrayList<Recarga> getRecargas() { return recargas; }

  public ArrayList<Asignacion> getAsignaciones() { return asignaciones; }

  // SETTERS
  public void setSaldo(int saldo) { this.saldo = saldo; }

  public Asignacion getAsignacion(Puesto puesto) {
    Asignacion asignacion = null;
    for (Asignacion a : asignaciones) {
      if (a.getPuesto().equals(puesto)) {
        asignacion = a;
      }
    }
    return asignacion;
  }

  // CREAR VEHICULO
  public void crearVehiculo(String matricula, String modelo, String color,
                            Categoria categoria) {
    Vehiculo vehiculo = new Vehiculo(matricula, modelo, color, this, categoria);
    if (vehiculo != null) {
      vehiculos.add(vehiculo);
      avisar(eventos.cambioListaVehiculo);
    }
  }

  public void agregarAsignacion(Asignacion a) {
    asignaciones.add(0, a);
    avisar(eventos.cambiosListaBonificaciones);
    a.getAdministrador().avisar(
        Administrador.eventos.cambiosListaBonificaciones);
  }

  public void hayAsignacionEnPuesto(Puesto puesto) throws PeajeException {
    Asignacion a = getAsignacion(puesto);
    if (a != null) {
      throw new PeajeException(
          "Ya tiene una bonificación asignada para ese puesto");
    }
  }

  public void borrarNotificaciones() {

    this.notificaciones = new ArrayList<>();
    avisar(eventos.cambioListaNotificaciones);
  }

  public ArrayList<Recarga> getRecargasSinAprobar() {

    ArrayList<Recarga> aux = new ArrayList<>();

    for (Recarga r : this.getRecargas()) {

      if (r.getAdministrador() == null) {
        aux.add(r);
      }
    }
    return aux;
  }

  public Vehiculo getVehiculoMatricula(String matricula) {

    for (Vehiculo v : vehiculos) {

      if (v.getMatricula().equals(matricula)) {
        return v;
      }
    }
    return null;
  }

  public void agregarRecarga(Recarga r) throws PeajeException {
    if (r.getMonto() >= 1) {
      recargas.add(0, r);
      avisar(eventos.cambioListaRecargas);
      Fachada.getInstancia().avisarAdminsConectados(
          Administrador.eventos.cambioListaRecargas);
    } else {
      throw new PeajeException("Monto inválido");
    }
  }

  public void agregarNotificacion(Notificacion n) {
    notificaciones.add(0, n);
    avisar(eventos.cambioListaNotificaciones);
  }

  public Vehiculo obtenerVehiculoMatricula(String matricula) {
    for (Vehiculo v : vehiculos) {
      if (v.getMatricula().equals(matricula)) {
        return v;
      }
    }
    return null;
  }

  public ArrayList<Transito> obtenerTransitos() {
    ArrayList<Transito> transitos = new ArrayList<>();
    for (Vehiculo v : vehiculos) {
      transitos.addAll(v.getTransitos());
    }
    return transitos;
  }

  public void actualizarSaldoRecarga(Recarga r) {
    saldo = saldo + r.getMonto();
    avisar(eventos.cambioListaRecargas);
  }

  public void actualizarSaldoTransito(Transito t) {
    this.saldo = (int)(saldo - t.getTotal());
    avisar(eventos.cambioListaTransitos);
  }
}
