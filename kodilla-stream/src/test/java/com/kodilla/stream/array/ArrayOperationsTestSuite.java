package com.kodilla.stream.array;
import org.junit.Assert;
import org.junit.Test;
public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] intArray = new int[] {1,2,3,4,5};
        //When
        double averageResult=ArrayOperations.getAverage(intArray);
        //System.out.println("result"+averageResult);
        //Then
        double expestedAverage=3;
        Assert.assertEquals(expestedAverage, averageResult,0.0);
    }
}
