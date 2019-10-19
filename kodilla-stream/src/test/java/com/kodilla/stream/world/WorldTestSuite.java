package com.kodilla.stream.world;
import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;
public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world=new World();
        //When
        BigDecimal totalPeople=world.getPeopleQuantity();
        //Then
        BigDecimal expectedPeople = new BigDecimal("1800000000");
        Assert.assertEquals(expectedPeople, totalPeople);
    }
}
