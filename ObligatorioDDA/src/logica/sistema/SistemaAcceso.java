package logica.sistema;

import java.util.ArrayList;
import logica.dominio.Administrador;
import logica.dominio.Propietario;
import logica.dominio.Usuario;
import logica.dominio.Vehiculo;

public class SistemaAcceso {

  // ATRIBUTOS
  private ArrayList<Propietario> propietarios = new ArrayList();
  private ArrayList<Administrador> administradores = new ArrayList();
  private ArrayList<Administrador> administradoresConectados =
      new ArrayList<>();

  // GETTERS
  public ArrayList<Propietario> getPropietarios() { return propietarios; }

  public ArrayList<Administrador> getAdministradores() {
    return administradores;
  }

  public ArrayList<Administrador> getAdministradoresConectados() {
    return administradoresConectados;
  }

  // FUNCIONES AGREGAR
  public void agregarPropietario(int cedula, String pass,
                                 String nombreCompleto) {
    propietarios.add(new Propietario(cedula, pass, nombreCompleto));
  }

  public void agregarAdministrador(int cedula, String pass,
                                   String nombreCompleto) {
    administradores.add(new Administrador(cedula, pass, nombreCompleto));
  }

  // FUNCIONES LOGIN
  public Administrador loginAdministrador(int cedula, String pass) {
    Usuario u = buscarUsuario(cedula, pass, administradores);
    return (Administrador)u;
  }

  public Propietario loginPropietario(int cedula, String pass) {
    Usuario u = buscarUsuario(cedula, pass, propietarios);
    return (Propietario)u;
  }

  // FUNCION AUXILIAR BUSCAR USUARIO
  private Usuario buscarUsuario(int cedula, String pass, ArrayList usuarios) {
    Usuario u;
    for (Object obj : usuarios) {
      u = (Usuario)obj;
      if (u.getCedula() == cedula && u.getPassword().equals(pass)) {
        return u;
      }
    }
    return null;
  }

  public boolean adminConectado(Administrador administrador) {
    for (Administrador admin : administradoresConectados) {
      if (admin.equals(administrador)) {
        return true;
      }
    }
    return false;
  }

  Propietario buscarPropietario(int cedula) {
    for (Propietario prop : propietarios) {
      if (prop.getCedula() == cedula) {
        return prop;
      }
    }
    return null;
  }

  Vehiculo obtenerVehiculoMatricula(String matricula) {
    for (Propietario p : propietarios) {
      Vehiculo v = p.obtenerVehiculoMatricula(matricula);
      if (v != null) {
        return v;
      }
    }
    return null;
  }

  public void quitarSesionAdmin(Administrador admin) {
    Administrador aux = null;
    for (Administrador a : administradoresConectados) {
      if (admin.equals(a)) {
        aux = admin;
      }
    }
    administradoresConectados.remove(aux);
  }

  public void agregarAdminConectado(Administrador admin) {
    administradoresConectados.add(admin);
  }

  public void avisarAdminsConectados(Object evento) {
    for (Administrador a : administradoresConectados) {
      a.avisar(evento);
    }
  }
}
