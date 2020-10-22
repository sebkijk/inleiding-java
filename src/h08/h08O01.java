package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h08O01 extends Applet {
    TextField tekstvak;
    Label label;
    Button knop, reset;
    String s;

    public void init() {
        setSize(800,400);
        tekstvak = new TextField("",30);
        label = new Label("Typ iets in het tekstvakje" + " en druk op OK. "
                + "Klik op RESET " + "om te resetten.");
        knop = new Button("OK");
        reset = new Button ("RESET");
        knop.addActionListener( new KnopListener ());
        reset.addActionListener( new ResetListener ());
        add(tekstvak);
        add(knop);
        add(label);
        add(reset);
    }


    public void paint(Graphics g) {
        g.drawString(s,50,60);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
           s = tekstvak.getText();
            repaint();
        }
    }
    class ResetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            tekstvak.setText("");
        }
    }

}

