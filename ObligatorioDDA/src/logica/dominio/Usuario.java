
package logica.dominio;

import controladores.ControladorSolicitarRecargas;
import logica.observador.Observable;


public abstract class Usuario extends Observable {

    public enum eventos{cambioListaVehiculo,cambioListaRecargas, cambioListaTransitos, cambiosListaBonificaciones, cambioListaNotificaciones };  
    
  // ATRIBUTOS
  private int cedula;
  private String password;
    private String nombreCompleto;

    // CONSTRUCTOR
    public Usuario(int cedula, String password, String nombreCompleto) {
        this.cedula = cedula;
        this.password = password;
        this.nombreCompleto = nombreCompleto;
    }

    // GETTERS
    public int getCedula() {
        return cedula;
    }

    public String getPassword() {
        return password;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }
}
