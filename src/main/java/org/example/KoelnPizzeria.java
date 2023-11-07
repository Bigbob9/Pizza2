package org.example;

public class KoelnPizzeria extends Pizzeria{

    protected Pizza erstellePizza(String typ) {
        Pizza pizza = null;
        KoelnerPizzaZutatenFabrik koelnerZutaten = new KoelnerPizzaZutatenFabrik();


        if(typ.equals("Salami")){
            pizza = new SalamiPizza(koelnerZutaten);
            pizza.setName("Koelner Salamipizza");
            return pizza;
        } else if (typ.equals("Schinken")){
            pizza = new SchinkenPizza(koelnerZutaten);
            pizza.setName("Koelner SchinkenPizza");
            return pizza;
        } else if (typ.equals("Krabben")){
            pizza = new KrabbenPizza(koelnerZutaten);
            pizza.setName("Koelner KrabbenPizza");
            return pizza;
        } else if (typ.equals("Thunfisch")){
            pizza = new ThunfischPizza(koelnerZutaten);
            pizza.setName("Koelner ThunfischPizza");
            return pizza;
        } else return null;

    }
}
