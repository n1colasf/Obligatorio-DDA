
package logica.dominio;

import logica.sistema.PeajeException;
import java.util.ArrayList;
import java.time.LocalDate;
import logica.observador.Observable;
import logica.sistema.Fachada;

public class Vehiculo extends Observable{
  // ATRIBUTOS
  private String matricula;
  private String modelo;
  private String color;
  private Propietario propietario;
  private Categoria categoria;
  private ArrayList<Transito> transitos = new ArrayList();

  // CONSTRUCTOR
  public Vehiculo(String matricula, String modelo, String color,
                  Propietario propietario, Categoria categoria) {
    this.matricula = matricula;
    this.modelo = modelo;
    this.color = color;
    this.propietario = propietario;
    this.categoria = categoria;
  }

  // GETTERS
  public String getMatricula() { return matricula; }
  public String getModelo() { return modelo; }
  public String getColor() { return color; }
  public Propietario getPropietario() { return propietario; }
  public Categoria getCategoria() { return categoria; }
  public ArrayList<Transito> getTransitos() { return transitos; }

  public boolean frecuenciaVehiculo(Puesto puesto, LocalDate fecha) {
    int frecuencia = 0;
   for (Transito transito : transitos) {
      if (transito.getPuesto().equals(puesto) && transito.getFecha().equals(fecha)) {
        frecuencia = frecuencia + 1;
      }
    }
    return frecuencia >= 1;
  }
  
  public double getMontoTarifa(Puesto puesto){
      double monto = 0;
      ArrayList<Tarifa> tarifas = puesto.getTarifas();
      
     for(Tarifa t: tarifas){
     
     if(t.getPuesto().equals(puesto)&& this.getCategoria().getNombre().equals(t.getCategoria().getNombre())){
     
     monto = t.getMonto();
     }
     
     }
      return monto;
  }
  
  public double getMontoTotal(){
  
  double total = 0;
   
  for(Transito t: transitos){
      total += t.getTotal();
  }
  
   return total;
   
  }
  
  public Asignacion obtenerAsignacion(Puesto puesto) {
    return getPropietario().getAsignacion(puesto);
  }
  
  
  public void agregarTransito(Transito t) throws PeajeException{ 
      int saldoProp=propietario.getSaldo();
      if(t.getTotal()<= saldoProp){
          transitos.add(0,t);
          Notificacion n = new Notificacion( "Pasaste por el puesto "+t.getPuesto()+" con el vehículo "+matricula,LocalDate.now(),propietario);
          propietario.agregarNotificacion(n);
          propietario.setSaldo((int) (saldoProp - t.getTotal())); 
          if (propietario.getSaldo() < Fachada.getInstancia().getSaldoMinimo()) {
              Notificacion nsaldo = new Notificacion( "Tu saldo actual es de $"+propietario.getSaldo()+". Te recomendamos hacer una recarga",LocalDate.now(),propietario);
          propietario.agregarNotificacion(nsaldo); 
          }
          propietario.avisar(Propietario.eventos.cambioListaTransitos);
          propietario.avisar(Propietario.eventos.cambioListaVehiculo);
          propietario.avisar(Propietario.eventos.cambioListaRecargas);

      }else{
          throw new PeajeException("Saldo insuficiente: " + propietario.getSaldo());
      }      
  }
  
}
