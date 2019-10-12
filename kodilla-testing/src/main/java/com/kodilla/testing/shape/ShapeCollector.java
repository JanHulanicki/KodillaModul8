package com.kodilla.testing.shape;
import java.util.ArrayList;
public class ShapeCollector {
    private ArrayList<Shape> shapeAl = new ArrayList<Shape>();
    public void addFigure(Shape shape){
        shapeAl.add(shape);
    }
    public boolean removeFigure(Shape shape){
        return shapeAl.remove(shape);
    }
    public Shape getFigure(int n){
        return  shapeAl.get(n);
    }
    public ArrayList<Shape> showFigures(){
        Triangle fig3= new Triangle();
        //shapeAl.remove(2);
        return shapeAl;
    }
}
