package org.example.lld.parkinglot.factory;

import org.example.lld.parkinglot.models.Bike;
import org.example.lld.parkinglot.models.Vehicle;

public class BikeFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle(String vehicleNumber) {
        return new Bike(vehicleNumber);
    }
}
