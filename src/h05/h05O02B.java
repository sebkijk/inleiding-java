package h05;

import java.applet.Applet;
import java.awt.*;

public class h05O02B extends Applet {

    // Variabelen Declareren
    int gewichtValerie;
    int hoogteXas;
    int gewichtJeroen;
    int gewichtHans;


    public void init() {
        // Variabelen Initialiseren
        setSize(400,400);
        gewichtValerie = 85;
        hoogteXas = 350;
        gewichtJeroen = 60;
        gewichtHans = 45;
    }


    public void paint(Graphics g) {

        // Dingen in Beeld Brengen

        // Verticale As
        g.drawLine(50,150,50,hoogteXas);

        // Horizontale As
        g.drawLine(50,hoogteXas,hoogteXas,hoogteXas);

        // Tekenen van de staven
            //1. Valerie
        g.setColor(Color.blue);
        g.fillRect(70,hoogteXas - gewichtValerie, 70,gewichtValerie);
        g.setColor(Color.black);
        g.drawString("Valerie", 85,365);

            //2. Jeroen
        g.setColor(Color.red);
        g.fillRect(160, hoogteXas - gewichtJeroen, 70, gewichtJeroen);
        g.setColor(Color.black);
        g.drawString("Jeroen", 175, 365);

            // 3. Hans
        g.setColor(Color.yellow);
        g.fillRect(250,hoogteXas - gewichtHans,70,gewichtHans);
        g.setColor(Color.black);
        g.drawString("Hans", 270,365);

        // KG Tekenen

        g.drawLine(50,330,40,330);
        g.drawString("20",20,330);
        g.drawLine(50,310,40,310);
        g.drawString("40",20,310);
        g.drawLine(50,290,40,290);
        g.drawString("60",20,290);
        g.drawLine(50,270,40,270);
        g.drawString("80",20,270);
        g.drawLine(50,250,40,250);
        g.drawString("100",15,250);
        g.drawLine(50,230,40,230);
        g.drawString("120",15,230);
        g.drawLine(50,210,40,210);
        g.drawString("140",15,210);
        g.drawLine(50,190,40,190);
        g.drawString("160",15,190);
        g.drawLine(50,170,40,170);
        g.drawString("180",15,170);
        g.drawLine(50,150,40,150);
        g.drawString("200",15,150);
        g.drawString("KG",15,130);
    }
}
