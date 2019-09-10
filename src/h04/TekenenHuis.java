// Opdracht 02
package h04;
 import java.applet.*;
 import java.awt.*;

 public class TekenenHuis extends Applet {

     public void init() {
     }

     public void paint(Graphics g) {
         g.setColor(Color.black);
         // Huis
         g.drawRect(20,100,150,100);
         // Dak
         g.drawLine(20,100,95,30);
         g.drawLine(95,30,170,100);
         // Deur
         g.drawRect(50,160,20,40);
         g.drawOval(60,180,5,5);
         // Raam 1
         g.drawRect(120,160,20,20);
         g.drawLine(120,170,140,170);
         g.drawLine(130,160,130,180);
         // Raam 2
         g.drawRect(120,120,20,20);
         g.drawLine(120,130,140,130);
         g.drawLine(130,120,130,140);
         // Raam 3
         g.drawRect(50,120,20,20);
         g.drawLine(50,130,70,130);
         g.drawLine(60,120,60,140);
         // Schoorsteen
         g.drawLine(120,52,120,30);
         g.drawLine(130,30,130,63);
         g.drawLine(120,30,130,30);
     }
 }