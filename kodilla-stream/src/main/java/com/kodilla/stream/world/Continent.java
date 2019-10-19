package com.kodilla.stream.world;
import java.util.ArrayList;
import java.util.List;
public final class Continent {
    List<Country> countryList = new ArrayList<>();
    public final List<Country> getCountryQuantity(){
        return  new ArrayList<>(countryList);
    }
    public void addCountry(Country country){
        countryList.add(country);
    }
}
