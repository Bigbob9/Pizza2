package org.example;

public class SalamiPizza extends Pizza{

    PizzaZutatenFabrik zutatenFabrik;
    public SalamiPizza(PizzaZutatenFabrik zutatenFabrik){
        this.zutatenFabrik = zutatenFabrik;
    }

    public void vorbereiten(){
        name = getName();
        teig = zutatenFabrik.erstelleTeig();
        sosse = zutatenFabrik.erstelleSosse();
        kaese = zutatenFabrik.erstelleKaese();
        salami = zutatenFabrik.erstelleSalami();


        System.out.println("Salamipizza vorbereiten");
    }
}
