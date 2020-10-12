package h04;

import java.applet.Applet;
import java.awt.*;

public class h04O05 extends Applet {


    public void init() {

    }


    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.fillOval(20, 20, 100, 50);
        g.setColor(Color.yellow);
        g.fillArc(20,20,100,50,90,45);

    }
}
