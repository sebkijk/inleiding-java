package h08;

import java.applet.Applet;
import java.awt.*;

public class h08Vragen extends Applet {


    public void init() {
       setSize(900,800);
       setBackground(Color.white);
    }


    public void paint(Graphics g) {
        //Vragen
            //Vraag 1
        g.setColor(Color.red);
        g.drawString("1. Wat is event-handling?", 50,50);
        g.setColor(Color.black);
        g.drawString("Als een gebruiker met de muis op een knop klikt, stuurt Windows een gebeurtenis naar de methode die bij die knop hoort.",50,70);
        g.drawString("In dit geval dat er op de knop is geklikt. Een andere gebeurtenis had dubbelklikken kunnen zijn.",50,90);
        g.drawString("Je kunt ook zeggen: Windows roept de methode aan die bij die knop hoort.",50,110);
        g.drawString("Dit wordt in vaktermen event-handling genoemd.",50,130);

            //Vraag 2
        g.setColor(Color.red);
        g.drawString("2. Wat is een gebruikersinterface?",50,150);
        g.setColor(Color.black);
        g.drawString("Een gebruikersomgeving of gebruikersinterface komt van de Engelse term user interface (UI).",50,170);
        g.drawString("Een gebruikersinterface is de interface tussen een computer (of andere machine) en de mens die de computer gebruikt.",50,190);

            //Vraag 3
        g.setColor(Color.red);
        g.drawString("3. Waarom moet er voor een knop wel en voor een tekst geen event-handling geprogrammeerd worden?",50,210);
        g.setColor(Color.black);
        g.drawString("Omdat je bij het programmeren van de tekst gebruik kan maken van setText.",50,230);
        g.drawString("En bij knoppen moet je een event programmeren, want de knop moet klikbaar zijn.", 50, 250);
        g.drawString("De tekst(vak) hoeft niet klikbaar te zijn. Het hoeft alleen de tekst aan te geven!",50,270);
        g.drawString("In andere woorden: Voor een tekstvak zijn alleen standaarinstellingen nodig.", 50, 310);
        g.drawString("De tekstvak hoeft alleen de ingetikte tekst te tonen en hiervoor hoeft geen event-handeling plaats te vinden.", 50, 330);

            //Vraag 4
        g.setColor(Color.red);
        g.drawString("4. Wat is een lege string?",50,350);
        g.setColor(Color.black);
        g.drawString("Met een lege string kun je het tekstveld leeg laten of leeg maken als er iets in staat.", 50, 370);

            //Vraag 5
        g.setColor(Color.red);
        g.drawString(" 5. Wat is het verschil tussen een tekstvak en een label?", 50, 390);
        g.setColor(Color.black);
        g.drawString("Een label is een tekstvak waarin niets ingetikt kan worden, maar waar het programma wel tekst in kan zetten.", 50,410);

            //Vraag 6
        g.setColor(Color.red);
        g.drawString("6. Waarom moeten getallen uit een tekstvak altijd geconverteerd worden naar een double of een int?",50,430);
        g.setColor(Color.black);
        g.drawString("Omdat als een getal uit een tekstvak opgehaald wordt, dan is het altijd in de vorm van een string",50, 450);
    }
}
