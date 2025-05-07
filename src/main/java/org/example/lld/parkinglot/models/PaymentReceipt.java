package org.example.lld.parkinglot.models;

public class PaymentReceipt {
    private double parkingFee;
    private ParkingTicket parkingTicket;

    public PaymentReceipt(double parkingFee, ParkingTicket parkingTicket) {
        this.parkingFee = parkingFee;
        this.parkingTicket = parkingTicket;
    }
}
