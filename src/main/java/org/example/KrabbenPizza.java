package org.example;

public class KrabbenPizza extends Pizza{

    PizzaZutatenFabrik zutatenFabrik;
    public KrabbenPizza(PizzaZutatenFabrik zutatenFabrik){
        this.zutatenFabrik = zutatenFabrik;
    }

    public void vorbereiten(){
        System.out.println("Mache " + name);
        teig = zutatenFabrik.erstelleTeig();
        sosse = zutatenFabrik.erstelleSosse();
        kaese = zutatenFabrik.erstelleKaese();
        krabben = zutatenFabrik.erstelleKrabben();



    }
}
