package h08;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h08O02B extends Applet {
    TextField tekstvak, tekstvak2, tekstvak3, tekstvak4,tekstvak5;
    Button knop, knop2, knop3, knop4;
    Label label;
    int aantal,getalms, getalvs, getalv, getalm;


    public void init() {
        setSize(800,800);
        tekstvak = new TextField("",20);
        tekstvak2 = new TextField("",20);
        tekstvak3 = new TextField("",20);
        tekstvak4 = new TextField("",20);
        tekstvak5 = new TextField("",20);
        knop = new Button("OK");
        knop2 = new Button("OK");
        knop3 = new Button("OK");
        knop4 = new Button("OK");
        label = new Label();
        tekstvak.addActionListener( new TekstvakListener());
        tekstvak2.addActionListener( new TekstvakListener2());
        tekstvak3.addActionListener( new TekstvakListener3());
        tekstvak4.addActionListener( new TekstvakListener4());
        tekstvak5.addActionListener( new TekstvakListener5());
        knop.addActionListener( new KnopListener());
        knop2.addActionListener( new KnopListener2());
        knop3.addActionListener( new KnopListener3());
        knop4.addActionListener( new KnopListener4());
        add(tekstvak);
        add(tekstvak2);
        add(tekstvak3);
        add(tekstvak4);
        add(tekstvak5);
        add(knop);
        add(knop2);
        add(knop3);
        add(knop4);
        add(label);
        getalm = 0;
        getalms = 0;
        getalv = 0;
        getalvs = 0;




    }


    public void paint(Graphics g) {
        g.drawString("Het aantal is " + aantal, 160,100);
        g.drawString("Het aantal mannen is " + getalm, 160, 120);
        g.drawString("Het aantal vrouwen is " + getalv, 160, 140);
        g.drawString("Het aantal potentiële mannelijke studenten is " + getalms,160,160);
        g.drawString("Het aantal potentiële vrouwelijke studentenis " + getalvs, 160,180);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            String ms = tekstvak.getText();
            String v = tekstvak.getText();
            String vs = tekstvak.getText();
            aantal = Integer.parseInt(s);
            getalms = Integer.parseInt(ms);
            getalv = Integer.parseInt(v);
            getalvs = Integer.parseInt(vs);
            repaint();
        }
    }

    class TekstvakListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getalm= Integer.parseInt(s);
            repaint();

        }
    }

    class TekstvakListener3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getalms= Integer.parseInt(s);
            repaint();

        }
    }

    class TekstvakListener4 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getalv= Integer.parseInt(s);
            repaint();

        }
    }

    class TekstvakListener5 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getalvs= Integer.parseInt(s);
            repaint();

        }
    }

    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            String s = tekstvak.getText();
            getalvs = Integer.parseInt(s);
            repaint();
        }
    }

    class KnopListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getalm= Integer.parseInt(s);
            repaint();
        }
    }

    class KnopListener3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getalms= Integer.parseInt(s);
            repaint();
        }
    }

    class KnopListener4 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getalv= Integer.parseInt(s);
            repaint();
        }
    }
}
