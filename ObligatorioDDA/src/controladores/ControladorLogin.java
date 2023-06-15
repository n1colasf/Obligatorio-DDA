package controladores;

import logica.dominio.Administrador;
import logica.dominio.Propietario;
import logica.sistema.Fachada;
import logica.sistema.PeajeException;

public class ControladorLogin {

  private VistaLogin vista;

  public ControladorLogin(VistaLogin vista) { this.vista = vista; }

  public void validarLoginProp(int cedula, String password) {
    try {
      Propietario p = Fachada.getInstancia().loginPropietario(cedula, password);
      vista.loginPropValidado(p);
    } catch (PeajeException ex) {
      vista.error(ex.getMessage());
    }
  }

  public void validarLoginAdmin(int cedula, String password) {
    try {
      Administrador a =
          Fachada.getInstancia().loginAdministrador(cedula, password);
      vista.loginAdminValidado(a);
    } catch (PeajeException ex) {
      vista.error(ex.getMessage());
    }
  }
}
