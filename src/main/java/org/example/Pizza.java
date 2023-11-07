package org.example;
import java.util.*;
public abstract class Pizza {
    String name;
    Teig teig;
    Sosse sosse;

    Salami salami;
    Gemuese gemuese[];
    Kaese kaese;
    Thunfisch thunfisch;
    Krabben krabben;




    public void vorbereiten(){
        System.out.println("Bereite " + name);
        System.out.println("Werfe Teig ...");
        System.out.println("Fuege Sosse hinzug ...");
        System.out.println("Fuege Beläge hinzu: ");


    }

    public void backen() {
        System.out.println("Backe 25 Minuten bei 350 Grad");
    }

     void schneiden() {
        System.out.println("Schneide die Pizza diagonal in Stuecke");
    }

    public void einpacken() {
        System.out.println("Packe die Pizza in die offizielle Pizzeria-Schachtel");
    }
    public String getName(){
        return name;
    }
}
