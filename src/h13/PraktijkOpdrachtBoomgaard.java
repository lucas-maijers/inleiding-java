package h13;

import java.applet.*;
import java.awt.*;

public class PraktijkOpdrachtBoomgaard extends Applet {

    public void init() {
        setSize(800,700);
    }

    public void paint(Graphics g) {
        tekenBoom(g,2,5);

    }

    void tekenBoom(Graphics g, int rijen, int bomen) {
        int hstam, bstam;
        int hblad, bblad;
        int teller = 0;
        int yblad;
        int x,y;
        y = 100;
        yblad = 50;
        hblad = 100;
        hstam = 100;
        bstam = 25;

        Color bruin = new Color(0x744915);
        Color groen = new Color(0x1E600C);
        while (teller < rijen) {
            x = 50;
            bblad = 100;

            for (int i=0; i < bomen; i++) {
                g.setColor(bruin);
                g.fillRect(x,y,bstam,hstam);
                g.setColor(groen);
                g.fillOval(x-35,yblad,bblad,hblad);
                x+=hstam;

            }
            y+=150;
            yblad+=150;
            teller++;
        }

    }
}
