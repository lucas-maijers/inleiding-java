// Opdracht 01
package h04;

import java.applet.*;
import java.awt.*;

public class TekenenDriehoek extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.magenta);
        g.drawLine(50, 100, 100, 100);
        g.drawLine(50, 100, 75, 50);
        g.drawLine(75, 50, 100, 100);
    }
}
