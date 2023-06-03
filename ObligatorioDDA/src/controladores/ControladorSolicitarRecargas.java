package controladores;

import logica.dominio.Propietario;
import logica.observador.Observable;
import logica.observador.Observador;

public class ControladorSolicitarRecargas implements Observador {
    private VistasSolicitarRecargas vista;
    private Propietario propietario;

    public ControladorSolicitarRecargas(VistasSolicitarRecargas vista, Propietario propietario) {
        this.vista = vista;
        this.propietario = propietario;
        propietario.agregarObservador(this);
    }
    public void mostrar(){
        vista.mostrar(propietario.getNombreCompleto(), propietario.getSaldo());
    }

    public void solicitarRecarga(int monto){

    }






    @Override
    public void actualizar(Object evento, Observable origen) {

    }
}
