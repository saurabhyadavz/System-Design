package org.example.lld.parkinglot.strategy;

import org.example.lld.parkinglot.models.ParkingFloor;
import org.example.lld.parkinglot.models.ParkingSpace;
import org.example.lld.parkinglot.models.Vehicle;
import org.example.lld.parkinglot.models.enums.ParkingSpaceType;

import java.util.List;

public class DefaultParkingStrategy implements ParkingStrategy {
    @Override
    public ParkingSpace getParkingSpace(List<ParkingFloor> parkingFloorList, Vehicle vehicle) {
        for (ParkingFloor parkingFloor : parkingFloorList) {
            for (ParkingSpace parkingSpace : parkingFloor.getParkingSpaces()) {
                if (!parkingSpace.getIsOccupied()) {
                    return parkingSpace;
                }
            }
        }
        return null;
    }
}
