package com.nsa.y1.trafficlights;


public class Traffic {

    public static void main(String[] args) {
        TrafficLight trafficlight1 = new TrafficLight();

        System.out.println("RED");
        System.out.println(trafficlight1.toString());

        System.out.println("");
        System.out.println("=================================");
        System.out.println("");

        System.out.println("RED to RED+AMBER");
        trafficlight1.nextstep();
        System.out.println(trafficlight1.toString());

        System.out.println("");
        System.out.println("=================================");
        System.out.println("");

        System.out.println("RED+AMBER to Green");
        trafficlight1.nextstep();
        System.out.println(trafficlight1.toString());

        System.out.println("");
        System.out.println("=================================");
        System.out.println("");

        System.out.println("Green to Amber");
        trafficlight1.nextstep();
        System.out.println(trafficlight1.toString());

        System.out.println("");
        System.out.println("=================================");
        System.out.println("");

        System.out.println("Amber to Red");
        trafficlight1.nextstep();
        System.out.println(trafficlight1.toString());




    }
}
