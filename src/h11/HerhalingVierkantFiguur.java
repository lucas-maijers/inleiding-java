// Opdracht 05
package h11;

import java.applet.*;
import java.awt.*;

public class HerhalingVierkantFiguur extends Applet {
    public void init() {}

    public void paint(Graphics g) {
        int x = 0;
        int y = 0;
        int teller = 0;

        while (teller < 5) {
            x +=20;
            y +=20;
            g.drawRect(x,y,20,20);
            teller++;
        }

    }
}
