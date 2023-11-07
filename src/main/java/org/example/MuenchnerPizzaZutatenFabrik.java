package org.example;

public class MuenchnerPizzaZutatenFabrik implements PizzaZutatenFabrik{

    public Teig erstelleTeig(){
        return new TeigMitDickerKruste();
    }

    public Sosse erstelleSosse(){
        return new Tomatensosse();
    }

    public Kaese erstelleKaese(){
        return new Mozzarella();
    }

    public Salami erstelleSalami(){
        return new SpanischeSalami();
    }

    public Gemuese[] erstelleGemuese(){
        Gemuese[] gemuese = { new Aubergine(), new SchwarzeOliven(), new Spinat() };
        return gemuese;
    }

    public Thunfisch erstelleThunfisch(){
        return new ThunfischStuecke();
    }

    public Krabben erstelleKrabben(){
        return new GefrorendeKrabben();
    }
}



