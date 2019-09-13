// Opdracht 02
package h12;

import java.applet.*;
import java.awt.*;


public class TabellenKnoppen extends Applet {
    int aantal[];
    Button knop;
    int teller;

    public void init() {
        aantal=new int[25];

        int y=20;

        for (teller=1; teller <= aantal.length; teller++) {
            setLocation(20,y+=20);
            knop=new Button("Knop" + teller);
            add(knop);
        }
    }

    public void paint(Graphics g) {
        }
}

