package h04;

import java.applet.Applet;
import java.awt.*;

public class h04O03 extends Applet {


    public void init() {

    }


    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.red);
        g.fillRect(40,40,200,100);
        g.setColor(Color.black);
        g.drawRect(40,140,200,100);
        g.setColor(Color.blue);
        g.fillRect(40,240,200,100);

    }
}
