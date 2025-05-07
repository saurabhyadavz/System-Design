package org.example.lld.parkinglot.models;

import org.example.lld.parkinglot.models.enums.ParkingSpaceType;

public class ParkingSpace {
    private final ParkingSpaceType parkingSpaceType;
    private final String parkingNumber;
    private Vehicle vehicle;
    private boolean isOccupied;
    private int parkingFloor;


    public ParkingSpace(ParkingSpaceType parkingSpaceType, String parkingNumber, Vehicle vehicle, int parkingFloor) {
        this.parkingSpaceType = parkingSpaceType;
        this.parkingNumber = parkingNumber;
        this.vehicle = vehicle;
        this.isOccupied = false;
        this.parkingFloor = parkingFloor;
    }

    public int getParkingFloor() {
        return this.parkingFloor;
    }

    public void setIsOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
    }

    public boolean getIsOccupied() {
        return this.isOccupied;
    }

    public Vehicle getVehicle() {
        return this.vehicle;
    }

    public ParkingSpaceType getParkingSpaceType() {
        return this.parkingSpaceType;
    }

    public String getParkingNumber() {
        return this.parkingNumber;
    }

    public void parkVehicle(Vehicle vehicle){
        this.isOccupied = true;
        this.vehicle = vehicle;
    }

    public void unparkVehicle() {
        this.isOccupied = false;
        this.vehicle = null;
    }
}

