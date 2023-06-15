package controladores;

import java.util.ArrayList;
import logica.dominio.Administrador;
import logica.dominio.Asignacion;
import logica.dominio.Bonificacion;
import logica.sistema.PeajeException;
import logica.dominio.Propietario;
import logica.dominio.Puesto;
import logica.dominio.Usuario.eventos;
import logica.observador.Observable;
import logica.observador.Observador;
import logica.sistema.Fachada;

import logica.sistema.TipoBonificacion;

public class ControladorBonificaciones implements Observador {

    private Administrador admin;
    private VistaBonificacion vista;
    private Propietario propietario;

    public ControladorBonificaciones(VistaBonificacion vista, Administrador admin) {

        this.admin = admin;
        this.vista = vista;
        admin.agregarObservador(this);
        inicialiar();
    }

    public void inicialiar() {

        mostrarBonificaciones();
        mostrarPuestos();

    }

    @Override
    public void actualizar(Object evento, Observable origen) {
        if (evento.equals(Administrador.eventos.cambiosListaBonificaciones)) {
            mostrarBonificacionesPropietario(propietario);
        }
    }

    private void mostrarBonificaciones() {

        ArrayList<TipoBonificacion> tipos = Fachada.getInstancia().getTipoBonificaciones();

        vista.mostrarBonificaciones(tipos);
    }

    public void salir() {
        admin.quitarObservador(this);
    }

    private void mostrarPuestos() {

        ArrayList<Puesto> puestos = Fachada.getInstancia().getPuestos();

        vista.mostrarPuestos(puestos);
    }

    public void buscarPropietario(int cedula) {
        try {
            Propietario p = Fachada.getInstancia().buscarPropietario(cedula);
            ArrayList<Asignacion> a = p.getAsignaciones();
            vista.mostrarInfoProp(p, a);
            this.propietario = p;
        } catch (PeajeException ex) {
            vista.error(ex.getMessage());
        }

    }

    public void mostrarBonificacionesPropietario(Propietario p) {
        ArrayList<Asignacion> a = p.getAsignaciones();
        vista.mostrarInfoProp(p, a);
    }

    public void asignarBonificacion(Propietario propietario, String nombrePuesto, String tipoBonificacion) {
        try {
            Bonificacion bonif = Fachada.getInstancia().asignarTipoBonificacion(tipoBonificacion);
            Puesto puesto = Fachada.getInstancia().buscarPuestoNombre(nombrePuesto);
            propietario.hayAsignacionEnPuesto(puesto);

            Asignacion a = new Asignacion(bonif, propietario, puesto, admin);

            propietario.agregarAsignacion(a);
            vista.mostrarInfoProp(propietario, propietario.getAsignaciones());

        } catch (PeajeException ex) {
            vista.error(ex.getMessage());
        }
    }

}
