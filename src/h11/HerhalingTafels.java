// Opdracht 4
package h11;

import java.applet.*;
import java.awt.*;

public class HerhalingTafels extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller = 0;
        int tafel = 3;
        int y = 0;

        while (teller <= 10) {
            y +=20;
            g.drawString(String.valueOf(tafel) + "x" + String.valueOf(teller) + "=" + tafel * teller,20,y);
            teller++;
        }
    }
}
