package PF;

import java.applet.Applet;
import java.awt.*;

public class Zelfportret1 extends Applet {


    public void init() {
        super.init();
    }


    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.drawLine(70,430,90,490);
        g.drawLine(90,490,150,520);
        g.drawLine(150,520,185,540);
        g.drawLine(185,540,230,540);
        g.drawLine(230,540,300,440);
        g.drawLine(300,440,300,260);
        g.drawLine(300,280,315,250);
        g.drawLine(315,250,320,250);
        g.drawLine(320,250,305,310);
        g.drawLine(305,310,310,310);
        g.drawLine(320,250,320,280);
        g.drawLine(300,320,310,320);
        g.drawLine(310,320,320,310);
        g.drawLine(320,310,310,310);
        g.drawLine(320,280,315,270);
        g.drawLine(320,280,310,310);
        g.drawLine(300,440,300,505);
        g.drawLine(300,455,350,505);
        g.drawLine(70,430,75,220);
        g.drawLine(115,502,115,550);
    }
}
