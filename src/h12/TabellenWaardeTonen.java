// Opdracht 06
package h12;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class TabellenWaardeTonen extends Applet {
    TextField tekstvak;
    int[] tabel;
    int gezocht;
    int aantal;
    String s,tekst;

    public void init() {
        tekstvak = new TextField(20);
        tekstvak.addActionListener(new TekstvakListener());
        tabel = new int[100];

        // Getallen in tabel declareren
        for (int teller = 0; teller < tabel.length; teller++) {
            tabel[teller] =(int) (Math.random() * 100);
            System.out.println(""+tabel[teller]);
        }
        tekst = "";
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst,50,50);
    }

    // Zoeken
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int teller;
            teller = 0;
            s = tekstvak.getText();
            gezocht = Integer.parseInt(s);


            // Zoeken in het tabel

            while (teller < tabel.length) {
                if (tabel[teller] == gezocht) {
                    aantal++;
                }
                teller++;
            }

            // Tekst bepalen

            if (aantal > 0) {
                tekst = "Het getal "+gezocht+" staat "+aantal+" keer in de tabel";
            }
            else {
                tekst = "Het getal "+gezocht+" staat niet in de tabel";
            }

            // Strings benoemen



            repaint();

            // Aantal Resetten
            aantal = 0;
        }
    }
}
