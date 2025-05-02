package org.example.abstractfactorypattern;

import org.example.abstractfactorypattern.vehicle.Vehicle;
import org.example.abstractfactorypattern.vehicle.factory.BMWFactory;
import org.example.abstractfactorypattern.vehicle.factory.HondaFactory;
import org.example.abstractfactorypattern.vehicle.factory.VehicleFactory;

public class AbstractFactoryPatternDemo {
    public static void main(String [] args) {
        VehicleFactory hondaFactory = new HondaFactory();
        Vehicle hondaVehicle = hondaFactory.createVehicle();
        hondaVehicle.start();
        hondaVehicle.stop();

        VehicleFactory bmwFactory = new BMWFactory();
        Vehicle bmw = bmwFactory.createVehicle();
        bmw.start();
        bmw.stop();
    }
}
