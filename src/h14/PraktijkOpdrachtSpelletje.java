// PraktijkOpdracht
package h14;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;

public class PraktijkOpdrachtSpelletje extends Applet {

    // Afbeeldingen
    private URL pad;
    private Image verlorenCP;
    private Image gewonnenCP;
    private Image wSmiley;
    private Image vSmiley;
    private AudioClip winSound;
    private AudioClip verliesSound;

    private boolean computerZet;
    private boolean gameOver;

    private int aantalSmileys;
    private int aantalWeghalen;
    private int huidigeZet;
    private Label informatie;
    private TextField input;
    private Button speel;
    private Button newGame;
    private String response;
    private Image startSmiley;
    private String nogTeGaan;

    public void init() {
        setSize(800, 700);

        // Afbeelding bepalen
        pad = PraktijkOpdrachtSpelletje.class.getResource("/resources/");
        verlorenCP = getImage(pad, "ComputerVerloren.jpeg");
        gewonnenCP = getImage(pad, "ComputerGewonnen.jpeg");
        wSmiley = getImage(pad, "ComputerWinnend.jpeg");
        vSmiley = getImage(pad, "NeutralSmiley.jpeg");
        winSound = getAudioClip(pad, "YaySoundEffect.wav");
        verliesSound = getAudioClip(pad, "AwwSoundEffect.wav");

        // Sommige Waarde enzo
        computerZet = false;
        huidigeZet = 1;
        aantalSmileys=23;
        response = "";
        startSmiley = vSmiley;

        // Tekstvakken en die bende
        informatie = new Label("Hoeveel smileys neem je (één, twee of drie)?");
        input = new TextField(20);
        speel = new Button("Speel");
        newGame = new Button("Nieuw Spel");

        // Listeners
        speel.addActionListener(new HaalSmileysWeg());
        input.addActionListener(new HaalSmileysWeg());
        newGame.addActionListener(new NewGame());

        // Adden
        add(informatie);
        add(input);
        add(speel);
        add(newGame);
    }

    public void paint(Graphics g) {
        uitleg(g);

        nogTeGaan = "Nog weg te halen Smileys: " + aantalSmileys;
        g.drawString(response,50,110);
        g.drawString(nogTeGaan,50,125);

        // Smileys te gaan
        int x = 50;
        int y = 130;
        for (int i=0; i < aantalSmileys; i++) {
            if (i % 4 == 0) {
                y +=55;
                x = 50;
            }
            g.drawImage(startSmiley,x+=50,y,50,50,this);
        }
        gameOver(g);
    }

    class HaalSmileysWeg implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s;
            s = input.getText();

            if (s.equals(String.valueOf(1)) || s.equals(String.valueOf(2)) || s.equals(String.valueOf(3))) {
                aantalWeghalen = Integer.parseInt(s);
                aantalSmileys -= aantalWeghalen;
                computer();
            }
            else if (s.equals("")) {
                response = "Voer een getal in.";
            }
            else {
                response = "Onjuist getal ingevoerd";
            }
            if (aantalSmileys <= 0) {
                spelOver();
            }
            input.setText("");
            repaint();
        }
    }

    // New Game
    class NewGame implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            response = "";
            aantalSmileys = 23;
            huidigeZet = 1;
            computerZet = false;
            gameOver = false;
            startSmiley = vSmiley;
            repaint();
        }
    }


    private void computer() {
        aantalWeghalen  = 0;
        int randomWeg = (int) (Math.random()*3+1);
        int computerBeurt;
        computerBeurt = aantalSmileys % 4;

        switch (computerBeurt) {
            case 0:
                aantalWeghalen = 3;
                startSmiley = wSmiley;
                break;
            case 1:
                aantalWeghalen = randomWeg;
                break;
            case 2:
                aantalWeghalen = 1;
                startSmiley = wSmiley;
                break;
            case 3:
                aantalWeghalen = 2;
                startSmiley = wSmiley;
                break;
        }

        aantalSmileys -= aantalWeghalen;
        huidigeZet++;
        computerZet = huidigeZet <= 6 || startSmiley != wSmiley;

        response = "De computer heeft: " + aantalWeghalen + " Smileys weggehaald";
        System.out.println(huidigeZet);
    }

    // Spel Voorbij
    private void spelOver() {
        gameOver = true;
        aantalSmileys = 0;
        if (computerZet) {
            response = "Dat is gemeen, je hebt mij verslagen.";
            nogTeGaan = "Er zijn geen Smileys meer over.";
            winSound.play();
        }
        else {
            response = "HAHA, Ik heb gewonnen!";
            nogTeGaan = "Er zijn geen Smileys meer over.";
            verliesSound.play();
        }
    }

    // Gameover
    private void gameOver(Graphics g) {
        // EindSmiley
        if (gameOver) {
            if (!computerZet) {
                g.drawImage(gewonnenCP,50,120,300,400,this);
            } else {
                g.drawImage(verlorenCP,50,120,400,400,this);
            }
        }
    }

    // Uitleg
    private void uitleg(Graphics g) {
        Font normal = new Font("Ariel",Font.PLAIN,12);
        Font f = new Font("Ariel",Font.BOLD,14);
        g.setFont(f);
        g.drawString("Welkom bij het spelletje: Steel de Smileys.", 80, 55);
        g.drawString("In dit spelletje is het de bedoeling dat jij de computer laat verliezen door 1 smiley over te houden.",80,70);
        g.drawString("Hoe vraag je dan? Dat ga ik lekker niet zeggen.",80,85);
        g.setFont(normal);
    }
}
