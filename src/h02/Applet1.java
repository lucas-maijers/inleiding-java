// Opdracht 01
package h02;

import java.applet.*;
import java.awt.*;

public class Applet1 extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Lucas Maijers", 50, 60);
    }
}
