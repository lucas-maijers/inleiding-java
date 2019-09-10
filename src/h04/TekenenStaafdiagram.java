// Opdracht 04
package h04;

import java.applet.*;
import java.awt.*;

public class TekenenStaafdiagram extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        // Diagram
        g.drawRect(50,50,300,400);
        // Verdeling
        g.drawString("20 KG",0,400);
        g.drawString("40 KG",0,350);
        g.drawString("60 KG", 0,300);
        g.drawString("80 KG",0,250);
        g.drawString("100 KG",0,200);
        g.drawString("120 KG",0,150);
        g.drawString("140 KG",0,100);
        g.drawString("160 KG",0,50);
        // Valerie
        g.drawRect(75,400,20,50);
        g.setColor(Color.MAGENTA);
        g.fillRect(76,401,19,49);
        g.drawString("Valerie",65,465);
        // Jeroen
        g.setColor(Color.black);
        g.drawRect(150,200,20,250);
        g.setColor(Color.green);
        g.fillRect(151,201,19,249);
        g.drawString("Jeroen", 140,465);
        // Hans
        g.setColor(Color.black);
        g.drawRect(225,250,20,200);
        g.setColor(Color.BLUE);
        g.fillRect(226,251,19,199);
        g.drawString("Hans",220,465);
    }
}
