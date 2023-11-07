package org.example;

public class MuenchenPizzeria extends Pizzeria{

    protected Pizza erstellePizza(String typ) {
        Pizza pizza = null;
        MuenchnerPizzaZutatenFabrik muenchnerZutaten = new MuenchnerPizzaZutatenFabrik();


        if(typ.equals("Salami")){
            pizza = new SalamiPizza(muenchnerZutaten);
            pizza.setName("Muenchner Salamipizza");
            return pizza;
        } else if (typ.equals("Schinken")){
            pizza = new SchinkenPizza(muenchnerZutaten);
            pizza.setName("Muenchner SchinkenPizza");
            return pizza;
        } else if (typ.equals("Krabben")){
            pizza = new KrabbenPizza(muenchnerZutaten);
            pizza.setName("Muenchner KrabbenPizza");
            return pizza;
        } else if (typ.equals("Thunfisch")){
            pizza = new ThunfischPizza(muenchnerZutaten);
            pizza.setName("Muenchner ThunfischPizza");
            return pizza;
        } else return null;

    }
}
