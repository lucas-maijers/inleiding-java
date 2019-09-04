package h04;

import java.applet.*;
import java.awt.*;

public class TekenenVlag extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.CYAN);
        // Paal
        g.setColor(Color.black);
        g.drawRect(20,20,10,200);
        g.fillRect(20,20,10,200);
        // Deel Rood
        g.setColor(Color.red);
        g.drawRect(31,20,75,20);
        g.fillRect(31,20,75,20);
        // Deel Wit
        g.setColor(Color.white);
        g.drawRect(31,41,75,20);
        g.fillRect(31,41,75,20);
        // Deel Blauw
        g.setColor(Color.BLUE);
        g.drawRect(31,62,75,20);
        g.fillRect(31,62,75,20);
    }
}