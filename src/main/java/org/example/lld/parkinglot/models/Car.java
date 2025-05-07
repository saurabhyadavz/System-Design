package org.example.lld.parkinglot.models;

import org.example.lld.parkinglot.models.enums.VehicleType;

public class Car extends Vehicle {
    public Car(String carNumber) {
        super(carNumber, VehicleType.CAR);
    }
}
