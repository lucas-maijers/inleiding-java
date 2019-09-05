package h05;

import java.applet.*;
import java.awt.*;

public class StaafDiagramVariabelen extends Applet {
    // Declaratie
    Color Valerie;
    Color Hans;
    Color Jeroen;
    int breedte;
    int HoogteX;
    int GewichtValerie;
    int GewichtHans;
    int GewichtJeroen;

    public void init() {
        // Kleuren
        Valerie = Color.MAGENTA;
        Hans = Color.blue;
        Jeroen = Color.GREEN;
        // Breedte/Hoogte Staven
        breedte = 20;
        HoogteX = 400;
        // Gewicht Personen
        GewichtHans = 100;
        GewichtValerie = 50;
        GewichtJeroen = 80;
    }
    public void paint(Graphics g) {
        // Diagram
        g.drawLine(50,50,50,400);
        g.drawLine(50,HoogteX,HoogteX,HoogteX);
        // Verdeling
        g.drawString("20 KG", 0, 400);
        g.drawString("40 KG", 0, 350);
        g.drawString("60 KG", 0, 300);
        g.drawString("80 KG", 0, 250);
        g.drawString("100 KG", 0, 200);
        g.drawString("120 KG", 0, 150);
        g.drawString("140 KG", 0, 100);
        g.drawString("160 KG", 0, 50);
        // Valerie
        g.setColor(Valerie);
        g.fillRect(76, HoogteX - GewichtValerie, breedte, GewichtValerie);
        g.drawString("Valerie", 65, 465);
        // Jeroen
        g.setColor(Jeroen);
        g.fillRect(151, HoogteX - GewichtJeroen, breedte, GewichtJeroen);
        g.drawString("Jeroen", 140, 465);
        // Hans
        g.setColor(Hans);
        g.fillRect(226, HoogteX - GewichtHans, breedte, GewichtHans);
        g.drawString("Hans", 220, 465);
    }
}
