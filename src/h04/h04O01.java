package h04;

import java.applet.Applet;
import java.awt.*;

public class h04O01 extends Applet {
    public void init() {

    }
    public void paint (Graphics graphics) {
        setBackground(Color.white);
        graphics.drawLine(50,120,150,120);
        graphics.drawLine(50,120,100,25);
        graphics.drawLine(150,120,100,25);
    }
}
