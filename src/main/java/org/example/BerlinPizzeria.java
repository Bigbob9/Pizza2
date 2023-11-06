package org.example;

public class BerlinPizzeria extends Pizzeria{

    public Pizza erstellePizza(String typ) {
        Pizza pizza;
        if(typ.equals("Salami")){
            return new BerlinerSalamiPizza();
        } else if (typ.equals("Schinken")){
            return new BerlinerSchinkenPizza();
        } else if (typ.equals("Krabben")){
            return new BerlinerKrabbenPizza();
        } else if (typ.equals("Thunfisch")){
            return new BerlinerThunfischPizza();
        } else return null;

    }
}
