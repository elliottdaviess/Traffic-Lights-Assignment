package com.nsa.y1.trafficlights;

/**
 * Created by c1632130 on 09/03/2017.
 */
public class TrafficLightWithLeftArrow extends TrafficLight {
    private Light greenLeftArrow;


    public TrafficLightWithLeftArrow() {
        greenLeftArrow = new Light(Shape.LEFT_ARROW, Colour.GREEN);
        greenLeftArrow.turnOff(); //off by default

    }

    public void turnLeftArrowOn(){ //public method
        greenLeftArrow.turnOn();
    }

    public void turnLeftArrowOff(){
        greenLeftArrow.turnOff();
    }

    public void leftarrowGo(){
        go();
        greenLeftArrow.turnOn();
    }

    public void leftarrowStop(){
        greenLeftArrow.turnOff();
        stop();
    }

    public void leftarrowGoStop(){
        leftarrowGo();
        leftarrowStop();
    }

    public boolean getGreenLeftArrowState(){
        return greenLeftArrow.isOn();
    }

   // public void
}
