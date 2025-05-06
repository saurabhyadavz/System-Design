package org.example.statedesignpattern;

public class StateDesignPatternDemo {
    public static void main(String[] args) {
        TrafficLightContext trafficLight = new TrafficLightContext();
        System.out.println(trafficLight.getColor());
        trafficLight.next();
        System.out.println(trafficLight.getColor());
        trafficLight.next();
        System.out.println(trafficLight.getColor());
        trafficLight.next();
        System.out.println(trafficLight.getColor());
    }
}
