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
            return new BerlinerSchinkenPizza();
        } else if (typ.equals("Krabben")){
            return new BerlinerKrabbenPizza();
        } else if (typ.equals("Thunfisch")){
            return new BerlinerThunfischPizza();
        } else return null;

    }
}
