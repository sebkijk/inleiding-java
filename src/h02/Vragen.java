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
        g.setColor(Color.blue);
        g.drawString("Machinetaal is een taal waarin instructies geschreven zijn die de processor van een computer direct kan uitvoeren.", 50, 65);
        g.setColor(Color.red);
        g.drawString("Welke drie hulpmiddelen heb je nodig om te programmeren?", 50, 80);
        g.setColor(Color.blue);
        g.drawString("Plug-ins, Klasses & Methoden.", 50, 95);
        g.setColor(Color.red);
        g.drawString("Hoe herken je opdrachten in de broncode?", 50, 110);
        g.setColor(Color.blue);
        g.drawString("Door gebruik te maken van regels commentaar. Deze rgels commentaar worden niet door de compiler gelezen, maar zijn bedoeld als uitleg voor de programmeurs.", 50, 125);
        g.setColor(Color.red);
        g.drawString("Waartoe dienen de import-opdrachten?", 50, 140);
        g.setColor(Color.blue);
        g.drawString("De import-opdrachten worden gebruikt om uit de klassenbibliotheek voorgedefinieerde codees op te halen.", 50, 155);
        g.setColor(Color.red);
        g.drawString("Wat is een methode?", 50, 170);
        g.setColor(Color.blue);
        g.drawString("Methodes kun je herkennen aan de ronde haakjes achter de naam van de methode. Een methode bestaat uit een aantal opdrachten met een naam erboven.", 50, 185);
    }
}
