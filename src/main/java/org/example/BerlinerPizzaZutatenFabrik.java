package org.example;

public class BerlinerPizzaZutatenFabrik implements PizzaZutatenFabrik{

    public Teig erstelleTeig(){
        return new TeigMitDünnerKruste();
    }

    public Soße erstelleSoße(){
        return new MarinaraSoße();
    }

    public Kaese erstelleKaese(){
        return new Parmesan();
    }

    public Salami erstelleSalami(){
        return new SpanischeSalami();
    }

    public Gemuese[] erstelleGemuese(){
        Gemuese[] gemuese = { new Knoblauch(), new Zwiebeln(), new Pilze(), new Paprika() };
        return gemuese;
    }

    public Thunfisch erstelleThunfisch(){
        return new Thunfisch();
    }

    public Krabben erstelleKrabben(){
        return new FrischeKrabben();
    }
}



