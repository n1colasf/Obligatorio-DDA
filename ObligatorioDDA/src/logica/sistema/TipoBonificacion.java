package logica.sistema;

public class TipoBonificacion {

    private String nombre;

    public TipoBonificacion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
