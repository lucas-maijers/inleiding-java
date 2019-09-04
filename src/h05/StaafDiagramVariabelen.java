package h05;

import java.applet.*;
import java.awt.*;

public class StaafDiagramVariabelen extends Applet {
    // Declaratie
    Color Valerie;
    Color Hans;
    Color Jeroen;
    int breedte;
    // Gewicht Kleurstaven
    int KG20;
    int KG40;
    int KG60;
    int KG80;
    int KG100;
    int KG120;
    int KG140;
    int KG160;
    // Gewicht Hoogte
    int HKG20;
    int HKG40;
    int HKG60;
    int HKG80;
    int HKG100;
    int HKG120;
    int HKG140;
    int HKG160;


    public void init() {
        // Kleuren
        Valerie = Color.MAGENTA;
        Hans = Color.blue;
        Jeroen = Color.GREEN;
        // Breedte Kleurstaaf
        breedte = 20;
        // Gewicht Kleurstaven
        KG160 = 399;
        KG140 = 349;
        KG120 = 299;
        KG100 = 249;
        KG80 = 199;
        KG60 = 149;
        KG40 = 99;
        KG20 = 49;
        // Gewicht Hoogte
        HKG20 = 401;
        HKG40 = 351;
        HKG60 = 301;
        HKG80 = 251;
        HKG100 = 201;
        HKG120 = 151;
        HKG140 = 101;
        HKG160 = 51;
    }
    public void paint(Graphics g) {
        // Diagram
        g.drawRect(50, 50, 300, 400);
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
        g.fillRect(76, HKG20, breedte, KG20);
        g.drawString("Valerie", 65, 465);
        // Jeroen
        g.setColor(Jeroen);
        g.fillRect(151, HKG120, breedte, KG120);
        g.drawString("Jeroen", 140, 465);
        // Hans
        g.setColor(Hans);
        g.fillRect(226, HKG80, breedte, KG80);
        g.drawString("Hans", 220, 465);
    }
}
