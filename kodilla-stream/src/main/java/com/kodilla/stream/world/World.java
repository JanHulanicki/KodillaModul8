package com.kodilla.stream.world;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
public class World {
    public  List<Continent> getContinentQuantity(){
        List<Continent> continentsList = new ArrayList<>();
        Continent contintnt1 = new Continent();
        Continent contintnt2 = new Continent();
        Continent contintnt3 = new Continent();
        continentsList.add(contintnt1);
        continentsList.add(contintnt2);
        continentsList.add(contintnt3);
        return continentsList;
    }
    public final BigDecimal getPeopleQuantity(){
        BigDecimal peopleQuantity= getContinentQuantity().stream()
                .flatMap(country->country.getCountryQuantity().stream())
                .map(peopleQuantity1->peopleQuantity1.getPeopleQuantity())
                .reduce(BigDecimal.ZERO,(sum, current)-> (sum = sum.add(current)));
//        System.out.println("total value: "+ peopleQuantity);
        return peopleQuantity;
    }
}
