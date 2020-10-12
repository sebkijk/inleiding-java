package h04;

import java.applet.Applet;
import java.awt.*;

public class h04O07 extends Applet {


    public void init() {

    }


    public void paint(Graphics g) {

        g.setColor(Color.white);
        g.fillRoundRect(20, 20, 100, 100, 10, 10);
        g.setColor(Color.black);
        g.fillOval(40,40,20,20);
        g.fillOval(80,40,20,20);
        g.fillOval(40,80,20,20);
        g.fillOval(80,80,20,20);
    }
}
