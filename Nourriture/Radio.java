package Nourriture;


import java.util.ArrayList;
import java.util.Random;

public class Radio {
    private ArrayList<Radio> utili;

    public ArrayList<Radio> getUtili(){

        return utili;
    }

    public String getImg() {
        return img;
    }

    public String getTitre() {
        return titre;
    }

    public String getDuree() {
        return duree;
    }

    private String img;
    private String titre;
    private String duree;


    Random randomNum = new Random();

    public int getShowMe() {
        return showMe;
    }

    int showMe = 0 + randomNum.nextInt(99);



    public Radio(String titre, String img, String duree){
        this.img=img;
        this.duree=duree;
        this.titre=titre;
        utili = new ArrayList<>();
    }
}
