/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inicio;

import logica.dominio.Propietario;
import logica.dominio.Puesto;
import logica.sistema.Fachada;

/**
 *
 * @author Nicolas
 */
public class PrecargaDatos {
    
    private static final Fachada fachada = Fachada.getInstancia();
    
    public static void cargar(){
        cargarUsuarios();
        cargarPuestos();
        cargarVehiculos();
        cargarTarifas();
        
        //MOSTRAR EN CONSOLA LOS DATOS PARA VERIFICAR --> CARGA OK!!!
        System.out.println(fachada.getPuestos());
        System.out.println(fachada.getPropietarios());
        System.out.println(fachada.getCategorias());
        System.out.println(fachada.getPuestos().get(0).getTarifas());
        System.out.println(fachada.getTipoBonificaciones());        
        System.out.println(fachada.getPropietarios().get(0).getVehiculos());
    }
    
    //CARGA DE ADMINISTRADORES Y PROPIETARIOS
    private static void cargarUsuarios() {
        fachada.agregarAdministrador(11111111, "abcd", "Dario Campalans");
        fachada.agregarAdministrador(21436587, "1111", "Nicolas Fernandez");
        fachada.agregarAdministrador(87654321, "aaaa", "Guillermo Reboledo");
        fachada.agregarAdministrador(43211234, "1234", "Franco Pereyra");
        
        fachada.agregarPropietario(12345678, "a1b2c3", "Juan Pérez"); //0
        fachada.agregarPropietario(98765432, "x3y2z1", "María García"); //1
        fachada.agregarPropietario(78901234, "m5n6o7", "Laura López"); //2
        fachada.agregarPropietario(54321098, "k8l9m0", "Pedro Martínez"); //3
        fachada.agregarPropietario(12345678, "s1t2u3", "Ana Sánchez"); //4
        fachada.agregarPropietario(10293847, "j4k5l6", "Marta Torres"); //5
        fachada.agregarPropietario(76543210, "g6h7i8", "Alejandro Gómez"); //6
        fachada.agregarPropietario(13579246, "e9f0g1", "Carmen Ruiz"); //7
    }

    //CARGA DE PUESTOS, TIPO DE BONIFICACIONNES Y CATEGORIAS
    private static void cargarPuestos() {
        fachada.agregarPuesto("Centenario", "Ruta 5 246km350"); //0
        fachada.agregarPuesto("Manuel Díaz", "Ruta 5 423km200"); //1
        fachada.agregarPuesto("Paso del Puerto", "Ruta 3 245km200"); //2
        fachada.agregarPuesto("Queguay", "Ruta 3 392km750"); //3
        fachada.agregarPuesto("Mercedes", "Ruta 2 284km400"); //4
        fachada.agregarPuesto("Cufré", "Ruta 1 107km350"); //5
        fachada.agregarPuesto("La Barra", "Ruta 1 23km450"); //6
        fachada.agregarPuesto("Pando", "Ruta Interbalnearia km 32.400"); //7
        fachada.agregarPuesto("Solís", "Ruta Interbalnearia km 81"); //8
        fachada.agregarPuesto("Santa Lucía", "Ruta 11 km 81"); //9
        
        fachada.agregarTipoBonificacion("Exonerados"); //0
        fachada.agregarTipoBonificacion("Frecuentes"); //1
        fachada.agregarTipoBonificacion("Trabajadores"); //2
        
        fachada.agregarCategoria("Auto"); //0
        fachada.agregarCategoria("Moto"); //1
        fachada.agregarCategoria("Camión"); //2
        fachada.agregarCategoria("Autobus"); //3
        fachada.agregarCategoria("Camioneta"); //4
        fachada.agregarCategoria("Todoterreno"); //5   
    }
    
    //CARGA DE VEHICULOS EN PROPIETARIOS
    private static void cargarVehiculos() {
        Propietario propietario1 = fachada.getPropietarios().get(0);
        Propietario propietario2 = fachada.getPropietarios().get(1);
        Propietario propietario3 = fachada.getPropietarios().get(2);
        Propietario propietario4 = fachada.getPropietarios().get(3);
        Propietario propietario5 = fachada.getPropietarios().get(4);
        Propietario propietario6 = fachada.getPropietarios().get(5);
        Propietario propietario7 = fachada.getPropietarios().get(6);
        Propietario propietario8 = fachada.getPropietarios().get(7);
        
        propietario1.crearVehiculo("TDF-456", "Fiat Palio", "Azul", propietario1, fachada.getCategorias().get(0)); 
        propietario1.crearVehiculo("AAX-248", "Chevrolet Corsa", "Rojo", propietario1, fachada.getCategorias().get(0));  
        
        propietario2.crearVehiculo("TVA-651", "Kawasaki Ninja", "Verde", propietario2, fachada.getCategorias().get(1));
        
        propietario3.crearVehiculo("SQE-914", "LandRover Explorer", "Negro", propietario3, fachada.getCategorias().get(5)); 
        propietario3.crearVehiculo("TVA-651", "Suzuki Swift", "Blanco", propietario3, fachada.getCategorias().get(0)); 
        
        propietario4.crearVehiculo("TVA-651", "Zanella Sapucai", "Negro", propietario4, fachada.getCategorias().get(1)); 
        
        propietario5.crearVehiculo("TVA-651", "JAC 1035", "Gris", propietario5, fachada.getCategorias().get(2)); 
        
        propietario6.crearVehiculo("TVA-651", "MercedesBenz Citaro", "Plateado", propietario6, fachada.getCategorias().get(3)); 
        
        propietario7.crearVehiculo("TVA-651", "Toyota Tacoma", "Rojo", propietario7, fachada.getCategorias().get(4));
        propietario7.crearVehiculo("TVA-651", "Hyundai i10", "Amarillo", propietario7, fachada.getCategorias().get(0));
        
        propietario8.crearVehiculo("TVA-651", "Vespa 946", "Rojo", propietario8, fachada.getCategorias().get(1)); 
    }
    
    //CARGA DE TARIFAS EN PUESTOS
    private static void cargarTarifas() {
        Puesto puesto1 = fachada.getPuestos().get(0);
        Puesto puesto2 = fachada.getPuestos().get(1);
        Puesto puesto3 = fachada.getPuestos().get(2);
        Puesto puesto4 = fachada.getPuestos().get(3);
        Puesto puesto5 = fachada.getPuestos().get(4);
        Puesto puesto6 = fachada.getPuestos().get(5);
        Puesto puesto7 = fachada.getPuestos().get(6);
        Puesto puesto8 = fachada.getPuestos().get(7);
        Puesto puesto9 = fachada.getPuestos().get(8);
        Puesto puesto10 = fachada.getPuestos().get(9);
        
        puesto1.crearTarifa(148, "Autos", fachada.getCategorias().get(0), puesto1);
        puesto1.crearTarifa(52, "Motos", fachada.getCategorias().get(1), puesto1);
        puesto1.crearTarifa(450, "Camiones", fachada.getCategorias().get(2), puesto1);
        puesto1.crearTarifa(376, "Autobuses", fachada.getCategorias().get(3), puesto1);
        puesto1.crearTarifa(200, "Camionetas", fachada.getCategorias().get(4), puesto1);
        puesto1.crearTarifa(526, "Todoterrenos", fachada.getCategorias().get(5), puesto1);
        
        puesto2.crearTarifa(130, "Autos", fachada.getCategorias().get(0), puesto2);
        puesto2.crearTarifa(52, "Motos", fachada.getCategorias().get(1), puesto2);
        puesto2.crearTarifa(420, "Camiones", fachada.getCategorias().get(2), puesto2);
        puesto2.crearTarifa(358, "Autobuses", fachada.getCategorias().get(3), puesto2);
        puesto2.crearTarifa(192, "Camionetas", fachada.getCategorias().get(4), puesto2);
        puesto2.crearTarifa(500, "Todoterrenos", fachada.getCategorias().get(5), puesto2);
        
        puesto3.crearTarifa(170, "Autos", fachada.getCategorias().get(0), puesto3);
        puesto3.crearTarifa(52, "Motos", fachada.getCategorias().get(1), puesto3);
        puesto3.crearTarifa(524, "Camiones", fachada.getCategorias().get(2), puesto3);
        puesto3.crearTarifa(395, "Autobuses", fachada.getCategorias().get(3), puesto3);
        puesto3.crearTarifa(230, "Camionetas", fachada.getCategorias().get(4), puesto3);
        puesto3.crearTarifa(545, "Todoterrenos", fachada.getCategorias().get(5), puesto3);
        
        puesto4.crearTarifa(135, "Autos", fachada.getCategorias().get(0), puesto4);
        puesto4.crearTarifa(52, "Motos", fachada.getCategorias().get(1), puesto4);
        puesto4.crearTarifa(385, "Camiones", fachada.getCategorias().get(2), puesto4);
        puesto4.crearTarifa(362, "Autobuses", fachada.getCategorias().get(3), puesto4);
        puesto4.crearTarifa(183, "Camionetas", fachada.getCategorias().get(4), puesto4);
        puesto4.crearTarifa(489, "Todoterrenos", fachada.getCategorias().get(5), puesto4);
        
        puesto5.crearTarifa(148, "Autos", fachada.getCategorias().get(0), puesto5);
        puesto5.crearTarifa(52, "Motos", fachada.getCategorias().get(1), puesto5);
        puesto5.crearTarifa(394, "Camiones", fachada.getCategorias().get(2), puesto5);
        puesto5.crearTarifa(395, "Autobuses", fachada.getCategorias().get(3), puesto5);
        puesto5.crearTarifa(215, "Camionetas", fachada.getCategorias().get(4), puesto5);
        puesto5.crearTarifa(500, "Todoterrenos", fachada.getCategorias().get(5), puesto5);
        
        puesto6.crearTarifa(160, "Autos", fachada.getCategorias().get(0), puesto6);
        puesto6.crearTarifa(52, "Motos", fachada.getCategorias().get(1), puesto6);
        puesto6.crearTarifa(462, "Camiones", fachada.getCategorias().get(2), puesto6);
        puesto6.crearTarifa(428, "Autobuses", fachada.getCategorias().get(3), puesto6);
        puesto6.crearTarifa(240, "Camionetas", fachada.getCategorias().get(4), puesto6);
        puesto6.crearTarifa(520, "Todoterrenos", fachada.getCategorias().get(5), puesto6);
        
        puesto7.crearTarifa(155, "Autos", fachada.getCategorias().get(0), puesto7);
        puesto7.crearTarifa(52, "Motos", fachada.getCategorias().get(1), puesto7);
        puesto7.crearTarifa(475, "Camiones", fachada.getCategorias().get(2), puesto7);
        puesto7.crearTarifa(420, "Autobuses", fachada.getCategorias().get(3), puesto7);
        puesto7.crearTarifa(235, "Camionetas", fachada.getCategorias().get(4), puesto7);
        puesto7.crearTarifa(510, "Todoterrenos", fachada.getCategorias().get(5), puesto7);

        puesto8.crearTarifa(130, "Autos", fachada.getCategorias().get(0), puesto8);
        puesto8.crearTarifa(52, "Motos", fachada.getCategorias().get(1), puesto8);
        puesto8.crearTarifa(387, "Camiones", fachada.getCategorias().get(2), puesto8);
        puesto8.crearTarifa(407, "Autobuses", fachada.getCategorias().get(3), puesto8);
        puesto8.crearTarifa(200, "Camionetas", fachada.getCategorias().get(4), puesto8);
        puesto8.crearTarifa(502, "Todoterrenos", fachada.getCategorias().get(5), puesto8);
        
        puesto9.crearTarifa(164, "Autos", fachada.getCategorias().get(0), puesto9);
        puesto9.crearTarifa(52, "Motos", fachada.getCategorias().get(1), puesto9);
        puesto9.crearTarifa(415, "Camiones", fachada.getCategorias().get(2), puesto9);
        puesto9.crearTarifa(399, "Autobuses", fachada.getCategorias().get(3), puesto9);
        puesto9.crearTarifa(210, "Camionetas", fachada.getCategorias().get(4), puesto9);
        puesto9.crearTarifa(542, "Todoterrenos", fachada.getCategorias().get(5), puesto9);
        
        puesto10.crearTarifa(179, "Autos", fachada.getCategorias().get(0), puesto10);
        puesto10.crearTarifa(52, "Motos", fachada.getCategorias().get(1), puesto10);
        puesto10.crearTarifa(538, "Camiones", fachada.getCategorias().get(2), puesto10);
        puesto10.crearTarifa(462, "Autobuses", fachada.getCategorias().get(3), puesto10);
        puesto10.crearTarifa(222, "Camionetas", fachada.getCategorias().get(4), puesto10);
        puesto10.crearTarifa(600, "Todoterrenos", fachada.getCategorias().get(5), puesto10);
    }  
}
