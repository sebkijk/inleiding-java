package h07;

import java.applet.Applet;
import java.awt.*;

public class h07Vragen extends Applet {


    public void init() {
        setBackground(Color.white);
        setSize(800,800);
    }


    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawString("1. Je kunt in de methode init() van je applet de afmetingen van het scherm bepalen", 50,50);
        g.drawString("met de methode setSize(int width, int height).", 50,70);
        g.drawString("Tussen de haakjes wordt aangegeven dat deze methode twee argumenten (of parameters) van het type int verwacht.",50,90);
        g.drawString("Kun je in de Java API (zie web-links) deze methode ergens vinden?",50,110);
        g.setColor(Color.black);
        g.drawString("Ja! Bij de Applet sectie van Java, onder de uitbreiding Show.", 50, 130);
        g.setColor(Color.red);
        g.drawString("2. In welke klasse wordt deze methode gedefinieerd?", 50,150);
        g.setColor(Color.black);
        g.drawString("In het de Class java.awt.Component wordt de methode wél genoemd.", 50,170);
        g.drawString("Aangezien Applet een uitbreiding is van onder meer Component, erft zij alle eigenschappen, waaronder methoden.",50,190);
        g.setColor(Color.red);
        g.drawString("3.Dezelfde klasse heeft een tweede methode met dezelfde naam. Wat is het verschil?", 50,210);
        g.setColor(Color.black);
        g.drawString("Een klasse kan verschillende methoden bevatten met dezelfde naam, maar met verschillende argumenten.", 50, 230);
        g.drawString("De klasse Component heeft nog een methode setSize die als argument een instantie van het type Dimension accepteert.",50,250);
        g.drawString("Dit noemen we overloading.", 50,270);

    }
}
