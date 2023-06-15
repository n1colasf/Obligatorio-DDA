package logica.dominio;

import java.util.ArrayList;

public class Administrador extends Usuario {

    //ATRIBUTOS
    private ArrayList<Recarga> recargas = new ArrayList();

    //CONSTRUCTOR
    public Administrador(int cedula, String password, String nombreCompleto) {
        super(cedula, password, nombreCompleto);
    }

    //GETTERS
    public ArrayList<Recarga> getRecargas() {
        return recargas;
    }
}
