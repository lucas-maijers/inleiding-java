package h04;

import java.applet.*;
import java.awt.*;

public class TekenenStoplicht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        // Stoplicht
        g.drawRoundRect(20,20,80,200,10,10);
        g.fillRoundRect(20,20,81,201,10,10);
        g.drawRect(50,220,20,300);
        g.fillRect(50,220,20,300);
        // Rood
        g.setColor(Color.RED);
        g.drawOval(35,35,50,50);
        g.fillOval(35,35,51,51);
        // Oranje
        g.setColor(Color.ORANGE);
        g.drawOval(35,95,50,50);
        g.fillOval(35,95,51,51);
        // Groen
        g.setColor(Color.GREEN);
        g.drawOval(35,155,50,50);
        g.fillOval(35,155,51,51);
    }
}
