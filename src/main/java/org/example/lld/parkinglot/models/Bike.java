package org.example.lld.parkinglot.models;

import org.example.lld.parkinglot.models.enums.VehicleType;

public class Bike extends Vehicle {
    private final String bikeNumber;

    public Bike(String bikeNumber) {
        super(bikeNumber, VehicleType.BIKE);
        this.bikeNumber = bikeNumber;
    }
}
