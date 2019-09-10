// Opdracht 03
package h11;

import java.applet.*;
import java.awt.*;

public class HerhalingFibonacci extends Applet {
    public void init() {}

    public void paint(Graphics g) {
        int a = 1;
        int b = 1;
        int y = 30;
        int teller = 0;
        int aantal = 10;

        g.drawString(String.valueOf(a),5,15);
        g.drawString(String.valueOf(b),5,30);

        while (teller <=aantal) {
            a += b;
            b = a-b;
            y += 15;
            g.drawString(String.valueOf(a),5,y);
            teller++;
        }
    }
}