package org.example.abstractfactorypattern.vehicle.factory;

import org.example.abstractfactorypattern.vehicle.Vehicle;
import org.example.abstractfactorypattern.vehicle.models.HondaVehicle;

public class HondaFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new HondaVehicle();
    }
}
