package org.example;

public class MuenchenPizzeria extends Pizzeria{

    public Pizza erstellePizza(String typ) {
        Pizza pizza;
        if(typ.equals("Salami")){
            return new MuenchnerSalamiPizza();
        } else if (typ.equals("Schinken")){
            return new MuenchnerSchinkenPizza();
        } else if (typ.equals("Krabben")){
            return new MuenchnerKrabbenPizza();
        } else if (typ.equals("Thunfisch")){
            return new MuenchnerThunfischPizza();
        } else return null;

    }
}
