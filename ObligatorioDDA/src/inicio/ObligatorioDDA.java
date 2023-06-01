/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inicio;

import ui.TestingApp;

/**
 *
 * @author Nicolas
 */
public class ObligatorioDDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PrecargaDatos.cargar();
        
        new TestingApp(null, false).setVisible(true);
   
    }
    
}
