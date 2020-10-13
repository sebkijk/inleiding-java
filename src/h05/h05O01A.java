package h05;

import java.applet.Applet;
import java.awt.*;

public class h05O01A extends Applet {
    // Lijn Variabelen
    int x,y,x2,y2;

    // Rechthoek Variablen
    int hoekbreedte, hoekhoogte;

    // Kleur
    Color ovaal = Color.magenta;
    Color omlijning = Color.black;


    public void init() {
        x = 20;
        y = 20;
        x2 = 220;
        y2 = 20;
        hoekbreedte = 200;
        hoekhoogte = 100;


    }


    public void paint(Graphics g) {
        // Lijn Tekening
        g.drawLine(x,y,x2,y2);
        g.drawString("Lijn",100,35);

        // Rechthoek Tekening
        g.drawRect(20,40,hoekbreedte,hoekhoogte);
        g.drawString("Rechthoek",85,155);

        // Afgeronde Rechthoek
        g.drawRoundRect(20,160,hoekbreedte,hoekhoogte,10,10);
        g.drawString("Afgeronde Rechthoek",55,275);

        // Gevulde Rechthoek
        g.setColor(ovaal);
        g.fillRect(240,40,hoekbreedte,hoekhoogte);
        g.setColor(omlijning);
        g.drawOval(240,40,hoekbreedte,hoekhoogte);
        g.drawString("Gevulde rechthoek met Ovaal",250,155);

        // Gevulde Ovaal
        g.setColor(ovaal);
        g.fillOval(240,160,hoekbreedte,hoekhoogte);
        g.setColor(omlijning);
        g.drawString("Gevulde Ovaal", 300,275);

        // Taartpunt met Ovaal eromheen
        g.setColor(omlijning);
        g.drawOval(460,40,hoekbreedte,hoekhoogte);
        g.setColor(ovaal);
        g.fillArc(460,40,hoekbreedte,hoekhoogte,0,45);
        g.setColor(omlijning);
        g.drawString("Taartpunt met Ovaal eromheen", 475,155);

        // Cirkel
        g.drawOval(515,160,hoekhoogte,hoekhoogte);
        g.drawString("Cirkel",548,275);



    }
}
