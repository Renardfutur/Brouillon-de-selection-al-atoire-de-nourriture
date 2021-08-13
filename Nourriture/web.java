package Nourriture;

import org.w3c.dom.Document;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class web {
    public String titre;
    public String img;
    public String duree;
    public ArrayList liste;
    public boolean ajou;

    public boolean isAjou() { return ajou; }

    public String getIma() {
        return titre;
    }

    public String getDec() { return duree; }

    public String getImg() {
        return img;
    }


    public web(String meh,String meh1,String meh2,ArrayList lis,boolean ajou) {
        this.titre=titre;
        this.img=img;
        this.duree=duree;
        this.liste= lis;
        this.ajou=ajou;
    }
}
