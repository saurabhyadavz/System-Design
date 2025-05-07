package org.example.lld.parkinglot.factory;

import org.example.lld.parkinglot.models.Car;
import org.example.lld.parkinglot.models.Vehicle;

public class CarFactory implements VehicleFactory {

    @Override
    public Vehicle createVehicle(String vehicleNumber) {
        return new Car(vehicleNumber);
    }
}
