package h04;

import java.applet.*;
import java.awt.*;

public class TekenenEllips extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        // Achtergrond
        setBackground(Color.blue);
        // Ellips
        g.setColor(Color.yellow);
        g.fillArc(20, 20,200,100,0,180);
    }
}
