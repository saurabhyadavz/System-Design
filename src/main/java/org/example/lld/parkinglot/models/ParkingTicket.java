package org.example.lld.parkinglot.models;

public class ParkingTicket {
    private Vehicle vehicle;
    private ParkingSpace parkingSpace;

    public ParkingTicket(Vehicle vehicle, ParkingSpace parkingSpace) {
        this.vehicle = vehicle;
        this.parkingSpace = parkingSpace;
    }

    public ParkingSpace getParkingSpace() {
        return this.parkingSpace;
    }
}
