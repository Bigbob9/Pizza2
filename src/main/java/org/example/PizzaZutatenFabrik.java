package org.example;

import org.example.zutaten.*;

public interface PizzaZutatenFabrik {

    public Teig erstelleTeig();

     Sosse erstelleSosse();
     Kaese erstelleKaese();
     Salami erstelleSalami();

     Gemuese[] erstelleGemuese();
     Thunfisch erstelleThunfisch();
     Krabben erstelleKrabben();

     Schinken erstelleSchinken();


}
