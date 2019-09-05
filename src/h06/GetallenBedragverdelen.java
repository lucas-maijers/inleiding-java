package h06;

import java.applet.*;
import java.awt.*;

public class GetallenBedragverdelen extends Applet {
    // Declaratie
    int a, b;
    double uitkomst;

    public void init() {
        // Benoeming
        a = 113;
        b= 4;
        uitkomst = a / b;
    }

    public void paint(Graphics g) {
        g.drawString("Een bedrag van: €" + String.valueOf(a),20,10);
        // Personen
        g.drawString("Jan >> €" + uitkomst, 20, 30);
        g.drawString("Ali >> €" + uitkomst, 20, 45);
        g.drawString("Jeannette >> €" + uitkomst,20,60);
        g.drawString("Lucas >> €" + uitkomst,20,75);
    }
}
