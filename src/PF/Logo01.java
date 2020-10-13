package PF;

import java.applet.Applet;
import java.awt.*;

public class Logo01 extends Applet {


    public void init() {

    }

    public void paint(Graphics g) {
        //Achtergrond Kleur
        setBackground(Color.red);

        // Cirkel Kleur
        g.setColor(Color.WHITE);
        g.fillOval(120,200,250,250);

        // Bolt
        g.setColor(Color.BLACK);
        g.drawLine(350,150,200,300);
        g.drawLine(350,150,280,275);
        g.drawLine(200,300,250,300);
        g.drawLine(280,275,330,275);
        g.drawLine(250,300,175,350);
        g.drawLine(330,275,260,330);
        g.drawLine(175,350,225,350);
        g.drawLine(260,330, 310, 330);
        g.drawLine(225,350,125,450);
        g.drawLine(310,330,125,450);
        g.drawString("TM",340,440);



    }
}
