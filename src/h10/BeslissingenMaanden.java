// Opdraht 03
package h10;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class BeslissingenMaanden extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst, dagen;
    int maand;

    public void init() {
        tekstvak = new TextField("",20);
        label = new Label("Typ het maandnummer in en klik op ENTER");
        tekstvak.addActionListener(new TekstVakListener());
        tekst = "";
        dagen = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString("Je getal komt over met de maand:" + tekst,50,75);
        g.drawString("De maand "+ tekst + " heeft zoveel dagen: " + dagen, 50,90);
    }

    class TekstVakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            maand = Integer.parseInt(s);
            switch(maand) {
                case 1:
                    tekst = "januari";
                    dagen = "31";
                    break;
                case 2:
                    tekst = "februari";
                    dagen = "28";
                    break;
                case 3:
                    tekst = "maart";
                    dagen = "28";
                    break;
                case 4:
                    tekst = "april";
                    dagen = "30";
                    break;
                case 5:
                    tekst = "mei";
                    dagen = "31";
                    break;
                case 6:
                    tekst = "juni";
                    dagen = "30";
                    break;
                case 7:
                    tekst = "juli";
                    dagen = "31";
                    break;
                case 8:
                    tekst = "augustus";
                    dagen = "31";
                    break;
                case 9:
                    tekst = "september";
                    dagen = "30";
                    break;
                case 10:
                    tekst = "oktober";
                    dagen = "31";
                    break;
                case 11:
                    tekst = "november";
                    dagen = "30";
                    break;
                case 12:
                    tekst = "december";
                    dagen = "31";
                    break;
                default:
                    tekst = "Onbekend";
                    dagen = "Onbekend";
                    break;
            }
            repaint();
        }
    }
}
