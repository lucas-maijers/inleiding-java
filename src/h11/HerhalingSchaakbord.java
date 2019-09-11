// Opdracht 09
package h11;

import java.applet.*;
import java.awt.*;

public class HerhalingSchaakbord extends Applet {

    public void init(){}

    public void paint(Graphics g) {
        int x=50;
        int y=50;
        int breedte=25;
        int hoogte=25;
        int rij = 0;
        Color wit;
        Color zwart;
        zwart=Color.BLACK;
        wit=Color.WHITE;

        while (rij < 8) {
            x=50;
            // Even Rijen
            if (rij == 0 | rij == 2 || rij == 4 || rij == 6) {
                for (int kolom=0; kolom < 8; kolom++) {

                    if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                        g.setColor(zwart);
                        g.fillRect(x, y, breedte, hoogte);
                    } else {
                        g.setColor(wit);
                        g.fillRect(x, y, breedte, hoogte);
                    }
                    x+=breedte;
                }
                rij++;
            } else {
                // Oneven Rijen
                x=50;
                y+=hoogte;

                for (int kolom=0; kolom < 8; kolom++) {
                    if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                        g.setColor(wit);
                        g.fillRect(x, y, breedte, hoogte);
                    } else {
                        g.setColor(zwart);
                        g.fillRect(x, y, breedte, hoogte);

                    }
                    x+=breedte;
                }
                rij++;
                y+=hoogte;
            }
        }
        x=50;
        y=50;
        g.drawRect(x,y,x*4,y*4);
    }
}
