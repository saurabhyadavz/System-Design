package org.example.statedesignpattern;

interface TrafficLightState {
    void next(TrafficLightContext context);
    String getColor();
}
