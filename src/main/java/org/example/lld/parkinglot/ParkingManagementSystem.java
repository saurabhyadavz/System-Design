package org.example.lld.parkinglot;

import org.example.lld.parkinglot.factory.ParkingStrategyFactory;
import org.example.lld.parkinglot.models.*;
import org.example.lld.parkinglot.strategy.ParkingStrategy;

import java.util.List;

public class ParkingManagementSystem {
    private final List<ParkingFloor> parkingFloors;
    private ParkingStrategyFactory parkingStrategyFactory;

    public ParkingManagementSystem(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
        this.parkingStrategyFactory = new ParkingStrategyFactory();
    }

    public ParkingTicket parkVehicle(Vehicle vehicle) throws Exception {
        ParkingStrategy parkingStrategy = parkingStrategyFactory.getParkingStrategy(vehicle.getVehicleType());

        ParkingSpace parkingSpace = parkingStrategy.getParkingSpace(parkingFloors, vehicle);
        if (parkingSpace == null) {
            throw new Exception("No Parking is available for vehicle type: " + vehicle.getVehicleType().name());
        }

        parkingSpace.parkVehicle(vehicle);

        return new ParkingTicket(vehicle, parkingSpace);
    }

    public PaymentReceipt unparkVehicle(ParkingTicket parkingTicket) {
        ParkingSpace parkingSpace = parkingTicket.getParkingSpace();

        parkingSpace.unparkVehicle();

        double parkingFee = calculateParkingFee();

        return new PaymentReceipt(parkingFee, parkingTicket);

    }

    private double calculateParkingFee() {
        return 0.0;
    }
}
