package logica.sistema;

import java.util.ArrayList;
import logica.dominio.Administrador;
import logica.dominio.Bonificacion;
import logica.dominio.Categoria;
import logica.dominio.Propietario;
import logica.dominio.Puesto;
import logica.dominio.Vehiculo;

public class Fachada {

  public enum eventos {
    cambiosListaRecarga,
    cambiosListaTransito,
    cambiosListaBonificaciones,
    cambioListaNotificaciones
  }
  ;

  // INICIALIZAR CONTROLES
  private SistemaAcceso sAcceso = new SistemaAcceso();
  private SistemaPeaje sPeaje = new SistemaPeaje();

  // INSTANCIA ESTATICA
  private static Fachada instancia = new Fachada();

  // GET INSTANCIA
  public static Fachada getInstancia() { return instancia; }

  // CONSTRUCTOR
  private Fachada() {}

  // AGREGAR PROPIETARIO
  public void agregarPropietario(int cedula, String pass,
                                 String nombreCompleto) {
    sAcceso.agregarPropietario(cedula, pass, nombreCompleto);
  }

  // AGREGAR ADMINISTRADOR
  public void agregarAdministrador(int cedula, String pass,
                                   String nombreCompleto) {
    sAcceso.agregarAdministrador(cedula, pass, nombreCompleto);
  }

  // LOGIN ADMINISTRADOR
  public Administrador loginAdministrador(int cedula, String pass)
      throws PeajeException {
    Administrador admin = sAcceso.loginAdministrador(cedula, pass);
    if (sAcceso.adminConectado(admin)) {
      throw new PeajeException("Ud. Ya está logueado");
    } else {
      if (admin != null) {
        sAcceso.agregarAdminConectado(admin);
        return admin;
      } else {
        throw new PeajeException("Acceso denegado");
      }
    }
  }

  // QUITAR SESIÓN ADMINISTRADOR
  public void quitarSesionAdmin(Administrador admin) {
    sAcceso.quitarSesionAdmin(admin);
  }

  // LOGIN PROPIETARIO
  public Propietario loginPropietario(int cedula, String pass)
      throws PeajeException {
    if (String.valueOf(cedula) == "" || pass == "") {
      throw new PeajeException("Ingrese valores");
    }
    Propietario prop = sAcceso.loginPropietario(cedula, pass);
    if (prop != null) {
      return prop;
    } else {
      throw new PeajeException("Acceso denegado");
    }
  }

  // AGREGAR PUESTO
  public void agregarPuesto(String pass, String nombreCompleto) {
    sPeaje.agregarPuesto(pass, nombreCompleto);
  }

  // AGREGAR RECARGA
  public void agregarRecarga(int monto, Propietario propietario) {
    sPeaje.agregarRecarga(monto, propietario);
  }

  // AGREGAR BONIFICACION
  public void agregarTipoBonificacion(String nombre) {
    sPeaje.agregarTipoBonificacion(nombre);
  }

  public Bonificacion asignarTipoBonificacion(String tipoBonificacion)
      throws PeajeException {
    if (!tipoBonificacion.trim().equals("")) {
      return sPeaje.asignarTipoBonificacion(tipoBonificacion);
    } else {
      throw new PeajeException("Debe especificar una bonificación");
    }
  }

  // AGREGAR CATEGORIA
  public void agregarCategoria(String nombre) {
    sPeaje.agregarCategoria(nombre);
  }

  // GET CATEGORIAS
  public ArrayList<Categoria> getCategorias() { return sPeaje.getCategorias(); }

  // GET PUESTOS
  public ArrayList<Puesto> getPuestos() { return sPeaje.getPuestos(); }

  public Puesto buscarPuestoNombre(String nombrePuesto) throws PeajeException {
    if (!nombrePuesto.trim().equals("")) {
      return sPeaje.buscarPuestoNombre(nombrePuesto);
    } else {
      throw new PeajeException("Debe especificar un puesto");
    }
  }

  // GET PROPIETARIOS
  public ArrayList<Propietario> getPropietarios() {
    return sAcceso.getPropietarios();
  }

  public Propietario buscarPropietario(int cedula) throws PeajeException {
    Propietario p = sAcceso.buscarPropietario(cedula);
    if (p != null) {
      return sAcceso.buscarPropietario(cedula);
    } else {
      throw new PeajeException("No existe el propietario");
    }
  }

  public ArrayList<TipoBonificacion> getTipoBonificaciones() {
    return sPeaje.getTipoBonificaciones();
  }

  public Vehiculo obtenerVehiculoMatricula(String matricula)
      throws PeajeException {
    Vehiculo v = sAcceso.obtenerVehiculoMatricula(matricula);
    if (v != null) {
      return sAcceso.obtenerVehiculoMatricula(matricula);
    } else {
      throw new PeajeException("No existe el vehículo");
    }
  }

  public int getSaldoMinimo() { return sPeaje.getSaldoMinimo(); }

  public void avisarAdminsConectados(Object evento) {
    sAcceso.avisarAdminsConectados(evento);
  }
}
