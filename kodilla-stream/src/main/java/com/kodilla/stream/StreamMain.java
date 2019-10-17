package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;
public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");
        SaySomething saySomething = new SaySomething();
        saySomething.say();
        Processor processor = new Processor();
        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        processor.execute(executeSaySomething);
        Processor processor1 = new Processor();
        Executor codeToExecute = () -> System.out.println("This is an example text1.");
        processor1.execute(codeToExecute);
        processor.execute(() -> System.out.println("This is an example text2."));
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
        //zadanie 1.
        PoemBeautifier beautifier = new PoemBeautifier();
        beautifier.beautify("Ala ma kota", textToDecorate -> textToDecorate.toUpperCase());
        beautifier.beautify("Ala ma kota", textToDecorate -> new String(" ABC ") + textToDecorate + new String(" ABC"));
        beautifier.beautify("Ala ma kota", textToDecorate -> textToDecorate.toLowerCase());
        beautifier.beautify("Ala ma kota", textToDecorate -> textToDecorate.replace("Ala", "Tola") +
                " " + textToDecorate.replace("kota", "psa"));
        beautifier.beautify("Ala ma kota", textToDecorate -> textToDecorate.concat(" Ala nie ma psa"));
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}


