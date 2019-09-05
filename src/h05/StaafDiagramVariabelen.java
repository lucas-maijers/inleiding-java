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
        HoogteX = 250;
        // Gewicht Personen
        GewichtHans = 100;
        GewichtValerie = 20;
        GewichtJeroen = 80;
    }
    public void paint(Graphics g) {
        // Diagram
        g.drawLine(50,50,50,HoogteX);
        g.drawLine(50,HoogteX,HoogteX,HoogteX);
        // Verdeling
        g.drawString("20 KG", 0, HoogteX-20);
        g.drawString("40 KG", 0, HoogteX-40);
        g.drawString("60 KG", 0, HoogteX-60);
        g.drawString("80 KG", 0, HoogteX-80);
        g.drawString("100 KG", 0, HoogteX-100);
        g.drawString("120 KG", 0, HoogteX-120);
        g.drawString("140 KG", 0, HoogteX-140);
        g.drawString("160 KG", 0, HoogteX-160);
        g.drawString("180 KG",0,HoogteX-180);
        g.drawString("200 KG",0,HoogteX-200);
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
