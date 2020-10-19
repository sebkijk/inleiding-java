package h06;

import java.applet.Applet;
import java.awt.*;

public class h06O01 extends Applet {
    double a, b, uitkomst;

    public void init() {
        a = 113;
        b = 4;
        uitkomst = a / b;


    }


    public void paint(Graphics g) {
        setSize(300,300);
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawString("Geld voor Jan: " + uitkomst, 50,50);
        g.drawString("Geld voor Ali: " + uitkomst, 50,70);
        g.drawString("Geld voor Jeannette: " + uitkomst,50,90);
        g.drawString("Geld voor Sebas: " + uitkomst, 50,110);

    }
}
