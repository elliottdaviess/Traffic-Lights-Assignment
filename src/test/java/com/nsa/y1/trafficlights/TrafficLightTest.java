package com.nsa.y1.trafficlights;

/**
 * Created by c1632130 on 06/03/2017.
 */

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TrafficLightTest {
    private TrafficLight trafficlight1;


    @Before
    public void createTrafficLights() throws Exception {
        TrafficLight trafficlight1 = new TrafficLight(); //test default constructor
    }

    @Test
    public void defaultTrafficLightisRed() throws Exception {
        TrafficLight trafficlight1 = new TrafficLight();

        assertEquals(trafficlight1.getRedLightState(),true);
        assertEquals(trafficlight1.getAmberLightState(),false);
        assertEquals(trafficlight1.getGreenLightState(),false);
    }

    @Test
    public void RedtoRedAndAmber() throws Exception {
        TrafficLight trafficlight1 = new TrafficLight();
        trafficlight1.nextstep();

        assertEquals(trafficlight1.getRedLightState(),true);
        assertEquals(trafficlight1.getAmberLightState(),true);
        assertEquals(trafficlight1.getGreenLightState(),false);
    }

    @Test
    public void RedAndAmbertoGreen() throws Exception {
        TrafficLight trafficlight1 = new TrafficLight();
        trafficlight1.nextstep();
        trafficlight1.nextstep();

        assertEquals(trafficlight1.getRedLightState(),false);
        assertEquals(trafficlight1.getAmberLightState(),false);
        assertEquals(trafficlight1.getGreenLightState(),true);
    }

    @Test
    public void GreentoAmber() throws Exception {
        TrafficLight trafficlight1 = new TrafficLight();
        trafficlight1.nextstep();
        trafficlight1.nextstep();
        trafficlight1.nextstep();

        assertEquals(trafficlight1.getRedLightState(),false);
        assertEquals(trafficlight1.getAmberLightState(),true);
        assertEquals(trafficlight1.getGreenLightState(),false);
    }

    @Test
    public void AmbertoRed() throws Exception {
        TrafficLight trafficlight1 = new TrafficLight();
        trafficlight1.nextstep();
        trafficlight1.nextstep();
        trafficlight1.nextstep();
        trafficlight1.nextstep();

        assertEquals(trafficlight1.getRedLightState(),true);
        assertEquals(trafficlight1.getAmberLightState(),false);
        assertEquals(trafficlight1.getGreenLightState(),false);
    }


    @Test
    public void GoEndsOnGreen() throws Exception {
        TrafficLight trafficlight1 = new TrafficLight();
        trafficlight1.go();

        assertEquals(trafficlight1.getRedLightState(),false);
        assertEquals(trafficlight1.getAmberLightState(),false);
        assertEquals(trafficlight1.getGreenLightState(),true);
    }

    @Test
    public void StopEndsOnRed() throws Exception {
        TrafficLight trafficlight1 = new TrafficLight();
        trafficlight1.go();
        trafficlight1.stop();

        assertEquals(trafficlight1.getRedLightState(),true);
        assertEquals(trafficlight1.getAmberLightState(),false);
        assertEquals(trafficlight1.getGreenLightState(),false);
    }

}
