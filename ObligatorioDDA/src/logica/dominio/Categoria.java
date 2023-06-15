package logica.dominio;

import java.util.ArrayList;

public class Categoria {

    //ATRIBUTOS
    private String nombre;
    private ArrayList<Tarifa> tarifas = new ArrayList();
    private ArrayList<Vehiculo> vehiculos;

    //CONSTRUCTOR
    public Categoria(String nombre) {
        this.nombre = nombre;
    }

    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Tarifa> getTarifas() {
        return tarifas;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }
}
