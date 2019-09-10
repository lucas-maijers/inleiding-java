// Opdracht 08
package h11;

import java.applet.*;
import java.awt.*;

public class HerhalingTunnelEffect extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        int teller = 0;
        int aantal = 100;
        int x = 0;
        int y = 0;

        while (teller < aantal) {
            x +=5;
            y +=5;
            g.drawOval(20,20,x,y);
            teller++;
        }
    }
}
