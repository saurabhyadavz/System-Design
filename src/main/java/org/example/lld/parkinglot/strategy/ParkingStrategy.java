package org.example.lld.parkinglot.strategy;

import org.example.lld.parkinglot.models.ParkingFloor;
import org.example.lld.parkinglot.models.ParkingSpace;
import org.example.lld.parkinglot.models.Vehicle;

import java.util.List;

public interface ParkingStrategy {
    ParkingSpace getParkingSpace(List<ParkingFloor> parkingFloorList, Vehicle vehicle);
}
