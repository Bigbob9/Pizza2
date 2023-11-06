package org.example;
import java.util.*;
public abstract class Pizza {
    String name;
    Teig teig;
    Soße soße;

    Salami salami;
    Gemuese gemuese[];
    Kaese kaese;
    Thunfisch thunfisch;
    Krabben krabben;




    public void vorbereiten(){
        System.out.println("Bereite " + name);
        System.out.println("Werfe Teig ...");
        System.out.println("Füge Soße hinzug ...");
        System.out.println("Füge Beläge hinzu: ");


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
