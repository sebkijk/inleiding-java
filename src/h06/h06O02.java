package h06;

import java.applet.Applet;
import java.awt.*;

public class h06O02 extends Applet {
    int seconden, uur, dag, jaar, uitkomstuur, uitkomstdag, uitkomstjaar;


    public void init() {
        seconden = 60;
        uur = 60;
        dag = 24;
        jaar = 365;
        uitkomstuur = seconden * uur;
        uitkomstdag = (seconden * uur) * dag;
        uitkomstjaar = (seconden * uur) * dag * jaar;

    }


    public void paint(Graphics g) {
       setSize(500,500);
       setBackground(Color.white);
       g.setColor(Color.black);

       // Hoeveel Seconden in een Uur
       g.drawString("Zoveel seconden zitten er in 1 uur: " + uitkomstuur, 50,50);

       // Hoeveel Seconden in een Dag
       g.drawString("Zoveel seconden zitten er in 1 dag: " + uitkomstdag, 50,70);

       // Hoeveel Seconden in een Jaar
       g.drawString("Zoveel seconden zitten er in 1 jaar: " + uitkomstjaar, 50,90);
    }
}
