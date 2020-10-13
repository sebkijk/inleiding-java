package h05;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h05O01 extends Applet {

    // Een int is een stukje geheugen voor een geheel getal
    int getal1, getal2, optelsom;

    // Een double is een stukje geheugen voor een kommagetal
    double factor1, factor2, product;

    // Een boolean is een stukje geheugen voor true of false

    // Variabelen voor de rechthoek
    int breedte, hoogte;

    // Kleurenvariablen
    Color rechthoekleur = Color.ORANGE;

    // Knop Blauwe Rechthoek
    Button groeiknop = new Button("GROW!");

    public void init() {
        setBackground(Color.DARK_GRAY);
        getal1 = 10;
        getal2 = 9;
        factor1 = 19.96;
        factor2 = 96.19;
        optelsom = getal1 + getal2;
        product = factor1 * factor2;
        breedte = 300;
        hoogte = 200;
        add(groeiknop);
        groeiknop.addActionListener(new GroeiListener());
    }


    public void paint(Graphics g) {

        // Kleur
        g.setColor(Color.WHITE);


        // Optelsom
        String optelsomString = getal1 + "+" + getal2 + "=" + optelsom;
        g.drawString(optelsomString, 50, 50);

        // Vermenigvuldiging
        String keersomString = factor1 + "x" + factor2 + "=" + product;
        g.drawString(keersomString, 50,70);

        // Rechthoek Tekenen
        g.fillRect(50,100,200,100);

        // Rechthoek met Variablen Tekenen
        g.setColor(Color.CYAN);
        g.fillRect(50,250, breedte, hoogte);

        // Rechthoek met Oranje Kleur
        g.setColor(rechthoekleur);
        g.fillRect(450,100, breedte,hoogte);
    }

    class GroeiListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            breedte +=10;
            System.out.println("De breedte is " + breedte);
            repaint();
        }
    }
}
