package org.example.statedesignpattern;

public class TrafficLightContext {

    private TrafficLightState currentState;

    public TrafficLightContext() {
        this.currentState = new RedState();
    }

    public void setState(TrafficLightState newState) {
        this.currentState = newState;
    }

    public void next() {
        currentState.next(this);
    }

    public String getColor() {
        return currentState.getColor();
    }


}
