package logica.dominio;

import java.util.ArrayList;
import java.time.LocalDate;

public class Asignacion {
    // ATRIBUTOS

    private LocalDate fecha;
    private Bonificacion bonificacion;
    private Puesto puesto;
    private ArrayList<Transito> transitos = new ArrayList();
    private Propietario propietario;
    private Administrador administrador;

    // CONSTRUCTOR
    public Asignacion(Bonificacion bonificacion, Propietario propietario, Puesto puesto, Administrador administrador) {
        this.fecha = LocalDate.now();
        this.bonificacion = bonificacion;
        this.propietario = propietario;
        this.puesto = puesto;
        this.administrador = administrador;
    }

    // GETTERS
    public LocalDate getFecha() {
        return fecha;
    }

    public Bonificacion getBonificacion() {
        return bonificacion;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public ArrayList<Transito> getTransitos() {
        return transitos;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }
}
