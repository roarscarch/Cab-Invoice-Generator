package org.example;

import java.util.List;

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
        double totalFare = 0.0;
        for (Ride ride : rides) {
            double fare = ride.distance * ride.carType.pricePerKilometer + ride.time * ride.carType.pricePerMinute;
            totalFare += Math.max(fare, ride.carType.minimumFare);
        }
        return totalFare;
    }


    public EnhancedInvoice generateInvoice(Ride[] rides) {
        int numberOfRides = rides.length;
        double totalFare = calculateFare(rides);
        return new EnhancedInvoice(numberOfRides, totalFare);
    }

    public EnhancedInvoice generateUserInvoice(int userId) {
        List<Ride> ridesList = RideRepository.getAllRides(userId);
        Ride[] rides = ridesList.toArray(new Ride[0]);
        return generateInvoice(rides);
    }

}
