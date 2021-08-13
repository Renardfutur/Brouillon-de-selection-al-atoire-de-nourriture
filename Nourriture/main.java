package Nourriture;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;


public class main extends JFrame{
    JButton button;
    public static void main(String[] args) throws IOException {

        web web = new web("e", "e", "e",null,true);
        Radio rad = new Radio("azer", "azer", "azer");


        Document document = Jsoup.connect("https://www.marmiton.org/recettes/top-internautes-plat-principal.aspx")
                .timeout(6000).get();
        Elements body = document.select("recipe-results fix-inline-block");
        int nbr=0;

        for (Element row : document.select("div.recipe-card")) {
            web.titre = row.select(".recipe-card__title").text();
            System.out.println(web.titre);
             web.img = row.select(".recipe-card__picture img").attr("data-src");
            System.out.println(web.img);
            web.duree = row.select(".recipe-card__duration__value").text();
            System.out.println(web.duree);
            Radio radio = new Radio(web.titre, web.img, web.duree);
            rad.getUtili().add(radio);
            System.out.println("---------");


        }
        System.out.println(rad.getUtili());


        System.out.println(rad.getShowMe());

        System.out.println(rad.getUtili().get(rad.getShowMe()).getTitre());
        System.out.println(rad.getUtili().get(rad.getShowMe()).getDuree());
        System.out.println(rad.getUtili().get(rad.getShowMe()).getImg());

        String tit= rad.getUtili().get(rad.getShowMe()).getTitre();
        String dur= rad.getUtili().get(rad.getShowMe()).getDuree();

        TextArea text;
        main main;
        Radio radio;
        JFrame f;
        JLabel l;
        JButton button = new JButton();
        Border border = BorderFactory.createLineBorder(Color.black,5);
        button.setBounds(800,800,100,50);



        URL url = new URL(rad.getUtili().get(rad.getShowMe()).getImg());
        BufferedImage image = ImageIO.read(url);
        f= new JFrame("APP");
        l=new JLabel();
        l.setBackground(Color.pink);
        l.setOpaque(true);
        l.setBorder(border);
        l.setHorizontalAlignment(SwingConstants.CENTER);
        l.setVerticalAlignment(SwingConstants.CENTER);


        f.add(button);
        JPanel p = new JPanel();
        f.add(l);
        f.show();

        f.setSize(1000,1000);

        while(web.ajou==true){
            button.addActionListener(e -> rad.getShowMe());
            button.addActionListener(e -> l.setText(tit));
            button.addActionListener(e -> l.setIcon(new ImageIcon(image)));
            button.addActionListener(e -> l.setText(dur));

        }



        f.show();







    }



}
