package com.nsa.y1.trafficlights;

/**
 * Created by c1632130 on 09/03/2017.
 */

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TrafficLightWithLeftArrowTest {
    private TrafficLightWithLeftArrow trafficlight1;

    @Before
    public void createTrafficLights() throws Exception {
        TrafficLightWithLeftArrow trafficlight1 = new TrafficLightWithLeftArrow(); //test default constructor
    }

    @Test
    public void greenLeftArrowisOnAfterTurnLeftArrowOn() throws Exception {
        TrafficLightWithLeftArrow trafficlight1 = new TrafficLightWithLeftArrow(); //test default constructor
        trafficlight1.turnLeftArrowOn();
        assertEquals(trafficlight1.getRedLightState(),true);
        assertEquals(trafficlight1.getAmberLightState(),false);
        assertEquals(trafficlight1.getGreenLightState(),false);
        assertEquals(trafficlight1.getGreenLeftArrowState(),true);
    }

    @Test
    public void greenLeftArrowisOffAfterTurnLeftArrowOff() throws Exception {
        TrafficLightWithLeftArrow trafficlight1 = new TrafficLightWithLeftArrow(); //test default constructor
        trafficlight1.turnLeftArrowOff();

        assertEquals(trafficlight1.getRedLightState(),true);
        assertEquals(trafficlight1.getAmberLightState(),false);
        assertEquals(trafficlight1.getGreenLightState(),false);
        assertEquals(trafficlight1.getGreenLeftArrowState(),false);
    }

    @Test
    public void greenLightAndLeftArrowOnAfterLeftArrowGo() throws Exception {
        TrafficLightWithLeftArrow trafficlight1 = new TrafficLightWithLeftArrow(); //test default constructor
        trafficlight1.leftarrowGo();

        assertEquals(trafficlight1.getRedLightState(),false);
        assertEquals(trafficlight1.getAmberLightState(),false);
        assertEquals(trafficlight1.getGreenLightState(),true);
        assertEquals(trafficlight1.getGreenLeftArrowState(),true);
    }

    @Test
    public void LeftArrowOffAfterLeftArrowStop() throws Exception {
        TrafficLightWithLeftArrow trafficlight1 = new TrafficLightWithLeftArrow(); //test default constructor
        trafficlight1.leftarrowGo();
        trafficlight1.leftarrowStop();

        assertEquals(trafficlight1.getRedLightState(),true);
        assertEquals(trafficlight1.getAmberLightState(),false);
        assertEquals(trafficlight1.getGreenLightState(),false);
        assertEquals(trafficlight1.getGreenLeftArrowState(),false);
    }

    @Test
    public void LeftArrowOffAfterLeftArrowGOSTOP() throws Exception {
        TrafficLightWithLeftArrow trafficlight1 = new TrafficLightWithLeftArrow(); //test default constructor
        trafficlight1.leftarrowGoStop();

        assertEquals(trafficlight1.getRedLightState(),true);
        assertEquals(trafficlight1.getAmberLightState(),false);
        assertEquals(trafficlight1.getGreenLightState(),false);
        assertEquals(trafficlight1.getGreenLeftArrowState(),false);
    }


}
