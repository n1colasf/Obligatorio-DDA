package controladores;

import java.time.LocalDate;
import java.util.ArrayList;
import logica.dominio.Administrador;
import logica.dominio.Notificacion;
import logica.dominio.Propietario;
import logica.dominio.Recarga;
import logica.observador.Observable;
import logica.observador.Observador;
import logica.sistema.Fachada;

public class ControladorAsignarRecargas implements Observador {

    private VistaAsignarRecargas vista;
    private Administrador admin;

    public ControladorAsignarRecargas(VistaAsignarRecargas vista, Administrador admin) {
        this.vista = vista;
        this.admin = admin;
        admin.agregarObservador(this);
        mostrarRecargas();
    }

    public void mostrarRecargas() {

        ArrayList<Recarga> aux = new ArrayList<>();

        ArrayList<Propietario> propietarios = Fachada.getInstancia().getPropietarios();

        for (Propietario p : propietarios) {

            aux.addAll(p.getRecargasSinAprobar());

        }
        vista.mostrarRecargas(aux);
    }

    public void aprobarRecarga(Recarga r) {
        r.setAdministrador(admin);
        r.getPropietario().actualizarSaldoRecarga(r);
        r.getPropietario().agregarNotificacion(new Notificacion("Tu recarga de $" + r.getMonto() + " fue aprobada.", LocalDate.now(), r.getPropietario()));
        admin.avisar(Administrador.eventos.cambioListaRecargas);
    }

    @Override
    public void actualizar(Object evento, Observable origen) {
        if (evento.equals(Administrador.eventos.cambioListaRecargas)) {
            mostrarRecargas();
        }

    }

    public void salir() {
        admin.quitarObservador(this);
    }

}
