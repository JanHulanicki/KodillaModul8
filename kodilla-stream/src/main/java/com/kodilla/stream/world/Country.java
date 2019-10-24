package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
<<<<<<< HEAD
    private BigDecimal peopleQuantity;
    private String countryName;
=======
   private   BigDecimal peopleQuantity;
   private String countryName;
>>>>>>> 1c3a32925b0eaaca5b856f6aaf831d57b13d36e5

    public Country(BigDecimal peopleQuantity, String countryName) {
        this.peopleQuantity = peopleQuantity;
        this.countryName = countryName;
    }

<<<<<<< HEAD
    public BigDecimal getPeopleQuantity() {
       // BigDecimal peopleQuantity = new BigDecimal("100000000");
        // BigDecimal peopleQuantity = new BigDecimal("100000000");
=======
    public BigDecimal getPeopleQuantity(){
       // BigDecimal peopleQuantity = new BigDecimal("100000000");
>>>>>>> 1c3a32925b0eaaca5b856f6aaf831d57b13d36e5
        //System.out.println(peopleQuantity);
        return peopleQuantity;
    }
}
