// Opdracht 01
package h14;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class MultimediaKaartDelen extends Applet{
    Button deelKaart;
    String[] soort;
    String[] getal;

    public void init() {
        deelKaart = new Button("Deel kaart");
        deelKaart.addActionListener(new DeelKaartKnop());

        soort =  new String[4];
        soort[0] = "Harten";
        soort[1] = "Klaver";
        soort[2] = "Ruiten";
        soort[3] = "Schoppen";

        getal = new String[13];
        getal[0] = "Een";
        getal[1] = "Twee";
        getal[2] = "Drie";
        getal[3] = "Vier";
        getal[4] = "Vijf";
        getal[5] = "Zes";
        getal[6] = "Zeven";
        getal[7] = "Acht";
        getal[8] = "Negen";
        getal[9] = "Tien";
        getal[10] = "Boer";
        getal[11] = "Koningin";
        getal[12] = "Koning";
        add(deelKaart);
    }

    public void paint(Graphics g) {
        int randomSoort = (int) (Math.random() * 4);
        int randomNummer = (int) (Math.random() * 13);
        g.drawString(""+ soort[randomSoort]+" "+ getal[randomNummer],20,40);
        System.out.println("De kaart: "+soort[randomSoort] + " " + getal[randomNummer]+" Is gedeeld.");
    }

    class DeelKaartKnop implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            repaint();
        }
    }
}
