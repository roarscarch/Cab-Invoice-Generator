package org.example;

public class Ride {
    double time;
    double distance;
    CarType carType;
    int userId;
    public Ride(double distance, double time,  int userId ,  CarType carType){
        this.distance= distance;
        this.time= time;
        this.carType=carType;
        this.userId=userId;
        RideRepository.addRide(userId,this);
    }

}
