package org.example;

public class SchinkenPizza extends Pizza{


    PizzaZutatenFabrik zutatenFabrik;
    public SchinkenPizza(PizzaZutatenFabrik zutatenFabrik){
        this.zutatenFabrik = zutatenFabrik;
    }

    public void vorbereiten(){
        System.out.println("Mache " + name);
        teig = zutatenFabrik.erstelleTeig();
        sosse = zutatenFabrik.erstelleSosse();
        kaese = zutatenFabrik.erstelleKaese();
        schinken = zutatenFabrik.erstelleSchinken();



    }
}
