package h06;

import java.applet.*;
import java.awt.*;

public class GetallenInts extends Applet {
    int num1;
    int num2;
    double uitkomst;

    public void init() {
        num1=2147483647;
        num2=1;
        uitkomst = num1 + num2;
    }

    public void paint(Graphics g) {
        g.drawString("Uitkomst: " +uitkomst,20,20);
    }
}
