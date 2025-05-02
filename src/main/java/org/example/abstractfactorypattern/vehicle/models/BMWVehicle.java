package org.example.abstractfactorypattern.vehicle.models;

import org.example.abstractfactorypattern.vehicle.Vehicle;

public class BMWVehicle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Starting BMW Vehicle");
    }

    @Override
    public void stop() {
        System.out.println("Stopping BMW Vehicle");
    }
}
