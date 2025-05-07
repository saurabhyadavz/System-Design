package org.example.lld.parkinglot.models;

import org.example.lld.parkinglot.models.enums.VehicleType;

public class Vehicle {
    private String vehicleNumber;
    private VehicleType vehicleType;

    public Vehicle(String vehicleNumber, VehicleType vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return this.vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return this.vehicleType;
    }
}
