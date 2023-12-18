package org.example;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CabInvoiceGeneratorTest {
    CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();

    @Test
    public void testCalculateFare() {
        double fare = cabInvoiceGenerator.calculateFare(15, 25);
        assertEquals(175, fare);
    }

    @Test
    public void testMinimumFare() {
        double fare = cabInvoiceGenerator.calculateFare(0, 0);
        assertEquals(5,fare);
    }

    @Test
    public void testMultipleRideFare() {
        Ride[] rides = { new Ride(1, 8, 1, CarType.STANDARD),
                new Ride(5, 10, 1, CarType.PREMIUM),
                new Ride(7, 12, 6, CarType.ROYAL) };


        double totalFare = cabInvoiceGenerator.calculateFare(rides);
        assertEquals(245.4, totalFare);
    }

    @Test
    public void testEnhancedInvoice() {
        Ride[] rides = { new Ride(1, 8, 1, CarType.STANDARD), // Updated values
                new Ride(5, 10, 2, CarType.PREMIUM), // Updated values
                new Ride(7, 12, 3, CarType.ROYAL) };
        EnhancedInvoice enhancedInvoice = cabInvoiceGenerator.generateInvoice(rides);
        assertEquals(3, enhancedInvoice.totalRides);
        assertEquals(245.4, enhancedInvoice.totalFare);
        assertEquals(81.8, enhancedInvoice.avgFare,0.001);
    }

    @Test
    public void testGenerateUserInvoice() {
        new Ride(1, 8, 1, CarType.STANDARD);
        new Ride(5, 10, 1, CarType.PREMIUM);
        new Ride(7, 12, 4, CarType.ROYAL);

        EnhancedInvoice enhancedInvoice = cabInvoiceGenerator.generateUserInvoice(1);
        assertEquals(2, enhancedInvoice.totalRides);
        assertEquals(89.4, enhancedInvoice.totalFare);
        assertEquals(44.7, enhancedInvoice.avgFare,0.0001);
    }

    @Test
    public void testRidesWithType() {
        Ride[] rides = { new Ride(1, 8, 1, CarType.STANDARD),
                new Ride(5, 10, 2, CarType.PREMIUM),
                new Ride(7, 12, 3, CarType.ROYAL) };
        EnhancedInvoice enhancedInvoice = cabInvoiceGenerator.generateInvoice(rides);
        assertEquals(3, enhancedInvoice.totalRides);
        assertEquals(245.4, enhancedInvoice.totalFare);
        assertEquals(81.8, enhancedInvoice.avgFare, 0.001);
    }
}
