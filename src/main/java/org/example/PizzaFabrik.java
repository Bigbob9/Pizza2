package org.example;

public class PizzaFabrik {


    public Pizza erstellePizza(String typ) {
        Pizza pizza;
        if(typ.equals("Salami")){
            pizza = new SalamiPizza();
        } else if (typ.equals("Schinken")){
            pizza = new SchinkenPizza();
        } else {
            pizza = new MagaritaPizza();
        }
        return pizza;
    }
}
