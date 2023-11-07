package org.example;

public abstract class Pizzeria {




public Pizza bestellePizza(String typ) {
    Pizza pizza = erstellePizza(typ);

    pizza.vorbereiten();
    pizza.backen();
    pizza.schneiden();
    pizza.verpacken();
    return pizza;
}

abstract Pizza erstellePizza(String typ);


}


