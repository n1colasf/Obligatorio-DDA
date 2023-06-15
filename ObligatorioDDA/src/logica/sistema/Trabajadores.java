package logica.sistema;

import java.time.LocalDate;
import logica.dominio.Bonificacion;

public class Trabajadores extends Bonificacion {

    public Trabajadores(String nombre) {
        super(nombre);
    }

    @Override
    public double calcular(LocalDate fecha, boolean frecuente) {
        if (fecha.getDayOfWeek().getValue() == 6 || fecha.getDayOfWeek().getValue() == 7) {
            return 1;
        } else {
            return 0.2;
        }
    }

}
