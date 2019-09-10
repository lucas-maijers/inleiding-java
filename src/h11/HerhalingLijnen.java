// Opdracht 01
package h11;

import java.applet.*;
import java.awt.*;

public class HerhalingLijnen extends Applet {

    public void init() {}

    public void paint(Graphics g) {
            int teller = 0;
            int x = 0;

            while(teller < 10) {
                x += 20;
                g.drawLine(x , 20, x, 200 );
                teller++;
        }
    }
}
