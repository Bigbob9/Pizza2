package org.example;

import org.example.zutaten.*;

public class KoelnerPizzaZutatenFabrik implements PizzaZutatenFabrik{

    public Teig erstelleTeig(){
        return new TeigMitDuennerKruste();
    }

    public Sosse erstelleSosse(){
        return new MarinaraSosse();
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


    public Schinken erstelleSchinken() {
        return new Schinken();
    }
}




