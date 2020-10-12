package h04;

import java.applet.Applet;
import java.awt.*;

public class h04PO extends Applet {


    public void init() {

    }


    public void paint(Graphics g) {
        g.drawLine(20,20,220,20);
        g.drawString("Lijn",100,35);
        g.drawRect(20,40,200,100);
        g.drawString("Rechthoek",85,155);
        g.drawRoundRect(20, 160,200,100,10,10);
        g.drawString("Afgeronde Rechthoek",55,275);
        g.setColor(Color.magenta);
        g.fillRect(240,40,200,100);
        g.setColor(Color.black);
        g.drawOval(240,40,200,100);
        g.drawString("Gevulde rechthoek met Ovaal",250,155);
        g.setColor(Color.magenta);
        g.fillOval(240,160,200,100);
        g.setColor(Color.black);
        g.drawString("Ovaal",325,275);
        g.drawOval(460,40,200,100);
        g.setColor(Color.magenta);
        g.fillArc(460,40,200,100,0,45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met Ovaal eromheen",475,155);
        g.drawOval(515,160,100,100);
        g.drawString("Cirkel",548,275);

    }
}
