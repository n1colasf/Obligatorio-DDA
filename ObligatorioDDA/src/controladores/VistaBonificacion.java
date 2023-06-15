package controladores;

import java.util.ArrayList;
import logica.dominio.Asignacion;
import logica.dominio.Propietario;
import logica.dominio.Puesto;
import logica.sistema.TipoBonificacion;

public interface VistaBonificacion {

  public void mostrarBonificaciones(ArrayList<TipoBonificacion> tipos);

  public void mostrarPuestos(ArrayList<Puesto> puestos);

  public void mostrarInfoProp(Propietario p, ArrayList<Asignacion> a);

  public void error(String message);
}
