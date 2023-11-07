package org.example;

public class ThunfischPizza extends Pizza{

    PizzaZutatenFabrik zutatenFabrik;
    public ThunfischPizza(PizzaZutatenFabrik zutatenFabrik){
        this.zutatenFabrik = zutatenFabrik;
    }

    public void vorbereiten(){
        System.out.println("Mache " + name);
        teig = zutatenFabrik.erstelleTeig();
        sosse = zutatenFabrik.erstelleSosse();
        kaese = zutatenFabrik.erstelleKaese();
        thunfisch = zutatenFabrik.erstelleThunfisch();



    }
}
