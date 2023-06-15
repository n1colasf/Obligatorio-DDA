package controladores;

import logica.sistema.PeajeException;
import logica.dominio.Propietario;
import logica.dominio.Recarga;
import logica.observador.Observable;
import logica.observador.Observador;
import logica.sistema.Fachada;

public class ControladorSolicitarRecargas implements Observador {

    private VistaSolicitarRecargas vista;
    private Propietario propietario;

    public ControladorSolicitarRecargas(VistaSolicitarRecargas vista,
            Propietario propietario) {
        this.vista = vista;
        this.propietario = propietario;
        propietario.agregarObservador(this);
        mostrar();
    }

    public void mostrar() {
        vista.mostrar(propietario);
    }

    public void solicitarRecarga(int monto) {
        try {
            Recarga r = new Recarga(monto, propietario);
            propietario.agregarRecarga(r);

        } catch (PeajeException ex) {
            vista.error(ex.getMessage());
        }
    }

    @Override
    public void actualizar(Object evento, Observable origen) {
        if (evento.equals(Propietario.eventos.cambioListaRecargas)) {
            mostrar();
        }
    }

    public void salir() {
        propietario.quitarObservador(this);
    }
}
