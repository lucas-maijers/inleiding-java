package h04;

import java.applet.*;
import java.awt.*;

public class TekenenOpdracht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        // Lijn
        g.drawLine(20,20,200,20);
        g.drawString("Lijn",100,35);
        // Rechthoek
        g.drawRect(20,40,180,100);
        g.drawString("Rechthoek",80,155);
        // Afgeronde Rechthoek
        g.drawRoundRect(20,160,180,100,30,30);
        g.drawString("Afgeronde Rechthoek",50,275);
        // Gevulde Rechthoek met Ovaal
        g.setColor(Color.MAGENTA);
        g.fillRect(210,40,180,100);
        g.setColor(Color.BLACK);
        g.drawOval(210,40,180,100);
        g.drawString("Gevulde rechthoek met ovaal",220,155);
        // Gevulde Ovaal
        g.setColor(Color.MAGENTA);
        g.fillOval(210,160,180,100);
        g.setColor(Color.BLACK);
        g.drawString("Gevulde Ovaal",260,275);
        // Taartpunt met Ovaal
        g.drawOval(400,40,180,100);
        g.setColor(Color.MAGENTA);
        g.fillArc(400,40,180,100,0,45);
        g.setColor(Color.BLACK);
        g.drawString("Taartpunt met ovaal eromheen",405,155);
        // Cirkel
        g.drawOval(440,160,100,100);
        g.drawString("Cirkel",475,275);
    }
}
