package PF;

import java.applet.Applet;
import java.awt.*;

public class Logo01B extends Applet {




    public void init() {


    }



    public void paint(Graphics g) {
        super.paint(g);

        //Cirkel
        g.setColor(Color.RED);
        g.fillOval(70,100,200,200);

        // Triangle Settings
        int[] xPoints = {250,100,200};
        int[] yPoints = {100,200,200};

        //Triangle 1
        g.setColor(Color.black);
        g.drawPolygon(xPoints, yPoints, 3);
        g.setColor(Color.yellow);
        g.fillPolygon(xPoints, yPoints, 3);

        //Rechthoek
        g.setColor(Color.black);
        g.drawLine(175,175,240,175);
        g.drawLine(175,175,110,300);
        g.drawLine(240,175,110,300);




    }
}
