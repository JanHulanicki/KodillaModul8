package com.kodilla.stream.world;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
public class World {
    private final List<Continent> continentsList = new ArrayList<>();
    public  List<Continent> getContinentQuantity(){
        return new  ArrayList<>(continentsList);
    }
    public void addContinent(Continent continent){
        continentsList.add(continent);
    }
    public final BigDecimal getPeopleQuantity(){
        BigDecimal peopleQuantity= getContinentQuantity().stream()
                .flatMap(country->country.getCountryQuantity().stream())
                .map(peopleQuantity1->peopleQuantity1.getPeopleQuantity())
                .reduce(BigDecimal.ZERO,(sum, current)-> (sum = sum.add(current)));
       System.out.println("total value: "+ peopleQuantity);
       return peopleQuantity;
    }
}
