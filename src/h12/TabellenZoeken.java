// Opdracht 04
package h12;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class TabellenZoeken extends Applet {
    TextField tekstvak;
    Button okknop;
    int[] getallen;
    boolean gevonden;
    int gezocht;
    int teller;
    String s,tekst;

    public void init() {
        gevonden = false;;
        getallen = new int[100];
        teller = 0;
        // Invoerplek en Knop
        tekstvak = new TextField(20);
        tekstvak.addActionListener(new Zoeken());
        okknop = new Button("OK");
        okknop.addActionListener(new Zoeken());

        add(tekstvak);
        add(okknop);
        // getallen declareren
        for(int teller=0; teller < getallen.length; teller++) {
            getallen[teller] = teller;
        }

        // Strings waarden
        tekst = "Vul een getal in en klik op OK";
    }

    public void paint(Graphics g) {
        g.drawString(tekst,20,50);
    }

    // OkKnop
    class Zoeken implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            gezocht = Integer.parseInt(s);
            teller = 0;

            if (gezocht > getallen.length) {
                tekst = "Het ingevoerde getal: "+gezocht+" is niet gevonden";
                repaint();
            }

            while(teller<getallen.length) {
                if (getallen[teller] == gezocht) {
                    gevonden=true;
                    tekst = "Het ingevoerde getal: "+gezocht+" IndexNummer:"+"["+ (teller - 1) +"]"+" is gevonden.";;
                    repaint();
                }
                teller ++;
            }
        }
    }
}
