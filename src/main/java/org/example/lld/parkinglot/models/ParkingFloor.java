package org.example.lld.parkinglot.models;

import org.example.lld.parkinglot.models.enums.ParkingSpaceType;

import java.util.List;

public class ParkingFloor {
    private List<ParkingSpace> parkingSpaces;
    private final Integer floorNumber;

    public ParkingFloor(List<ParkingSpace> parkingSpaces, Integer floorNumber) {
        this.floorNumber = floorNumber;
        this.parkingSpaces = parkingSpaces;
    }

    public ParkingSpace getParkingSpace(ParkingSpaceType parkingSpaceType) {
        for (ParkingSpace parkingSpace : parkingSpaces) {
            if (!parkingSpace.getIsOccupied() && parkingSpace.getParkingSpaceType().equals(parkingSpaceType)) {
                return parkingSpace;
            }
        }
        return null;
    }

    public List<ParkingSpace> getParkingSpaces() {
        return this.parkingSpaces;
    }
}
