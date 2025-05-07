package org.example.lld.parkinglot.factory;

import org.example.lld.parkinglot.models.enums.VehicleType;
import org.example.lld.parkinglot.strategy.DefaultParkingStrategy;
import org.example.lld.parkinglot.strategy.HeavyVehicleParkingStrategy;
import org.example.lld.parkinglot.strategy.ParkingStrategy;

public class ParkingStrategyFactory {
    private final ParkingStrategy defaultStrategy;
    private final ParkingStrategy heavyVehicleStrategy;

    public ParkingStrategyFactory() {
        this.defaultStrategy = new DefaultParkingStrategy();
        this.heavyVehicleStrategy = new HeavyVehicleParkingStrategy();
    }

    public ParkingStrategy getParkingStrategy(VehicleType vehicleType) {
        switch (vehicleType) {
            case TRUCK:
            case CAR:
                return heavyVehicleStrategy;
            default:
                return defaultStrategy;
        }
    }
}
