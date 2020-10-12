package h04;

import java.applet.Applet;
import java.awt.*;

public class Vragen extends Applet {


    public void init() {

    }


    public void paint(Graphics g) {

        g.setColor(Color.red);
        g.drawString("1.Wat is een platform?", 50, 50);
        g.setColor(Color.black);
        g.drawString("Elke processor heeft zijn eigen machinetaal. Daarnaast heeft elke computer ook een besturingssysteem die ook eigen eisen stelt aan programma's. Die combinatie van een processor en een besturingssysteem noemen we een platform.",50,65);
        g.setColor(Color.red);
        g.drawString("2.Waarom hoeft een programmeur in Java maar één keer een programma te schrijven voor verschillende platforms?",50,80);
        g.setColor(Color.black);
        g.drawString("In Java wordt de broncode vertaald naar een tussentaal die standaard is. Deze tussentaal wordt Bytecode genoemd.",50,95);
        g.drawString("Vervolgens vertaalt de JVM tijdens de uitvoering de applicatie of de applet de bytecode in machinetaal voor het betreffende platform.",50,110);
        g.drawString("In Java hoeft een programmeur dus maar één keer een applicatie of een applet te maken. Wel moet het besturingssysteem over een JVM beschikken.",50,125);
        g.setColor(Color.red);
        g.drawString("3.Wat is bytecode?",50,140);
        g.setColor(Color.black);
        g.drawString("De tussentaal van Java.",50,155);
        g.setColor(Color.red);
        g.drawString("4.Wat doet JVM?",50,170);
        g.setColor(Color.black);
        g.drawString("De JVM vertaalt de bytecode van de applicatie of de applet in machinetaal voor het desbetreffende platform.",50,185);
        g.setColor(Color.red);
        g.drawString("5. Met welke methode kun je een vierkant tekenen?",50,200);
        g.setColor(Color.black);
        g.drawString("Als de laatste twee getallen -de breedte en de hoogte- bij drawRect en fillRect gelijk zijn, is het een vierkant.",50,215);
        g.setColor(Color.red);
        g.drawString("6.Noem drie methodes waarmee je een cirkel kunt tekenen.",50,230);
        g.setColor(Color.black);
        g.drawString("Een cirkel teken je op dezelfde manier als een vierkant, maar dan met drawOval() of fillOval(). De laatste twee getallen zijn dan weer aan elkaar gelijk.",50,245);
        g.drawString("Ook kun je het met drawArc() of fillArc tekenen.",50,260);
        g.setColor(Color.red);
        g.drawString("7.Waarom worden opdrachten voor het scherm in paint() gezet en niet in een andere methode?", 50, 275);
        g.setColor(Color.black);
        g.drawString("Omdat je in een applet met een object van de klasse Graphics lijnen, rechthoeken, ellipsen en bogen kunt tekenen.", 50,290);
        g.drawString("De methode paint() wordt aangeroepen als het applet venster op het scherm wordt ververst",50,305);

    }
}
