package controladores;

import java.util.ArrayList;
import logica.dominio.Asignacion;
import logica.dominio.Notificacion;
import logica.dominio.Propietario;
import logica.dominio.Recarga;
import logica.dominio.Transito;
import logica.dominio.Vehiculo;

public interface VistaTableroControl {

    public void mostrarTransito(ArrayList<Transito> transitos);

    public void mostrarVehiculo(ArrayList<Vehiculo> vehiculos);

    public void mostrarNotificaciones(ArrayList<Notificacion> notificaciones);

    public void mostrarBonificaciones(ArrayList<Asignacion> bonificaciones);

    public void mostrarRecargas(ArrayList<Recarga> recargas);

    public void mostrarDatosProp(Propietario propietario);

    public void mostrarCantidadDatos(int cantVehiculos, int cantNotificaciones, int cantAsignaciones, int cannTransitos, int cantRecargas);

}
