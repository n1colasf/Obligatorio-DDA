package logica.dominio;

import java.util.ArrayList;

public class Puesto {
    // ATRIBUTOS

    private String nombre;
    private String direccion;
    private ArrayList<Tarifa> tarifas = new ArrayList();
    private ArrayList<Transito> transitos = new ArrayList();
    private ArrayList<Asignacion> asignaciones = new ArrayList();

    // CONSTRUCTOR
    public Puesto(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    // GETTERS
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public ArrayList<Tarifa> getTarifas() {
        return tarifas;
    }

    public ArrayList<Transito> getTransitos() {
        return transitos;
    }

    public ArrayList<Asignacion> getAsignaciones() {
        return asignaciones;
    }

    // CREAR TARIFA
    public void crearTarifa(int monto, String nombre, Categoria categoria) {
        Tarifa tarifa = new Tarifa(monto, nombre, categoria, this);
        if (tarifa != null) {
            tarifas.add(tarifa);
        }
    }

    @Override
    public String toString() {
        return nombre;
    }

}
