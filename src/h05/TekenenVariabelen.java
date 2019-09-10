// Opdracht 01
package h05;

import java.applet.*;
import java.awt.*;

public class TekenenVariabelen extends Applet {
    // Declaratie
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte= 180;
        hoogte = 100;
    }

    public void paint(Graphics g) {
        // Lijn
        g.drawLine(20,20,200,20);
        g.drawString("Lijn",100,35);
        // Rechthoek
        g.drawRect(20,40,breedte,hoogte);
        g.drawString("Rechthoek",80,155);
        // Afgeronde Rechthoek
        g.drawRoundRect(20,160,breedte,hoogte,30,30);
        g.drawString("Afgeronde Rechthoek",50,275);
        // Gevulde Rechthoek met Ovaal
        g.setColor(opvulkleur);
        g.fillRect(210,40,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawOval(210,40,breedte,hoogte);
        g.drawString("Gevulde rechthoek met ovaal",220,155);
        // Gevulde Ovaal
        g.setColor(opvulkleur);
        g.fillOval(210,160,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawString("Gevulde Ovaal",260,275);
        // Taartpunt met Ovaal
        g.drawOval(400,40,breedte,hoogte);
        g.setColor(opvulkleur);
        g.fillArc(400,40,breedte,hoogte,0,45);
        g.setColor(lijnkleur);
        g.drawString("Taartpunt met ovaal eromheen",405,155);
        // Cirkel
        g.drawOval(440,160,100,100);
        g.drawString("Cirkel",475,275);
    }
}
