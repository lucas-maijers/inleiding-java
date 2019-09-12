// Opdracht 01
package h12;

import java.awt.*;
import java.applet.*;;

public class TabellenGemiddelde extends Applet {

    double getallen[];
    double gemiddelde;
    int teller;

    public void init() {
        getallen = new double[10];
        getallen[0] = 1;
        getallen[1] = 2;
        getallen[2] = 3;
        getallen[3] = 4;
        getallen[4] = 5;
        getallen[5] = 6;
        getallen[6] = 7;
        getallen[7] = 8;
        getallen[8] = 9;
        getallen[9] = 10;

        for (teller = 0; teller < getallen.length; teller++) {
            gemiddelde += getallen[teller];
        }
        gemiddelde /= teller;

    }
    public void paint (Graphics g) {
        for (int teller = 0; teller < getallen.length; teller++) {
            g.drawString("" + getallen[teller], 50,20 * teller + 20);
            g.drawString("Het gemiddelde is: " + gemiddelde,100,20);
        }
    }
}
