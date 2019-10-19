package com.kodilla.stream.world;
import java.util.ArrayList;
import java.util.List;
public final class Continent {
    public final List<Country> getCountryQuantity(){
        List<Country> countryList = new ArrayList<>();
        Country country1=new Country();
        Country country2=new Country();
        Country country3=new Country();
        Country country4=new Country();
        Country country5=new Country();
        Country country6=new Country();
        countryList.add(country1);
        countryList.add(country2);
        countryList.add(country3);
        countryList.add(country4);
        countryList.add(country5);
        countryList.add(country6);
        return countryList;
    }
}
