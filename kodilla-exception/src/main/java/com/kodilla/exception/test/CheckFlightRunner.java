package com.kodilla.exception.test;

public class CheckFlightRunner {
    public static void main(String[] args) throws RouteNotFoundException {
        Flight flight1= new Flight("departAirport1","arrivalAirPort1");
        Flight flight2= new Flight("departAirport2","arrivalAirPort2");
        CheckFilght checkFilght=new CheckFilght();
        checkFilght.addFlight(flight1.getArrivalAirport(),true);
        //System.out.println("lotnisko "+flight1.getArrivalAirport());
        checkFilght.findFlight(flight1);
        checkFilght.findFlight(flight2);
    }
}
