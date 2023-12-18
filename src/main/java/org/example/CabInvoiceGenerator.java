package org.example;

public class CabInvoiceGenerator {
    public double calculateFare(double distance, double time) {
        double totalFare= 10*distance+time ;
        /*
        10 per km+ 1 per min
        min fare 5
         */

        return Math.max(totalFare,5);
    }

    public double calculateFare(Ride[] rides) {
        double totalFare=0;
        for(Ride ride: rides){
            totalFare+=this.calculateFare(ride.distance,ride.time);
        }

        return totalFare;
    }
}
