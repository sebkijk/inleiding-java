package h02;

import java.applet.Applet;
import java.awt.*;

public class OpdrachtUno extends Applet {


    public void init() {
        setBackground(Color.blue);
    }


    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Sebas Khouw", 50, 60);
    }
}
