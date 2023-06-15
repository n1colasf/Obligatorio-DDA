package controladores;

import logica.dominio.Propietario;

public interface VistaSolicitarRecargas {

    void mostrar(Propietario propietario);

    void error(String message);

}
