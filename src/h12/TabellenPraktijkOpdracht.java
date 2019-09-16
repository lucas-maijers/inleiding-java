// PraktijkOpdracht
package h12;

// Imports
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class TabellenPraktijkOpdracht extends Applet {
    Label naam;
    Label nummer;
    TextField naaminput;
    TextField nummerinput;
    Button okknop;
    Button resetknop;
    int teller;
    String snaam,snummer;
    String[] namen;
    boolean genoegnummers;

    // Inits
    public void init() {
        setSize(800,400);
        genoegnummers = false;
        /* Labels */
        naam = new Label("Naam Persoon");
        nummer = new Label("Telefoonnummer Persoon");
        /* Tekstvakken */
        naaminput = new TextField(20);
        nummerinput = new TextField("",20);
        /* Enterknop */
        naaminput.addActionListener(new OkKnopListener());
        nummerinput.addActionListener(new OkKnopListener());
        /* Knoppen */
        okknop = new Button("OK");
        okknop.addActionListener(new OkKnopListener());
        resetknop = new Button("RESET");
        resetknop.addActionListener(new ResetKnopListener());
        // Strings
        namen = new String[10];
        /* Toevoegen */
        add(naam);
        add(naaminput);
        add(nummer);
        add(nummerinput);
        add(okknop);
        add(resetknop);

        /* NullPointerException Fix */
        Arrays.fill(namen, "");
    }
    // Paint
    public void paint(Graphics g) {
        int y = 50;
        for (String namen : namen) {
            g.drawString(namen, 60, y+=15);
        }
    }

    // OkKnop
    class OkKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            snaam = naaminput.getText().toLowerCase();
            snummer = nummerinput.getText();
            if (teller < namen.length) {
                namen[teller]="Naam: " + snaam + "    Telefoon Nummer: " + snummer;
                teller++;
                System.out.println("Nummers toegevoegd "+ teller);
                /* Bepalen of er 10 nummers in staan */
                if (teller == namen.length) {
                    genoegnummers = true;
                }
            }
            /* 10 Nummers? Ja? */
            if (genoegnummers) {
                Arrays.sort(namen);
                repaint();
            }
            naaminput.setText("");
            nummerinput.setText("");
        }
    }

    // ResetKnop
    class ResetKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Arrays.fill(namen,"");
            teller = 0;
            genoegnummers = false;
            repaint();
        }
    }
}
