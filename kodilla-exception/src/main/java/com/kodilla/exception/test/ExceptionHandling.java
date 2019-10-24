package com.kodilla.exception.test;
public class ExceptionHandling {
    public static void main(String[] args){
        SecondChallenge secondChallenge=new SecondChallenge();
        String ret = null;
        try {
           ret= secondChallenge.probablyIWillThrowException(1.8,1.0);
        } catch (Exception e){
            System.out.println("exception catched");
        }
        finally {
            System.out.println("Our result: "+ret);
        }
    }
}
