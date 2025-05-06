package org.example.statedesignpattern;

public class RedState implements TrafficLightState {
    private final String color;

    public RedState() {
        this.color = "RED";
    }

    @Override
    public void next(TrafficLightContext context) {
        context.setState(new YellowState());
    }

    @Override
    public String getColor() {
        return this.color;
    }
}
