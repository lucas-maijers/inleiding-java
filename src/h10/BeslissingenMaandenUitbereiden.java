// Opdracht 04
package h10;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class BeslissingenMaandenUitbereiden extends Applet {
    TextField tekstvak1, tekstvak2;
    Label label1;
    String s, tekst, dagen, s2, jaar;
    int maand, jaartal;

    public void init() {
        tekstvak1 = new TextField("",20);
        tekstvak2 = new TextField("2019",5);
        label1 = new Label("Typ het maandnummer en het jaar in en klik op ENTER");
        tekstvak1.addActionListener(new TekstVakListener());
        tekstvak2.addActionListener(new TekstVakListener());
        tekst = "";
        dagen = "";
        jaar = "";
        add(label1);
        add(tekstvak1);
        add(tekstvak2);
    }

    public void paint(Graphics g) {
        g.drawString("Je getal komt over met de maand:" + tekst,50,90);
        g.drawString("De maand "+ tekst + " heeft zoveel dagen: " + dagen, 50,105);
        g.drawString("Het jaar: "+ jaar,50,120);
    }

    class TekstVakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak1.getText();
            maand = Integer.parseInt(s);
            // Schrikkeljaar Vinden
            s2 = tekstvak2.getText();
            jaartal = Integer.parseInt(s2);
            if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0) {
                jaar = ""+ jaartal + " is een schrikkeljaar";
            }
            else {
                jaar = ""+ jaartal + " is geen schrikkeljaar";
            }
            switch(maand) {
                case 1:
                    tekst = "januari";
                    dagen = "31";
                    break;
                case 2:
                    tekst = "februari";
                    if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                            jaartal % 400 == 0) {
                        dagen = "29";
                    }
                    else {
                        dagen = "28";
                    }
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
