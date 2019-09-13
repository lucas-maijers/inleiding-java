// Opdracht 03
package h12;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class TabellenSorteren extends Applet {
    int[] getallen;
    TextField[] tekstvakken;
    Button okknop;

    public void init() {
        getallen = new int[5];
        // Tekstvakken
        tekstvakken = new TextField[5];
        tekstvakken[0] = new TextField(20);
        tekstvakken[1] =  new TextField(20);
        tekstvakken[2] = new TextField(20);
        tekstvakken[3] = new TextField(20);
        tekstvakken[4] = new TextField(20);
        // Knop
        okknop = new Button("OK");
        okknop.addActionListener(new OkKnopListener());
        // Add
        add(tekstvakken[0]);
        add(tekstvakken[1]);
        add(tekstvakken[2]);
        add(tekstvakken[3]);
        add(tekstvakken[4]);
        add(okknop);
    }

    public void paint(Graphics g) {
    }

    class OkKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getallen[0] =Integer.parseInt(tekstvakken[0].getText());
            getallen[1] =Integer.parseInt(tekstvakken[1].getText());
            getallen[2] =Integer.parseInt(tekstvakken[2].getText());
            getallen[3] =Integer.parseInt(tekstvakken[3].getText());
            getallen[4] =Integer.parseInt(tekstvakken[4].getText());

            // BubbleSort
            int temp;
            boolean fixed = false;

            while(!fixed) {
                fixed=true;

                for (int i=0; i < getallen.length - 1; i++) {
                    if (getallen[i] > getallen[i + 1]) {
                        temp=getallen[i + 1];
                        getallen[i + 1]=getallen[i];
                        getallen[i]=temp;
                        fixed=false;
                    }
                }
            }
            for(int i=0;i<getallen.length;i++) {
                tekstvakken[i].setText(String.valueOf(getallen[i]));
            }
        }
    }

}
