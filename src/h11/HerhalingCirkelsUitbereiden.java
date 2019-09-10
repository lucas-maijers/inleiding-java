// Opdracht 07
package h11;

import java.applet.*;
import java.awt.*;

public class HerhalingCirkelsUitbereiden extends Applet {
    public void init() {}

    public void paint(Graphics g) {
        int x = 0;
        int y = 0;
        int teller = 0;
        int aantal = 50;

        while (teller < aantal) {
            x +=5;
            y +=5;
            g.drawOval(300-x,300-y,(x*2),(y*2));
            teller ++;
        }
    }
}
