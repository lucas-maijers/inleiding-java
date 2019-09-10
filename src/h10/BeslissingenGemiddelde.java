// Opdracht 05
package h10;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class BeslissingenGemiddelde extends Applet {
    Label label;
    TextField tekstvak;
    Button knop, reset;
    String s, tekst, uitslag;
    double cijferinput, gemiddelde, getalinput;
    int teller;

    public void init() {
        label = new Label("Vul hier uw cijfers in");
        tekstvak = new TextField("",15);
        knop = new Button("Ok");
        reset = new Button("RESET");
        reset.addActionListener(new ResetListener());
        knop.addActionListener(new KnopListener());
        tekstvak.addActionListener(new TekstvakListener());
        cijferinput = 0;
        tekst = "Nog geen getallen gedetecteerd.";
        uitslag = "";
        add(label);
        add(tekstvak);
        add(knop);
        add(reset);
    }

    public void paint(Graphics g) {
        g.drawString("Je gemiddelde is: "+gemiddelde,50,70);
        g.drawString(tekst,50,55);
        g.drawString(uitslag,50,90);
    }
// Input Lezer
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            getalinput = Double.parseDouble(s);
            teller++;
            cijferinput += getalinput;
            if (getalinput >= 5.5) {
                tekst = "Het cijfer: " +getalinput + " is voldoende.";
            }
            else {
                tekst = "Het cijfer: " +getalinput +" is onvoldoende";
            }
            tekstvak.setText("");
            repaint();
        }
    }
// Uitslag
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Berekenen
            gemiddelde = cijferinput/teller;
            // Omrekenen naar 1 decimaal
            gemiddelde *= 10;
            gemiddelde = (int) gemiddelde;
            gemiddelde /= 10;

            if (gemiddelde >= 5.5) {
                uitslag = "Je bent geslaagd, Gefeliciteerd!!";
            }
            else {
                uitslag = "Je bent helaas niet geslaagd, volgende keer beter.";
            }
            repaint();
        }
    }
// ResetKnop
    class ResetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Getallen Resetten
            gemiddelde = 0.0;
            teller = 0;
            cijferinput = 0.0;
            getalinput = 0.0;
            // Tekstvakken Resetten
            tekstvak.getText();
            tekstvak.setText("");
            // Strings Resetten
            tekst = "Nog geen getallen gedetecteerd.";
            uitslag = "Nog niet berekend.";
            repaint();
    }
}
}
