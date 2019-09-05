package h06;

import java.applet.*;
import java.awt.*;

public class GetallenPraktijkopdracht extends Applet {
    // Declaratie
    double a,b,c;
    double uitkomst;
    int gebroken;
    double antwoord;

    public void init() {
        // Getallen
        a=(double) 5.9;
        b=(double) 6.3;
        c=(double) 6.9;
        // Berekenen
        uitkomst = (a + b + c) / 3;
        // Converteren naar 1 Decimaal
        gebroken =(int) ((double) uitkomst *10);
        antwoord =(double) ((double) gebroken /10);
    }

    public void paint(Graphics g) {
        // Getallen
        g.drawString("Getal 1: " + a,20,15);
        g.drawString("Getal 2: " + b,20,30);
        g.drawString("Getal 3: " + c,20,45);
        // Antwoord
        g.drawString("Gemiddelde: " + antwoord,20,70);
    }
}
