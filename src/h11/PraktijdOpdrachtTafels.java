// PraktijdOpdracht Tafels
package h11;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class PraktijdOpdrachtTafels extends Applet {
    TextField input;
    Label label;
    Button knop;
    String s;
    int tafel;

    public void init() {
        label = new Label("Vul hier de tafel van jouw getal in:");
        input = new TextField("",20);
        knop = new Button("Ok");
        knop.addActionListener(new KnopListener());
        add(label);
        add(input);
        add(knop);
    }

    public void paint(Graphics g) {
        int teller = 1;
        int y = 20;

        while (teller <= 10) {
            y +=20;
            g.drawString(String.valueOf(teller) + "x" + String.valueOf(tafel) + "=" + tafel * teller,50,y);
            teller++;
        }
    }
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = input.getText();
            tafel = Integer.parseInt(s);
            repaint();
        }
    }
}
