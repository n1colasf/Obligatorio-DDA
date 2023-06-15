package controladores;

import java.util.ArrayList;
import logica.dominio.Puesto;
import logica.dominio.Tarifa;

public interface VistaTransito {

    public void cargarPuestos(ArrayList<Puesto> puestos);

    public void cargarTarifas(ArrayList<Tarifa> tarifas);

    public void error(String message);

}
