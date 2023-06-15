package logica.observador;

public interface Observador {

    public void actualizar(Object evento, Observable origen);
}
