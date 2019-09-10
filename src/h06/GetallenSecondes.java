// Opdracht 02
package h06;

// Import Commands
import java.applet.*;
import java.awt.*;

public class GetallenSecondes extends Applet {
    // Declaratie
    int Sec, Uur, Dag, Jaar;

    public void init() {
        Sec = 60;
        Uur = Sec * 60;
        Dag = Uur * 24;
        Jaar = Dag * 365;
    }

    public void paint(Graphics g) {
        g.drawString("Aantal Seconde: " + Sec, 20,10);
        g.drawString("Secondes in een Uur: " + Uur, 20,30);
        g.drawString("Secondes in een Dag: " + Dag,20,45);
        g.drawString("Secondes in een Jaar: " + Jaar,20,60);
    }
}
