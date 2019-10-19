package com.kodilla.stream.world;
import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;
public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world=new World();
        Country country1=new Country();
        Country country2=new Country();
        Country country3=new Country();
        Continent continent1=new Continent();
        Continent continent2=new Continent();
        Continent continent3=new Continent();
        continent1.addCountry(country1);
        continent1.addCountry(country2);
        continent1.addCountry(country3);
        continent2.addCountry(country1);
        continent2.addCountry(country2);
        continent2.addCountry(country3);
        continent3.addCountry(country1);
        continent3.addCountry(country2);
        continent3.addCountry(country3);
        world.addContinent(continent1);
        world.addContinent(continent2);
        world.addContinent(continent3);
        //When
        BigDecimal totalPeople=world.getPeopleQuantity();
        //Then
        BigDecimal expectedPeople = new BigDecimal("900000000");
        Assert.assertEquals(expectedPeople, totalPeople);
    }
}
