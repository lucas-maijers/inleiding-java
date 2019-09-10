// Opdracht 02
package h10;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class BeslissingenGetalCounter extends Applet {
    TextField tekstvak;
    Label label;
    String s;
    int hoogstegetal, laagstegetal, getal, dummy;

    public void init() {
        tekstvak = new TextField("",20);
        tekstvak.addActionListener(new TekstvakListener());
        label = new Label("Voer hier een getal in");
        add(label);
        add(tekstvak);
        dummy = 2147483647;
    }
    public void paint(Graphics g) {
        g.drawString("Het hoogste getal dat u heeft ingevuld is: "+hoogstegetal,50,65);
        g.drawString("Het laagste getal dat u heeft ingevuld is: "+laagstegetal,50,80);
    }
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            getal = Integer.parseInt(s);
            laagstegetal = dummy;
            //hoogstegetal
            if (getal > hoogstegetal) {
                hoogstegetal = getal;
                repaint();
            }
            //laagstegetal
            if ((laagstegetal > getal) && (getal < dummy)) {
                dummy = getal;
                laagstegetal = getal;
                repaint();
            }
        }
    }
}