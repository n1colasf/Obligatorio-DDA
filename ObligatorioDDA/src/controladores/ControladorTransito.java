package controladores;

import java.util.ArrayList;
import logica.dominio.Administrador;
import logica.sistema.PeajeException;
import logica.dominio.Propietario;
import logica.dominio.Puesto;
import logica.dominio.Transito;
import logica.dominio.Vehiculo;
import logica.sistema.Fachada;

public class ControladorTransito {

    private Administrador admin;
    private VistaTransito vista;

    public ControladorTransito(VistaTransito vista, Administrador admin) {
        this.admin = admin;
        this.vista = vista;
        cargarPuestos();
    }

    public void cargarPuestos() {

        vista.cargarPuestos(Fachada.getInstancia().getPuestos());
    }

    public void cargarTarifas(Puesto puesto) {

        vista.cargarTarifas(puesto.getTarifas());
    }

    public void registrarTransito(Puesto puesto, String matricula) {
        try {
            Vehiculo v = Fachada.getInstancia().obtenerVehiculoMatricula(matricula);
            Propietario p = Fachada.getInstancia().obtenerVehiculoMatricula(matricula).getPropietario();
            Transito t = new Transito(v, puesto);
            v.agregarTransito(t);
        } catch (PeajeException ex) {
            vista.error(ex.getMessage());
        }
    }
}
