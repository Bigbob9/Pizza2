package org.example;

public class MuenchnerSalamiPizza extends Pizza {


    public MuenchnerSalamiPizza() {
        name = "Deftige Salamipizza im Münchener Stil";
        teig = "Teig mit extra dicker Kruste";
        soße = "Tomatensoße";

        beläge.add("Mozarella");

    }
    void schneiden(){
        System.out.println("Schneide die Pizza in rechteckige Stücke");
    }
}
