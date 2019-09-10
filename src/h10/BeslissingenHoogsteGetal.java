// Opdracht 01
package h10;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class BeslissingenHoogsteGetal extends Applet {
    TextField tekstvak;
    Label label;
    String tekst, s;
    int hoogstegetal, getal;

    public void init() {
        tekstvak = new TextField("",20);
        tekstvak.addActionListener(new TekstvakListener());
        label = new Label("Voer hier een getal in");
        tekst = "";
        hoogstegetal = 0;
        add(label);
        add(tekstvak);
    }
    public void paint(Graphics g) {
        g.drawString("Het hoogste getal dat u heeft ingevuld is: "+hoogstegetal,50,65);
    }
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            getal = Integer.parseInt(s);
            if (getal >= hoogstegetal) {
                hoogstegetal = getal;
                repaint();
            }
            else {
                return;
            }
        }
    }
}
