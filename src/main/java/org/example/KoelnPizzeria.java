package org.example;

public class KoelnPizzeria extends Pizzeria{

    public Pizza erstellePizza(String typ) {
        Pizza pizza;
        if(typ.equals("Salami")){
            return new KoelnerSalamiPizza();
        } else if (typ.equals("Schinken")){
            return new KoelnerSchinkenPizza();
        } else if (typ.equals("Krabben")){
            return new KoelnerKrabbenPizza();
        } else if (typ.equals("Thunfisch")){
            return new KoelnerThunfischPizza();
        } else return null;

    }
}
