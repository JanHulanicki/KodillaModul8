package com.kodilla.exception.test;
import java.util.HashMap;
import java.util.Map;
public class CheckFilght {
    Map<String, Boolean> mapFlight = new HashMap<>();
    public void findFlight(Flight flight) throws RouteNotFoundException {
        try {
            if (!mapFlight.containsKey(flight.getArrivalAirport())) {
                throw new RouteNotFoundException("Destination airport does not found");
            }
            else System.out.println("Information: destination airport found ");

            } catch(RouteNotFoundException e){
                System.out.println("Information: " + e.getMessage());
            }
        }
    public void addFlight(String airport, boolean permit) {
            mapFlight.put(airport,permit);
            //System.out.println(mapFlight);
    }
}