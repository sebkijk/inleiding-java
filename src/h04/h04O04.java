package h04;

import java.applet.Applet;
import java.awt.*;

public class h04O04 extends Applet {

    public void init() {

    }


    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(50,200,50,400);
        g.drawLine(50,400,400,400);
        g.setColor(Color.blue);
        g.fillRect(70,360,20,40);
        g.setColor(Color.black);
        g.drawString("Valerie",65,420);
        g.setColor(Color.yellow);
        g.fillRect(150,300,20,100);
        g.setColor(Color.black);
        g.drawString("Jeroen",145,420);
        g.setColor(Color.red);
        g.fillRect(230,320,20,80);
        g.setColor(Color.black);
        g.drawString("Hans",225,420);
        g.drawLine(50,380,40,380);
        g.drawString("20",20,380);
        g.drawLine(50,360,40,360);
        g.drawString("40",20,360);
        g.drawLine(50,340,40,340);
        g.drawString("60",20,340);
        g.drawLine(50,320,40,320);
        g.drawString("80",20,320);
        g.drawLine(50,300,40,300);
        g.drawString("100",15,300);
        g.drawLine(50,280,40,280);
        g.drawString("120",15,280);
        g.drawLine(50,260,40,260);
        g.drawString("140",15,260);
        g.drawLine(50,240,40,240);
        g.drawString("160",15,240);
        g.drawLine(50,220,40,220);
        g.drawString("180",15,220);
        g.drawLine(50,200,40,200);
        g.drawString("200",15,200);
        g.drawString("KG",15,180);

    }
}
