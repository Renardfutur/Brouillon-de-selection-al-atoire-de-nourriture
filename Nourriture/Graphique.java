/**package Nourriture;

import java.util.Random;
import javax.swing.*;
import java.awt.*;
import Nourriture.Radio;

public class Graphique extends JFrame {
    private TextArea text;
    private main main;
    private Radio radio;
    static JFrame f;
    static JLabel l;


    public void Fen(){

        System.out.println("niiiiiiiiggggggaaaaaaaaaaa");

        System.out.println(radio);
        System.out.println(radio.getUtili().get(radio.showMe).getTitre());
        System.out.println(radio.getUtili().get(radio.showMe).getDuree());
        System.out.println(radio.getUtili().get(radio.showMe).getImg());

        f= new JFrame("label");
        l=new JLabel();
        l.setText(radio.getUtili().get(radio.showMe).getTitre());
        JPanel p = new JPanel();
        p.add(l);
        f.add(f);
        f.add(p);
    f.setSize(300,300);
    f.show();
    }

}**/
