package org.example;

public class EnhancedInvoice {
    int totalRides;
    double totalFare;
    double avgFare;

    public EnhancedInvoice(int totalRides , double totalFare ){
        this.totalRides=totalRides;
        this.totalFare=totalFare;
        this.avgFare= avgFare/totalRides;
    }
}
