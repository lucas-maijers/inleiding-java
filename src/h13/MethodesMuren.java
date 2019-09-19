// Opdracht 03
package h13;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class MethodesMuren extends Applet {
    Label hoogteMuurL;
    Label breedteMuurL;
    TextField hoogteMuurTF;
    TextField breedteMuurTF;
    Button bakstenen;
    Button beton;
    boolean betonMuur, baksteenMuur;

    int hoogteMuur;
    int breedteMuur;

    public void init() {
        setSize(800,500);

        betonMuur = false;
        baksteenMuur = false;

        hoogteMuurL = new Label("Hoogte van de Muur:");
        breedteMuurL = new Label("Breedte van de Muur:");

        hoogteMuurTF = new TextField(20);
        breedteMuurTF = new TextField(20);

        bakstenen = new Button("Baksteen");
        beton = new Button("Beton");

        bakstenen.addActionListener(new BaksteenKnop());
        beton.addActionListener(new BetonKnop());

        add(hoogteMuurL);
        add(hoogteMuurTF);
        add(breedteMuurL);
        add(breedteMuurTF);
        add(bakstenen);
        add(beton);
    }

    public void paint(Graphics g) {
        if (baksteenMuur) {
            tekenBaksteenMuur(g,hoogteMuur,breedteMuur);
        }
        if (betonMuur) {
            tekenBetonMuur(g,hoogteMuur,breedteMuur);
        }
    }

    class BaksteenKnop implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s1 = hoogteMuurTF.getText();
            hoogteMuur = Integer.parseInt(s1);
            String s2 = breedteMuurTF.getText();
            breedteMuur = Integer.parseInt(s2);
            baksteenMuur = true;
            betonMuur = false;
            repaint();
        }
    }

    class BetonKnop implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s1 = hoogteMuurTF.getText();
            hoogteMuur = Integer.parseInt(s1);
            String s2 = breedteMuurTF.getText();
            breedteMuur = Integer.parseInt(s2);
            betonMuur = true;
            baksteenMuur = false;
            repaint();
        }
    }

    // Baksteen Muur

    void tekenBaksteenMuur(Graphics g, int hoogteMuur, int breedteMuur) {
        int teller=0;
        int x, y=40, breedte=50, hoogte=25, breedteEind=25;
        int beginX;
        Color zwart=Color.BLACK;
        Color rood=Color.RED;

        while (teller < hoogteMuur) {
            x=50;
            beginX = breedte + breedteEind;
            // Even rijen
            if (teller % 2 == 0) {
                /* Eindstukken van de muur */
                for (int i=0; i < breedteMuur; i++) {
                    if (i == 0 || i == breedteMuur-1) {
                        g.setColor(zwart);
                        g.drawRect(beginX,y,breedteEind,hoogte);
                        g.setColor(rood);
                        g.fillRect(beginX+1,y+1,breedteEind-1,hoogte-1);
                        beginX = breedte* breedteMuur;
                    }
                    // Vullen
                    else {
                        g.setColor(zwart);
                        g.drawRect(x,y,breedte,hoogte);
                        g.setColor(rood);
                        g.fillRect(x+1,y+1,breedte-1,hoogte-1);
                    }
                    x+=breedte;
                }
            } else {
                x= breedte +breedteEind;
                for (int i = 0; i < breedteMuur-1; i++) {
                    g.setColor(zwart);
                    g.drawRect(x,y,breedte,hoogte);
                    g.setColor(rood);
                    g.fillRect(x+1,y+1,breedte-1,hoogte-1);
                    x += breedte;
                }
            }
            teller++;
            y+=hoogte;
        }
    }
    //BetonMuur
    void tekenBetonMuur(Graphics g, int hoogteMuur, int breedteMuur) {
        int teller=0;
        int x, y=40, breedte=60,hoogte=35, breedteEind=30;
        int beginX;
        Color zwart=Color.BLACK;
        Color grijs=Color.DARK_GRAY;

        while (teller < hoogteMuur) {
            x=breedte;
            beginX = breedte + breedteEind;
            // Even rijen
            if (teller % 2 == 0) {
                /* Eindstukken van de muur */
                for (int i=0; i < breedteMuur; i++) {
                    if (i == 0 || i == breedteMuur-1) {
                        g.setColor(zwart);
                        g.drawRect(beginX,y,breedteEind,hoogte);
                        g.setColor(grijs);
                        g.fillRect(beginX+1,y+1,breedteEind-1,hoogte-1);
                        beginX = breedte * breedteMuur;
                    }
                    // Vullen
                    else {
                        g.setColor(zwart);
                        g.drawRect(x,y,breedte,hoogte);
                        g.setColor(grijs);
                        g.fillRect(x+1,y+1,breedte-1,hoogte-1);
                    }
                    x+=breedte;
                }
            } else {
                x= breedte + breedteEind;
                for (int i = 0; i < breedteMuur-1; i++) {
                    g.setColor(zwart);
                    g.drawRect(x,y,breedte,hoogte);
                    g.setColor(grijs);
                    g.fillRect(x+1,y+1,breedte-1,hoogte-1);
                    x += breedte;
                }
            }
            teller++;
            y+=hoogte;
        }
    }
}
