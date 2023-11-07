package org.example;

public class MuenchnerSalamiPizza extends Pizza {


    public MuenchnerSalamiPizza() {
        name = "Deftige Salamipizza im Muenchener Stil";

    }

    @Override
    void vorbereiten() {

    }

    void schneiden(){
        System.out.println("Schneide die Pizza in rechteckige Stuecke");
    }
}
