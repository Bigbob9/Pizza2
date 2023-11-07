package org.example;

import org.example.zutaten.*;

public abstract class Pizza {
    String name;
    Teig teig;
    Sosse sosse;

    Schinken schinken;
    Salami salami;
    Gemuese gemuese[];
    Kaese kaese;
    Thunfisch thunfisch;
    Krabben krabben;




    abstract void vorbereiten();
    void backen() {
        System.out.println("Backe 25 Minuten bei 350 Grad");
    }

     void schneiden() {
        System.out.println("Schneide die Pizza diagonal in Stuecke");
    }

    void verpacken() {
        System.out.println("Packe die Pizza in die offizielle Pizzeria-Schachtel");
    }

    public String getName(){
        return name;
    }

    void setName(String name){
        this.name = name;
    }

    public String toString(){
        // hier kommt der Code zum Ausgeben der Pizzas ein
        return "Hallo";
    }
}
