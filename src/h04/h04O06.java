package h04;

import java.applet.Applet;
import java.awt.*;

public class h04O06 extends Applet {


    public void init() {

    }


    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRoundRect(20,20,40,100,10,10);
        g.setColor(Color.red);
        g.fillOval(30,30,20,20);
        g.setColor(Color.yellow);
        g.fillOval(30,60,20,20);
        g.setColor(Color.green);
        g.fillOval(30,90,20,20);
        g.setColor(Color.black);
        g.fillRect(30,120,20,100);
        g.setColor(Color.white);
        g.fillRect(30,135,20,20);
        g.setColor(Color.black);
        g.fillRect(30,150,20,20);
        g.setColor(Color.white);
        g.fillRect(30,165,20,20);
        g.setColor(Color.black);
        g.fillRect(30,180,20,20);
        g.setColor(Color.white);
        g.fillRect(30,195,20,20);
        g.setColor(Color.black);
        g.fillRect(30,210,20,20);
    }
}
