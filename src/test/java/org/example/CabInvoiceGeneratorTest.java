package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CabInvoiceGeneratorTest {
    @Test
    public void testCalculatorFare(){
        CabInvoiceGenerator invoiceGenerator= new CabInvoiceGenerator();
        double fare= invoiceGenerator.calculateFare(15,4);// dist and time
        assertEquals(154,fare); //150+4

    }


    @Test
    void multipleRides(){
        // multiple ride= arary of rides
        Ride[] rides= {new Ride(1.0,1.0), new Ride(2.0,2.0),new Ride(3.0,3.0)};// dist  time
        CabInvoiceGenerator invoiceGenerator= new CabInvoiceGenerator();
        double aggregateTotal= invoiceGenerator.calculateFare(rides);
        assertEquals(66,aggregateTotal);// 11+22+33

    }

}