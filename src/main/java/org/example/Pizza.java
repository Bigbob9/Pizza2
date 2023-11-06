package org.example;
import java.util.*;
public abstract class Pizza {
    String name;
    String teig;
    String soße;
    ArrayList beläge = new ArrayList();



    public void vorbereiten(){
        System.out.println("Bereite " + name);
        System.out.println("Werfe Teig ...");
        System.out.println("Füge Soße hinzug ...");
        System.out.println("Füge Beläge hinzu: ");
        for (int i = 0; i < beläge.size(); i++){
            System.out.println("  " + beläge.get(i));
        }
    }

    public void backen() {
        System.out.println("Backe 25 Minuten bei 350 Grad");
    }

     void schneiden() {
        System.out.println("Schneide die Pizza diagonal in Stücke");
    }

    public void einpacken() {
        System.out.println("Packe die Pizza in die offizielle Pizzeria-Schachtel");
    }
    public String getName(){
        return name;
    }
}
