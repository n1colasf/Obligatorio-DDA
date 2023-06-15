
package inicio;

import ui.TestingApp;

public class ObligatorioDDA {

  public static void main(String[] args) {
    PrecargaDatos.cargar();

    new TestingApp(null, false).setVisible(true);
  }
}
