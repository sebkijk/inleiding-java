package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h08O02 extends Applet {
    TextField tekstvak1, tekstvak2, tekstvak3, tekstvak4;
    Label label;
    Button male, female, studentmale, studentfemale;
    String s;


    public void init() {
        setSize(800,400);
        tekstvak1 = new TextField("",20);
        tekstvak2 = new TextField("",20);
        tekstvak3 = new TextField("",20);
        tekstvak4 = new TextField("",20);
        label = new Label("Type aantal in");
        male = new Button ("Aantal Male");
        female = new Button ("Aantal Female");
        studentfemale = new Button ("Aantal Studenten Female");
        studentmale = new Button ("Aantal Studenten Male");
        studentmale.addActionListener( new KnopListener());
        add(tekstvak1);
        add(tekstvak2);
        add(tekstvak3);
        add(tekstvak4);
        add(studentfemale);
        add(studentmale);
        add(male);
        add(female);
    }


    public void paint(Graphics g) {
        g.drawString(s, 80,120);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak1.getText();
            s = tekstvak2.getText();
            s = tekstvak3.getText();
            s = tekstvak4.getText();
            repaint();

        }
    }
}
