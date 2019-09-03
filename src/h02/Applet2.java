package h02;

import java.applet.*;
import java.awt.*;

public class Applet2 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Lucas", 50, 60);
        g.setColor(Color.red);
        g.drawString("Maijers", 50, 80);
    }
}
