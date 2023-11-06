package org.example;



public class Testbestelllung{

    public static void main(String[] args){

       BerlinPizzeria bPizzeria = new BerlinPizzeria();
       MuenchenPizzeria mPizzeria = new MuenchenPizzeria();
       KoelnPizzeria kPizzeria = new KoelnPizzeria();
       bPizzeria.bestellePizza("Salami");
       mPizzeria.bestellePizza("Salami");
       kPizzeria.bestellePizza("Schinken");
    }
}