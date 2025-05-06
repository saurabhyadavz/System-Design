package org.example.statedesignpattern;

public class GreenState implements TrafficLightState {
    private final String color;

    public GreenState() {
        this.color = "Green";
    }

    @Override
    public void next(TrafficLightContext context) {
        context.setState(new RedState());
    }

    @Override
    public String getColor() {
        return this.color;
    }
}
