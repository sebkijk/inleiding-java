package h04;

import java.applet.Applet;
import java.awt.*;

public class h04O02 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.drawLine(50,120,150,120);
        g.drawLine(50,120,100,25);
        g.drawLine(150,120,100,25);
        g.drawRect(50,120,100,120);
        g.drawRect(80,190,25,50);
        g.drawOval(60,130,20,20);
        g.drawOval(115,130,20,20);
        g.drawOval(95,210,5,5);

    }
}
