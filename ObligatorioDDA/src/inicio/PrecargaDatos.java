/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inicio;

import logica.sistema.Fachada;

/**
 *
 * @author Nicolas
 */
public class PrecargaDatos {
    
    private static Fachada fachada = Fachada.getInstancia();
    
    public static void cargar(){
       
        //ADMINISTRADORES
        fachada.agregarAdministrador(21436587, "1111", "Nicolas Fernandez");
        fachada.agregarAdministrador(87654321, "AAAA", "Guillermo Reboledo");
        fachada.agregarAdministrador(43211234, "1234", "Franco Pereyra");
        
        //PROPIETARIOS
        fachada.agregarPropietario(12345678, "a1b2c3", "Juan Pérez");
        fachada.agregarPropietario(98765432, "x3y2z1", "María García");
        fachada.agregarPropietario(45678901, "p4q5r6", "Carlos Rodríguez");
        fachada.agregarPropietario(78901234, "m5n6o7", "Laura López");
        fachada.agregarPropietario(54321098, "k8l9m0", "Pedro Martínez");
        fachada.agregarPropietario(12345678, "s1t2u3", "Ana Sánchez");
        fachada.agregarPropietario(87654321, "z3y2x1", "Sergio Fernández");
        fachada.agregarPropietario(10293847, "j4k5l6", "Marta Torres");
        fachada.agregarPropietario(76543210, "g6h7i8", "Alejandro Gómez");
        fachada.agregarPropietario(13579246, "e9f0g1", "Carmen Ruiz");
        
        //

    }
    
    
    
}
