// Opdracht 02
package h14;

import java.applet.*;
import java.awt.*;
import java.net.*;
import java.util.*;

public class MultimediaDeckDelen extends Applet {
    private URL pad;
    private AudioClip sound;

    String[] deck;

    public void init() {
        setSize(500,500);

        pad = MultimediaDeckDelen.class.getResource("/resources/");
        sound = getAudioClip(pad, "Ding.wav");

        deck=new String[52];
        // Harten
        deck[0]="Harten een";
        deck[1]="Harten twee";
        deck[2]="Harten drie";
        deck[3]="Harten vier";
        deck[4]="harten vijf";
        deck[5]="Harten zes";
        deck[6]="Harten zeven";
        deck[7]="Harten acht";
        deck[8]="Harten negen";
        deck[9]="Harten tien";
        deck[10]="Harten boer";
        deck[11]="Harten vrouw";
        deck[12]="Harten heer";
        // Klaver
        deck[13]="Klaver een";
        deck[14]="Klaver twee";
        deck[15]="Klaver drie";
        deck[16]="Klaver vier";
        deck[17]="Klaver vijf";
        deck[18]="Klaver zes";
        deck[19]="Klaver zeven";
        deck[20]="Klaver acht";
        deck[21]="Klaver negen";
        deck[22]="Klaver tien";
        deck[23]="Klaver boer";
        deck[24]="Klaver vrouw";
        deck[25]="Klaver heer";
        // Ruiten
        deck[26]="Ruiten een";
        deck[27]="Ruiten twee";
        deck[28]="Ruiten drie";
        deck[29]="Ruiten vier";
        deck[30]="Ruiten vijf";
        deck[31]="Ruiten zes";
        deck[32]="Ruiten zeven";
        deck[33]="Ruiten acht";
        deck[34]="Ruiten negen";
        deck[35]="Ruiten tien";
        deck[36]="Ruiten boer";
        deck[37]="Ruiten vrouw";
        deck[38]="Ruiten heer";
        // Schoppen
        deck[39]="Schoppen een";
        deck[40]="Schoppen twee";
        deck[41]="Schoppen drie";
        deck[42]="Schoppen vier";
        deck[43]="Schoppen vijf";
        deck[44]="Schoppen zes";
        deck[45]="Schoppen zeven";
        deck[46]="Schoppen acht";
        deck[47]="Schoppen negen";
        deck[48]="Schoppen tien";
        deck[49]="Schoppen boer";
        deck[50]="Schoppen vrouw";
        deck[51]="Schoppen heer";
    }

    public void paint(Graphics g) {
        g.drawString("Speler 1", 20,50);
        g.drawString("Speler 2",120,50);
        g.drawString("Speler 3",220,50);
        g.drawString("Speler 4",320,50);

        int speler;
        int y;
        int x;

        x = 20;
        speler = 0;

        while (speler < 4) {
            y = 65;
            for (int i=0; i < 13; i++) {
                g.drawString("" + deelKaart(), x,y);
                y+=15;
            }
            x+=100;
            speler++;
        }
        sound.play();
    }

     private String deelKaart() {
        int random=new Random().nextInt(deck.length);
        String kaart = deck[random];

        String[] hulpLijst=new String[deck.length - 1];
        int hulpindex=0;

        for (int i=0; i < deck.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex]=deck[i];
                hulpindex++;
            }
        }
        deck=hulpLijst;
        return kaart;
    }
}

