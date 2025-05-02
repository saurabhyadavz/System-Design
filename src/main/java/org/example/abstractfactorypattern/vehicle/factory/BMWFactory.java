package org.example.abstractfactorypattern.vehicle.factory;

import org.example.abstractfactorypattern.vehicle.Vehicle;
import org.example.abstractfactorypattern.vehicle.models.BMWVehicle;

public class BMWFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new BMWVehicle();
    }
}
