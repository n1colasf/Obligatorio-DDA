package logica.sistema;

import java.util.ArrayList;
import logica.dominio.Bonificacion;
import logica.dominio.Categoria;
import logica.dominio.Propietario;
import logica.dominio.Puesto;
import logica.dominio.Recarga;

public class SistemaPeaje {
  // ATRIBUTOS

  private ArrayList<Puesto> puestos = new ArrayList();
  private ArrayList<Recarga> recargas = new ArrayList();
  private ArrayList<TipoBonificacion> tipoBonificaciones = new ArrayList();
  private ArrayList<Categoria> categorias = new ArrayList();
  int saldoMinimo = 100;

  // FUNCIONES AGREGAR
  public void agregarPuesto(String pass, String nombreCompleto) {
    puestos.add(new Puesto(pass, nombreCompleto));
  }

  public void agregarRecarga(int monto, Propietario propietario) {
    recargas.add(new Recarga(monto, propietario));
  }

  public void agregarTipoBonificacion(String nombre) {
    tipoBonificaciones.add(new TipoBonificacion(nombre));
  }

  public void agregarCategoria(String nombre) {
    categorias.add(new Categoria(nombre));
  }

  // GETTERS
  public ArrayList<Puesto> getPuestos() { return puestos; }

  public ArrayList<Recarga> getRecargas() { return recargas; }

  public ArrayList<TipoBonificacion> getTipoBonificaciones() {
    return tipoBonificaciones;
  }

  public ArrayList<Categoria> getCategorias() { return categorias; }

  public int getSaldoMinimo() { return saldoMinimo; }

  Puesto buscarPuestoNombre(String nombrePuesto) {

    for (Puesto pues : puestos) {
      if (pues.getNombre().equals(nombrePuesto)) {
        return pues;
      }
    }
    return null;
  }

  public Bonificacion asignarTipoBonificacion(String tipoBonificacion) {
    Bonificacion aux = null;
    if (tipoBonificacion != null) {
      if (tipoBonificacion.equals("Exonerados")) {
        aux = new Exonerados(tipoBonificacion);
      }
      if (tipoBonificacion.equals("Frecuentes")) {
        aux = new Frecuentes(tipoBonificacion);
      }
      if (tipoBonificacion.equals("Trabajadores")) {
        aux = new Trabajadores(tipoBonificacion);
      }
    }
    return aux;
  }
}
