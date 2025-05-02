package org.example.abstractfactorypattern.vehicle.models;

import org.example.abstractfactorypattern.vehicle.Vehicle;

public class HondaVehicle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Starting Honda Vehicle");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Honda Vehicle");
    }
}
