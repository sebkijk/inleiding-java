package h02;

import java.applet.Applet;
import java.awt.*;

public class Vragen extends Applet {


    public void init() {
        setBackground(Color.white);
    }


    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawString("Wat is machinetaal?",50,50);
        g.setColor(Color.green);
        g.drawString("Machinetaal is een taal waarin instructies geschreven zijn die de processor van een computer direct kan uitvoeren", 50, 65);
    }
}
