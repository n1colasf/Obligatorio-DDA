package controladores;

import logica.dominio.Propietario;
import logica.dominio.Recarga;
import logica.observador.Observable;
import logica.observador.Observador;

public class ControladorSolicitarRecargas implements Observador {
    private VistaSolicitarRecargas vista;
    private Propietario propietario;

    public ControladorSolicitarRecargas(VistaSolicitarRecargas vista, Propietario propietario) {
        this.vista = vista;
        this.propietario = propietario;
        propietario.agregarObservador(this);
    }
    
    public void mostrar(){
        vista.mostrar(propietario);
    }

    public void solicitarRecarga(int monto){
        try {
            Recarga r = new Recarga(monto, propietario);
            propietario.agregarRecarga(r);
        }
        catch (Exception e) {
            
        }
    }

    @Override
    public void actualizar(Object evento, Observable origen) {

    }
}
