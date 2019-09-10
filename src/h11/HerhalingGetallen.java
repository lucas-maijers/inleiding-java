// Opdracht 02
package h11;

import java.applet.*;
import java.awt.*;

public class HerhalingGetallen extends Applet {

    public void init() {}
    public void paint(Graphics g) {
        int teller = 20;
        int y = 0;

        while (teller >= 10) {
            y += 20;
            g.drawString(""+teller,20,y);
            teller --;
        }
    }
}
