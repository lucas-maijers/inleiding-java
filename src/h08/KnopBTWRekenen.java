package h08;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class KnopBTWRekenen extends Applet {
    Label label;
    TextField tekstvak;
    Button bereken;
    double aantal;

    public void init() {
        tekstvak = new TextField("",20);
        label = new Label("Typ een bedrag");
        bereken = new Button("Ok");
        tekstvak.addActionListener(new TekstvakListener());
        bereken.addActionListener(new berekenListener());
        add(label);
        add(tekstvak);
        add(bereken);
    }
    public void paint(Graphics g) {
        g.drawString("Bedrag (INCL 21% BTW) €" + aantal * 1.21,50,40);
    }

    // Enterknop Listener
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            aantal = Double.parseDouble( s );
            repaint();
        }
    }
    // Knop Listener
    class berekenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            aantal = Double.parseDouble(s);
            repaint();
        }
    }
}
