// Opdracht 05
package h12;

import java.applet.*;
import java.awt.*;

public class TabellenStopZoeken extends Applet {
    double[] salaris = { 100.0, 200.0, 500.0, 400.0, 300.0 };
    double maximum;

    public void init() {
        boolean gevonden = false;
        maximum = salaris[0];
        for (int teller=0; teller < salaris.length; teller ++) {
            if(salaris[teller] > maximum) {
                maximum=salaris[teller-1];
                gevonden = true;
                System.out.println("Aantal keer gezocht: " + teller);
            } else if (gevonden && maximum < salaris[teller]) {
                gevonden = false;
            }
        }
    }

    public void paint(Graphics g)  {
        g.drawString("Het maximum is: " + maximum, 50, 20);
    }
}
