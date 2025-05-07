package org.example.lld.parkinglot.factory;

import org.example.lld.parkinglot.models.Vehicle;

public interface VehicleFactory {
    Vehicle createVehicle(String vehicleNumber);
}
