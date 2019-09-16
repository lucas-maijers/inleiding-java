// Opdracht 02
package h08;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class KnoppenCounter extends Applet {
    Button mknop, vknop, mknopg, vknopg;
    int aantalm, aantalv, aantalmg, aantalvg;
    int totaal;

    public void init() {
        // Maak de knoppen
        mknop = new Button("Aantal Mannen.");
        mknopg = new Button("Aantal geschikte Mannen.");
        vknop = new Button("Aantal Vrouwen.");
        vknopg = new Button("Aantal geschikte Vrouwen.");
        // Listeners
        mknop.addActionListener( new mknopListener());
        mknopg.addActionListener(new mknopgListener());
        vknop.addActionListener(new vknopListener());
        vknopg.addActionListener(new vknopgListener());
        // Voeg de knoppen toe.
        add(mknop);
        add(mknopg);
        add(vknop);
        add(vknopg);
    }

    public void paint(Graphics g) {
        g.drawString("Aantal Mannen: " + aantalm, 50,90);
        g.drawString("Aantal Geschikte Mannen: " + aantalmg,50,105);
        g.drawString("Aantal Vrouwen: " + aantalv,50,120);
        g.drawString("Aantal Geschikte Vrouwen: " + aantalvg,50,135);
        g.drawString("Totaal Aantal: " + totaal,50,170);
    }

    // Listener Mannen
    class mknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            aantalm++;
            totaal++;
            repaint();
        }
    }
    // Listener Geschikte Mannen
    class mknopgListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            aantalmg++;
            aantalm ++;
            totaal++;
            repaint();
        }
    }
    // Listener Vrouwen
    class vknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            aantalv++;
            totaal++;
            repaint();
        }
    }
    // Listener Geschikte Vrouwen
    class vknopgListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            aantalvg++;
            aantalv++;
            totaal++;
            repaint();
        }
    }
}

