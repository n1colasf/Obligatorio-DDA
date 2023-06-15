package controladores;

import logica.dominio.Administrador;
import logica.observador.Observable;
import logica.observador.Observador;
import logica.sistema.Fachada;

public class ControladorConsolaAdmin implements Observador {

    private VistaConsolaAdmin vista;
    private Administrador admin;

    public ControladorConsolaAdmin(VistaConsolaAdmin vista, Administrador admin) {
        this.vista = vista;
        this.admin = admin;
        mostrarAdmin();
    }

    public void mostrarAdmin() {
        vista.mostrarAdmin(admin);
    }

    @Override
    public void actualizar(Object evento, Observable origen) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void salir() {
        Fachada.getInstancia().quitarSesionAdmin(admin);
        admin.quitarObservador(this);

    }
}
