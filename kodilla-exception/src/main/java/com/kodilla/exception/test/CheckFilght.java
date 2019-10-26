package com.kodilla.exception.test;
import java.util.HashMap;
import java.util.Map;
public class CheckFilght {
    Map<String, Boolean> mapFlight = new HashMap<>();
    public void findFlight(Flight flight) throws RouteNotFoundException {
        if (!mapFlight.containsKey(flight.getArrivalAirport())) {
            try {
                throw new RouteNotFoundException("Destination airport does not found");
            } catch (RouteNotFoundException e) {
                System.out.println("Information: "+e.getMessage());
            }
        } else {
            System.out.println("Information: destination airport found ");
        }
    }
    public void addFlight(String airport, boolean permit) {
            mapFlight.put(airport,permit);
            //System.out.println(mapFlight);
    }
}