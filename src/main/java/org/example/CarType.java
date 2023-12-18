package org.example;

public enum CarType {
    STANDARD(8.0, 0.8, 4.0),
    PREMIUM(12.0, 1.5, 15.0),
    ROYAL(18.0, 2.5, 25.0);

    final double pricePerKilometer, pricePerMinute, minimumFare;

    CarType(double pricePerKm, double pricePerMin, double minFare) {
        pricePerKilometer = pricePerKm;
        pricePerMinute = pricePerMin;
        minimumFare = minFare;
    }
}
