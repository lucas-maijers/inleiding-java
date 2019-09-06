package h08;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class RekenMachine extends Applet {
    TextField tekstvak1;
    TextField tekstvak2;
    Button plusknop;
    Button minknop;
    Button keerknop;
    Button deelknop;
    Button clearknop;
    double resultaat;
    double getal1;
    double getal2;

    public void init() {
        // Tekstvakken
        tekstvak1 = new TextField(10);
        tekstvak2 = new TextField(10);
        // Knoppen
        plusknop = new Button("+");
        minknop = new Button("-");
        keerknop = new Button("*");
        deelknop = new Button("/");
        clearknop = new Button("C");
        // Listeners
        plusknop.addActionListener(new PlusKnopListener());
        minknop.addActionListener(new MinKnopListener());
        keerknop.addActionListener(new KeerKnopListener());
        deelknop.addActionListener(new DeelKnopListener());
        clearknop.addActionListener(new ClearKnopListener());
        // Toevoegen
        add(tekstvak1);
        add(tekstvak2);
        add(plusknop);
        add(minknop);
        add(keerknop);
        add(deelknop);
        add(clearknop);
    }
    public void paint(Graphics g) {
    }

    // PlusKnop
    class PlusKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Getal 1
            String s1 = tekstvak1.getText();
            getal1 = Double.parseDouble(s1);
            //Getal 2
            String s2 = tekstvak2.getText();
            getal2 = Double.parseDouble(s2);
            // Uitrekenen
            resultaat = getal1 + getal2;
            tekstvak1.setText("" + resultaat);
            tekstvak2.setText("");
            repaint();
        }
    }
    // MinKnop
    class MinKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //Getal 1
            String s1 = tekstvak1.getText();
            getal1 = Double.parseDouble(s1);
            //Getal 2
            String s2 = tekstvak2.getText();
            getal2 = Double.parseDouble(s2);
            //Uitrekenen
            resultaat = getal1 - getal2;
            tekstvak1.setText("" + resultaat);
            tekstvak2.setText("");
            repaint();
        }
    }
    //KeerKnop
    class KeerKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Getal 1
            String s1 = tekstvak1.getText();
            getal1 = Double.parseDouble(s1);
            //Getal 2
            String s2 = tekstvak2.getText();
            getal2 = Double.parseDouble(s2);
            //Uitrekenen
            resultaat = getal1 * getal2;
            tekstvak1.setText("" + resultaat);
            tekstvak2.setText("");
            repaint();
        }
    }
    //Deelknop
    class DeelKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //Getal 1
            String s1 = tekstvak1.getText();
            getal1 = Double.parseDouble(s1);
            //Getal2
            String s2 = tekstvak2.getText();
            getal2 = Double.parseDouble(s2);
            //Uitrekenen
            resultaat = getal1 / getal2;
            tekstvak1.setText("" + resultaat);
            tekstvak2.setText("");
            repaint();
        }
    }
    //ClearKnop
    class ClearKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //Resetten
            tekstvak1.getText();
            tekstvak2.getText();
            tekstvak1.setText("");
            tekstvak2.setText("");
            repaint();
        }
    }
}
