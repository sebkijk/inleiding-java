package h06;

import java.applet.Applet;
import java.awt.*;

public class h06O03 extends Applet {
    int a,b, uitkomst;



    public void init() {
    a = 2147483647;
    b = 1;
    uitkomst = a + b;
    }


    public void paint(Graphics g) {
        setSize(400,200);
    g.drawString("De uitkomst is: " + uitkomst,50,50);
    }
}
