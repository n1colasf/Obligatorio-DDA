package controladores;

import logica.dominio.Administrador;
import logica.dominio.Propietario;

public interface VistaLogin {

    public void loginPropValidado(Propietario p);

    public void loginAdminValidado(Administrador a);

    public void error(String message);

}
