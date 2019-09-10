// Praktijkopdracht
package h10;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class BeslissingenPraktijkOpdracht extends Applet {
    Label label;
    TextField tekstvak;
    String s, tekst, incorrect, slecht, matig, onvoldoende, voldoende, goed;
    int getal;

    public void init() {
        label = new Label("Vul een getal in");
        tekstvak = new TextField("",20);
        tekstvak.addActionListener(new TekstVakListener());
        incorrect = "U heeft een verkeerd getal ingevoerd.";
        tekst = "";
        // Beoordelingen
        slecht = "Deze beoordeling is slecht.";
        matig = "Deze beoordeling is matig";
        onvoldoende = "Deze beoordeeling is onvoldoende";
        goed = "Deze beoordeling is goed";
        voldoende = "Deze beoordeling is voldoende";
        // Toevoegen
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString("Mogelijke getallen zijn 1 t/m 10.",50,80);
        g.drawString(tekst,50,60);
    }

    class TekstVakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            getal = Integer.parseInt(s);
            switch(getal) {
                case 1:
                    tekst = slecht;
                    break;
                case 2:
                    tekst = slecht;
                    break;
                case 3:
                    tekst = slecht;
                    break;
                case 4:
                    tekst = onvoldoende;
                    break;
                case 5:
                    tekst = matig;
                    break;
                case 6:
                    tekst = voldoende;
                    break;
                case 7:
                    tekst = voldoende;
                    break;
                case 8:
                    tekst = goed;
                    break;
                case 9:
                    tekst = goed;
                    break;
                case 10:
                    tekst = goed;
                    break;
                default:
                    tekst = incorrect;
                    break;
            }
            repaint();
        }
    }
}
