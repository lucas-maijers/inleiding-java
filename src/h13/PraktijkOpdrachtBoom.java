// PraktijkOpdracht 01
package h13;

import java.applet.*;
import java.awt.*;

public class PraktijkOpdrachtBoom extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        tekenBoom(g);
    }

    void tekenBoom(Graphics g) {
        int x, y;
        int hoogteBoom;
        int breedteBoom;
        x = 50;
        y = 100;
        hoogteBoom= 150;
        breedteBoom = 25;

        Color bruin = new Color(0x744915);
        Color groen = new Color(0x1E600C);

        g.setColor(bruin);
        g.fillRect(x,y,breedteBoom,hoogteBoom);
        g.setColor(groen);
        g.fillOval(15,50,x*2,y);
    }
}
