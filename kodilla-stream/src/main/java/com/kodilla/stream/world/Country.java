package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private BigDecimal peopleQuantity;
    private String countryName;


    public Country(BigDecimal peopleQuantity, String countryName) {
        this.peopleQuantity = peopleQuantity;
        this.countryName = countryName;
    }


    public BigDecimal getPeopleQuantity(){
       // BigDecimal peopleQuantity = new BigDecimal("100000000");

        //System.out.println(peopleQuantity);
        return peopleQuantity;
    }
}
