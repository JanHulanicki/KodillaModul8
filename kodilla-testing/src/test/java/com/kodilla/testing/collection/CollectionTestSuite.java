package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;
public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> numbers = new ArrayList<Integer>(0);
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
     ArrayList<Integer> result = oddNumbersExterminator.exterminate(numbers);
    System.out.println("Testing " + result);
        //Then
        Assert.assertEquals(numbers , result);
    }
   @Test
    public void testOddNumbersExterminatorNormalList(){
  // Given
       ArrayList<Integer> numbers = new ArrayList<Integer>();
       ArrayList<Integer> numbersExpected = new ArrayList<Integer>();
       numbers.add(1);
       numbers.add(2);
       numbers.add(3);
       numbers.add(4);
       numbers.add(5);
       numbers.add(6);
       numbers.add(7);
       numbers.add(8);
       numbers.add(9);
       numbers.add(10);
       numbersExpected.add(2);
       numbersExpected.add(4);
       numbersExpected.add(6);
       numbersExpected.add(8);
       numbersExpected.add(10);
       OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
  // When
       ArrayList<Integer> result = oddNumbersExterminator.exterminate(numbers);
       System.out.println("Testing results" + result);
  // Then
       Assert.assertEquals( numbersExpected, result);
   }
}




