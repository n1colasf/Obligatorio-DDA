package controladores;

import java.util.ArrayList;
import logica.dominio.Propietario;
import logica.dominio.Transito;
import logica.dominio.Vehiculo;
import logica.observador.Observable;
import logica.observador.Observador;
import logica.sistema.Fachada;

public class ControladorTableroControl implements Observador {

  private VistaTableroControl vista;
  private Propietario propietario;

  public ControladorTableroControl(VistaTableroControl vista,
                                   Propietario propietario) {
    this.vista = vista;
    this.propietario = propietario;
    propietario.agregarObservador(this);
    inicializar();
  }

  public void mostrarTransito() {
    ArrayList<Transito> transitos = propietario.obtenerTransitos();
    vista.mostrarTransito(transitos);
  }

  public void mostrarVehiculo() {
    vista.mostrarVehiculo(propietario.getVehiculos());
  }

  public void mostrarNotificaciones() {

    vista.mostrarNotificaciones(propietario.getNotificaciones());
  }

  public void mostrarBonificaciones() {
    vista.mostrarBonificaciones(propietario.getAsignaciones());
  }

  public void mostrarRecargas() {

    vista.mostrarRecargas(propietario.getRecargas());
  }

  private void inicializar() {
    mostrarCantidadDatos();
    mostrarTransito();
    mostrarVehiculo();
    mostrarNotificaciones();
    mostrarBonificaciones();
    mostrarRecargas();
    mostrarDatosProp();
  }

  public void borrarNotificaciones() {

    this.propietario.borrarNotificaciones();
  }

  @Override
  public void actualizar(Object evento, Observable origen) {
    mostrarCantidadDatos();
    if (evento.equals(Propietario.eventos.cambioListaRecargas)) {
      mostrarRecargas();
      mostrarDatosProp();
    }
    if (evento.equals(Propietario.eventos.cambiosListaBonificaciones)) {
      mostrarBonificaciones();
    }
    if (evento.equals(Propietario.eventos.cambioListaNotificaciones)) {
      mostrarNotificaciones();
    }
    if (evento.equals(Propietario.eventos.cambioListaVehiculo)) {
      mostrarVehiculo();
    }
    if (evento.equals(Propietario.eventos.cambioListaTransitos)) {
      mostrarTransito();
      mostrarVehiculo();
    }
  }

  public void salir() { propietario.quitarObservador(this); }

  private void mostrarDatosProp() { vista.mostrarDatosProp(propietario); }

  private void mostrarCantidadDatos() {
    int cantVehiculos = propietario.getVehiculos().size();
    int cantNotificaciones = propietario.getNotificaciones().size();
    int cantAsignaciones = propietario.getAsignaciones().size();
    int cannTransitos = propietario.obtenerTransitos().size();
    int cantRecargas = propietario.getRecargas().size();
    vista.mostrarCantidadDatos(cantVehiculos, cantNotificaciones,
                               cantAsignaciones, cannTransitos, cantRecargas);
  }
}
