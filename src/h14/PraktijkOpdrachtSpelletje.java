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
        winSound = getAudioClip(pad,"YaySoundEffect.wav");
        verliesSound = getAudioClip(pad,"AwwSoundEffect.wav");

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

        nogTeGaan = "Nog weg te halen Smileys: " + aantalSmileys;
        g.drawString(response,50,50);
        g.drawString(nogTeGaan,50,75);

        // Smileys te gaan
        int x=50;
        int y=100;
        for (int i=0; i < aantalSmileys; i++) {
            if (i % 4 == 0) {
                y +=55;
                x = 50;
            }
            g.drawImage(startSmiley,x+=50,y,50,50,this);
        }

        // EindSmiley
        if (gameOver) {
            if (!computerZet) {
                g.drawImage(gewonnenCP,50,100,300,400,this);
            } else {
                g.drawImage(verlorenCP,50,100,400,400,this);
            }
        }
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


    void computer() {

        boolean geenMogelijkheid = true;
        int randomWeg = (int) (Math.random()*3+1);
        // zet 1

        aantalWeghalen = 0;
        if (huidigeZet == 1) {
            if (aantalSmileys == 20) {
                aantalWeghalen = 3;
                huidigeZet++;
                startSmiley = wSmiley;
            }
            else aantalWeghalen = 1;
        }
        //zet 2
        if (huidigeZet == 2) {
            if (aantalSmileys < 17) {
                if (aantalSmileys - 1 == 13) {
                    aantalWeghalen = 1;
                }
                if (aantalSmileys - 2 == 13) {
                    aantalWeghalen = 2;
                }
                if (aantalSmileys - 3 == 13) {
                    aantalWeghalen = 3;
                }
                huidigeZet++;
                startSmiley = wSmiley;
            }
            //Geen 13
            if (aantalSmileys-1 == 17) {
                aantalWeghalen = 1;
                geenMogelijkheid = false;
            }
            if (aantalSmileys-2 == 17) {
                aantalWeghalen = 2;
                geenMogelijkheid = false;
            }
            if (aantalSmileys-3 == 17) {
                aantalWeghalen = 3;
                geenMogelijkheid = false;
            }
            if (geenMogelijkheid) {
                aantalWeghalen = randomWeg;
            } else startSmiley = wSmiley;
        }
        // zet 3
        if (huidigeZet == 3) {
            // Geen 9
            if (aantalSmileys-1 == 13) {
                aantalWeghalen = 1;
                geenMogelijkheid = false;
            }
            if (aantalSmileys-2 == 13) {
                aantalWeghalen = 2;
                geenMogelijkheid = false;
            }
            if (aantalSmileys-3 == 13) {
                aantalWeghalen = 3;
                geenMogelijkheid = false;
            }
            if (geenMogelijkheid) {
                aantalWeghalen = randomWeg;
            } else startSmiley = wSmiley;
        }
        //zet 4
        if (huidigeZet == 4) {
            // Geen 5
            if (aantalSmileys-1 == 9) {
                aantalWeghalen = 1;
                geenMogelijkheid = false;
            }
            if (aantalSmileys-2 == 9) {
                aantalWeghalen = 2;
                geenMogelijkheid = false;
            }
            if (aantalSmileys-3 == 9) {
                aantalWeghalen = 3;
                geenMogelijkheid = false;
            }
            if (geenMogelijkheid) {
                aantalWeghalen = randomWeg;
            } else startSmiley = wSmiley;
        }
        //zet 5
        if (huidigeZet == 5) {
            // Geen 1
            if (aantalSmileys-1 == 5) {
                aantalWeghalen = 1;
                geenMogelijkheid = false;
            }
            if (aantalSmileys-2 == 5) {
                aantalWeghalen = 2;
                geenMogelijkheid = false;
            }
            if (aantalSmileys-3 == 5) {
                aantalWeghalen = 3;
                geenMogelijkheid = false;
            }
            if (geenMogelijkheid) {
                aantalWeghalen = randomWeg;
            } else startSmiley = wSmiley;
        }
        // Zet 6
        if (huidigeZet == 6) {
            if (aantalSmileys-1 == 1) {
                aantalWeghalen = 1;
                geenMogelijkheid = false;
            }
            if (aantalSmileys-2 == 1) {
                aantalWeghalen = 2;
                geenMogelijkheid = false;
            }
            if (aantalSmileys-3 == 1) {
                aantalWeghalen = 3;
                geenMogelijkheid = false;
            }
            if (geenMogelijkheid) {
                aantalWeghalen = randomWeg;
                computerZet = true;
            } else startSmiley = wSmiley;
        }
        if (huidigeZet == 7) {
            if (aantalSmileys == 1) {
                aantalWeghalen = 1;
                computerZet = true;
            }
        }

        aantalSmileys -=aantalWeghalen;
        huidigeZet++;

        response = "De computer heeft: " + aantalWeghalen + " Smileys weggehaald";
        System.out.println(huidigeZet);
    }

    // Spel Voorbij
    void spelOver() {
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
}
