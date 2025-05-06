package org.example.statedesignpattern;

public class YellowState implements TrafficLightState {
    private final String color;

    public YellowState() {
        this.color = "Yellow";
    }

    @Override
    public void next(TrafficLightContext context) {
        context.setState(new GreenState());
    }

    @Override
    public String getColor() {
        return this.color;
    }
}
