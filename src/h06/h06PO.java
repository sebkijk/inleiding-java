package h06;

import java.applet.Applet;
import java.awt.*;

public class h06PO extends Applet {
    double cijfer1, cijfer2, cijfer3, deelsom, vermenigvuldiging, keersom,gemiddelde, deelsom2;
    int naarint;
    double naardouble, uitkomst;

    public void init() {
       cijfer1 = 5.9;
       cijfer2 = 6.3;
       cijfer3 = 6.9;
       deelsom = 3;
       gemiddelde =  (cijfer1 + cijfer2 + cijfer3) / deelsom;
       vermenigvuldiging = 10;
       keersom = gemiddelde * vermenigvuldiging;
       naarint = (int) keersom;
       naardouble = naarint;
       deelsom2 = 10;
       uitkomst = naardouble / deelsom2;


    }


    public void paint(Graphics g) {
        setSize(500,500);
        g.drawString("Het Gemiddelde is: " + uitkomst, 50,50);
    }
}
