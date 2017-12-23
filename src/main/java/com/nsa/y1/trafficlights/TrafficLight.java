package com.nsa.y1.trafficlights;

/**
 * Created by c1632130 on 02/03/2017.
 */
public class TrafficLight {
    public Light redlight;  //public because the class is being extended.
    public Light amberlight;
    public Light greenlight;

    public TrafficLight(){
        redlight = new Light(Shape.CIRCLE, Colour.RED);
        amberlight = new Light(Shape.CIRCLE, Colour.AMBER);
        greenlight = new Light(Shape.CIRCLE, Colour.GREEN);

        redlight.turnOn(); //AUTO ON FOR RED LIGHT
    }

    private void runSequence(){
        if(redlight.isOn() && amberlight.isOn()){ // red&amber to green
            redlight.turnOff();
            amberlight.turnOff();
            greenlight.turnOn();
        }
        else if(redlight.isOn()){ //red to red&amber
            amberlight.turnOn();
        }
        else if(greenlight.isOn()){ //green to amber
            greenlight.turnOff();
            amberlight.turnOn();
        }
        else if(!redlight.isOn() && amberlight.isOn()){ //from amber to red
            amberlight.turnOff();
            redlight.turnOn();
        }
    }

    public void go(){ //public method
        runSequence();
        runSequence();
    }

    public void stop(){
        runSequence();
        runSequence();
    }


    public void nextstep(){
        runSequence();
    }

    public boolean getRedLightState(){
        return redlight.isOn();
    }

    public boolean getAmberLightState(){
        return amberlight.isOn();
    }

    public boolean getGreenLightState(){
        return greenlight.isOn();
    }

    @Override
    public String toString() {
        return "TrafficLight{" +
                " REDLIGHT = " + redlight +
                ", AMBERLIGHT = " + amberlight +
                ", GREENLIGHT = " + greenlight +
                '}';
    }
}
