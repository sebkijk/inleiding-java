package h05;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class h05O02 extends Applet {

    // Variabelen Gewicht
    int breedte, y, hoogte;

    //Kleuren
    Color Valerie = Color.blue;
    Color Jeroen = Color.red;
    Color Hans = Color.yellow;
    Color Lijnen = Color.black;

    Button groeiknop = new Button ("Groei!");

    public void init() {
        setBackground(Color.white);
        breedte = 20;
        y = 200;
        hoogte = 0;
        add(groeiknop);
        groeiknop.addActionListener(new Groeilistener());

    }


    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(50,200,50,400);
        g.drawLine(50,400,350,400);


        // Valerie
        g.setColor(Valerie);
        g.fillRect(70,y,breedte,hoogte);
        g.setColor(Lijnen);
        g.drawString("Valerie",65,420);

        // Jeroen
        g.setColor(Jeroen);
        g.fillRect(150,y,breedte,hoogte);
        g.setColor(Lijnen);
        g.drawString("Jeroen",145,420);


        // Hans
        g.setColor(Hans);
        g.fillRect(230,y,breedte,hoogte);
        g.setColor(Lijnen);
        g.drawString("Hans",225,420);

        // KG
        g.drawLine(50,380,40,380);
        g.drawString("200",15,380);
        g.drawLine(50,360,40,360);
        g.drawString("180",15,360);
        g.drawLine(50,340,40,340);
        g.drawString("160",15,340);
        g.drawLine(50,320,40,320);
        g.drawString("140",15,320);
        g.drawLine(50,300,40,300);
        g.drawString("120",15,300);
        g.drawLine(50,280,40,280);
        g.drawString("100",15,280);
        g.drawLine(50,260,40,260);
        g.drawString("80",20,260);
        g.drawLine(50,240,40,240);
        g.drawString("60",20,240);
        g.drawLine(50,220,40,220);
        g.drawString("40",20,220);
        g.drawLine(50,200,40,200);
        g.drawString("20",20,200);
        g.drawString("KG",15,180);
    }
    class Groeilistener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            hoogte += 10;
            System.out.println("De hoogte is " + hoogte);
            repaint();
        }


    }

    }

