// Opdracht 01
package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class KnopTesten extends Applet {
    TextField tekstvak;
    Button knop;
    String output;
    Button reset;

    public void init() {
        // Invulknop
        tekstvak = new TextField("", 30);
        knop = new Button("Ok");
        // Resetknop
        reset = new Button("Reset");
        // Creeërt de Classes
        knop.addActionListener( new KnopListener() );
        reset.addActionListener( new ResetknopListener() );
        // Voegt het toe
        add(tekstvak);
        add(knop);
        add(reset);
        // Output van Tekstvlak
        output = "";
    }

    public void paint(Graphics g) {
        g.drawString("Type een hele lange tekst " +
                "in het tekstvakje " +
                "en klik op Ok", 50, 60 );
        g.drawString("Dit heb jij in het tekstvak gezet: "+output,50,95);
        g.drawString("Hierboven staat de tekst die jij in het tekstvak hebt gezet.",50,125);
    }

    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            output = tekstvak.getText();
            repaint();
        }
    }

    class ResetknopListener implements ActionListener    {
        public void actionPerformed( ActionEvent e ) {
            tekstvak.setText("Je tekst wordt over 5 Seconden gereset.");
            repaint();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            tekstvak.setText("");
            output = "";
            repaint();
        }
    }
}