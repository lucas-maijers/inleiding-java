// PraktijdOpdracht Tafels Knop
package h11;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class PraktijkOpdrachtTafelsWeergeven extends Applet {
    Label label;
    Button volgende;
    Button vorige;
    int tafel;
    int teller;

    public void init() {
        label = new Label("Klik op de knoppen om door de tafels 1 tot en met 10 te gaan.");
        volgende = new Button("Volgende");
        vorige = new Button("Vorige");
        volgende.addActionListener(new VolgendeKnop());
        vorige.addActionListener(new VorigeKnop());
        tafel = 1;
        teller = 1;
        add(label);
        add(vorige);
        add(volgende);
    }

    public void paint(Graphics g) {
        int y = 25;

        while (teller <= 10) {
            y +=20;
            g.drawString(String.valueOf(teller) + "x" + String.valueOf(tafel) + "=" + tafel * teller,50,y);
            teller++;
        }
    }

    // Volgende Knop
    class VolgendeKnop implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (tafel <10) {
                tafel ++;
            }
            else {
                tafel = 1;
            }
            teller = 1;
            repaint();
        }
    }

    // Vorige Knop
    class VorigeKnop implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (tafel == 1) {
                tafel = 10;
            }
            else {
                tafel --;
            }
            teller = 1;
            repaint();
        }
    }
}
