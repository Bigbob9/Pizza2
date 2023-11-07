package org.example;

public class BerlinPizzeria extends Pizzeria{

    protected Pizza erstellePizza(String typ) {
        Pizza pizza = null;
        BerlinerPizzaZutatenFabrik berlinerZutaten = new BerlinerPizzaZutatenFabrik();


        if(typ.equals("Salami")){
            pizza = new SalamiPizza(berlinerZutaten);
            pizza.setName("Berliner Salamipizza");
            return pizza;
        } else if (typ.equals("Schinken")){
            pizza = new SchinkenPizza(berlinerZutaten);
            pizza.setName("Berliner SchinkenPizza");
            return pizza;
        } else if (typ.equals("Krabben")){
            pizza = new KrabbenPizza(berlinerZutaten);
            pizza.setName("Berliner KrabbenPizza");
            return pizza;
        } else if (typ.equals("Thunfisch")){
            pizza = new ThunfischPizza(berlinerZutaten);
            pizza.setName("Berliner ThunfischPizza");
            return pizza;
        } else return null;

    }
}
