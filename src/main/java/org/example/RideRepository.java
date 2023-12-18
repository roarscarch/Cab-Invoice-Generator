package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RideRepository {
    private static final Map<Integer, List<Ride>> rideRepository = new HashMap<>();

    public static void addRide(int userId, Ride ride) {
        if (rideRepository.containsKey(userId)) {
            rideRepository.get(userId).add(ride);
        } else {
            List<Ride> newRidesList = new ArrayList<>();
            newRidesList.add(ride);
            rideRepository.put(userId, newRidesList);
        }
    }


    public static List<Ride> getAllRides(int userId) {
        return rideRepository.getOrDefault(userId, new ArrayList<>());// if userId present it will give that List ele it will give a new array list
    }
}
