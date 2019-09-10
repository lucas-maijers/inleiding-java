// Opdracht 06
package h11;

import java.applet.*;
import java.awt.*;

public class HerhalingCirkels extends Applet {
    public void init() {}

    public void paint(Graphics g) {
        int x = 0;
        int y = 0;
        int teller = 0;
        int aantal = 5;

        while (teller < aantal) {
            x +=5;
            y +=5;
            g.drawOval(100-x,100-y,0+(x*2),0+(y*2));
            teller ++;
        }
    }
}
