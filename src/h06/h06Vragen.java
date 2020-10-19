package h06;

import java.applet.Applet;
import java.awt.*;

public class h06Vragen extends Applet {


    public void init() {

    }


    public void paint(Graphics g) {
        setSize(800,800);
        setBackground(Color.white);
        // Vragen
            //Vraag 1
        g.setColor(Color.red);
        g.drawString("1. Waarom is initialiseren van variabelen noodzakelijk?", 50,50);
        g.setColor(Color.black);
        g.drawString("Het initialiseren moet altijd gebeuren, want anders weet je niet welke waarde in een variabele staat.",50,70);

            //Vraag 2
        g.setColor(Color.red);
        g.drawString("2. Waarom is er typecasting noodzakelijk bij de conversie van een double naar een int?", 50, 90);
        g.setColor(Color.black);
        g.drawString("Bij de conversie van double naar int kan wel informatie verloren gaan.", 50,110);
        g.drawString("De conversie van 8.3 naar een int zou immers 8 opleveren.", 50,130);
        g.drawString("Om toch conversie van double naar int af te dwingen moet er typecasting plaatsvinden.",50,150);
        g.drawString("Hiermee zegt de programmeur als het ware tegen de compiler dat hij zich er van bewust is,", 50,170);
        g.drawString("dat er informatie verloren kan gaan. Nu accepteert de compiler dat echter wel.",50,190);
        g.drawString("De double die achter (int) staat, beschouwt de compiler nu als een geheel getal.",50,210);
        g.drawString("Dat betekent dat de compiler de cijfers achter de decimale punt weghaalt.",50,230);

            //Vraag 3
        g.setColor(Color.red);
        g.drawString("3. Wat is de uitvoer van dit programma? Geef een verklaring.",50,250);
        g.setColor(Color.black);
        g.drawString("a = 8.",50,270);
        g.drawString("b = 8.", 50, 290);
        g.drawString("c = 3.", 50,310);
        g.drawString("uitkomst = (a + b) / c.", 50,330);
        g.drawString("Eerst tel je a + b bij elkaar op, want die zitten tussen haakjes.", 50, 350);
        g.drawString("Dus 8 + 8 = 16.", 50,370);
        g.drawString("Daarna deel je de uitkomst van (a + b) door 3.", 50, 390);
        g.drawString("Dus 16 /3 = 5,333333333333333.", 50,410);

            //Vraag 4 + 5
        g.setColor(Color.red);
        g.drawString("4. In de regel uitkomst = (a + b) / c; laat je de ronde haken weg.",50,430);
        g.drawString("De regel ziet er dan als volgt uit: uitkomst = a + b / c",50,450);
        g.drawString("5. Wat is de uitvoer van dit programma? Geef een verklaring.", 50,470);
        g.setColor(Color.black);
        g.drawString("Nu deel je eerst b door c. Dus 8 /3 = 2.66666666667.",50,490);
        g.drawString("Daarna tel je a + 2.66666666667. Dus 8 + 2.66666666667 = 10.66666666667",50,510);
        g.drawString("Je doet dit omdat a + b niet meer tussenhaakjes zit.", 50,530);
        g.drawString("Je moet altijd eerst delen dan, voordat je gaat optellen.",50,550);


    }
}
