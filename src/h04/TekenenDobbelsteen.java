// Opdracht 07
package h04;

import java.applet.*;
import java.awt.*;

public class TekenenDobbelsteen extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        g.drawRoundRect(20,20,100,100,20,20);
        g.fillOval(35,35,25,25);
        g.fillOval(80,35,25,25);
        g.fillOval(35,80,25,25);
        g.fillOval(80,80,25,25);
    }
}
