package com.kodilla.testing.shape;
import org.junit.*;
import java.util.ArrayList;
    public class ShapeCollectorTestSuite {
        private static int testCounter = 0;
        @BeforeClass
        public static void beforeAllTests() {
            System.out.println("This is the beginning of tests.");
        }
        @AfterClass
        public static void afterAllTests() {
            System.out.println("All tests are finished.");
        }
        @Before
        public void beforeEveryTest() {
            testCounter++;
            System.out.println("Preparing to execute test #" + testCounter);
        }
        //test1 sprawdzający, czy figura pobrana z klasy  jest taka sama, jak figura, który była wstawiana do klasy.
        @Test
        public void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle fig1=new Circle();
            //When
            shapeCollector.addFigure(fig1);
            //Then
            Assert.assertEquals(fig1, shapeCollector.getFigure(0));
        }
        //test2 sprawdzający, czy próba usunięcia nieistniejącej figury skończy się zwróceniem wyniku false.
       @Test
        public void testRemoveNoneFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle fig1=new Circle();
            //When
            //  shapeCollector.addFigure(fig1);
            boolean result = shapeCollector.removeFigure(fig1);
            //Then
            Assert.assertFalse(result);
        }
        //test3 weryfikujący, czy udało się usunąć  figure z listy.
        @Test
        public void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle fig1=new Circle();
            //When
            shapeCollector.addFigure(fig1);
            boolean result = shapeCollector.removeFigure(fig1);
            //Then
            Assert.assertTrue(result);
        }
        //test4 weryfikujący, czy udało się pokazac  figure z listy.
        @Test
        public void testShowSFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            ArrayList<Shape> shapes = new ArrayList<Shape>();
            Circle fig1 = new Circle();
            Square fig2 = new  Square();
           // Triangle fig3= new Triangle();
            //When
            shapeCollector.addFigure(fig1);
            shapeCollector.addFigure(fig2);
         //   shapeCollector.addFigure(fig3);
            shapes.add(fig1);
            shapes.add(fig2);
           // shapes.add(fig3);
            //Then
            Assert.assertEquals(shapes, shapeCollector.showFigures());
        }
    }




