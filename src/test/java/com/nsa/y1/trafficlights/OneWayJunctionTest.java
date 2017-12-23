package com.nsa.y1.trafficlights;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by c1632130 on 07/03/2017.
 */

public class OneWayJunctionTest {
    private OneWayJunction testJunction;

    @Before
    public void createOneWayJunction() throws Exception {
        OneWayJunction junction1 = new OneWayJunction(); //test default constructor
    }

    @Test
    public void eastboundGoEndsOnGreen() throws Exception {
        OneWayJunction junction1 = new OneWayJunction();
        junction1.eastboundGo();
        assertEquals(junction1.getEastboundTraffic().getRedLightState(),false);
        assertEquals(junction1.getEastboundTraffic().getAmberLightState(),false);
        assertEquals(junction1.getEastboundTraffic().getGreenLightState(),true);
    }

    @Test
    public void westboundGoEndsOnGreen() throws Exception {
        OneWayJunction junction1 = new OneWayJunction();
        junction1.westboundGo();
        assertEquals(junction1.getWestboundTraffic().getRedLightState(),false);
        assertEquals(junction1.getWestboundTraffic().getAmberLightState(),false);
        assertEquals(junction1.getWestboundTraffic().getGreenLightState(),true);
    }
    //------------------------------------------------------------------------------------------------------------------
    @Test
    public void eastboundStopEndsOnRed() throws Exception {
        OneWayJunction junction1 = new OneWayJunction();
        junction1.eastboundGo();
        junction1.eastboundStop();
        assertEquals(junction1.getEastboundTraffic().getRedLightState(),true);
        assertEquals(junction1.getEastboundTraffic().getAmberLightState(),false);
        assertEquals(junction1.getEastboundTraffic().getGreenLightState(),false);
    }

    @Test
    public void westboundStopEndsOnRed() throws Exception {
        OneWayJunction junction1 = new OneWayJunction();
        junction1.westboundGo();
        junction1.westboundStop();
        assertEquals(junction1.getWestboundTraffic().getRedLightState(),true);
        assertEquals(junction1.getWestboundTraffic().getAmberLightState(),false);
        assertEquals(junction1.getWestboundTraffic().getGreenLightState(),false);
    }

    //------------------------------------------------------------------------------------------------------------------
    @Test
    public void westboundFlowEndsOnRed() throws Exception {
        OneWayJunction junction1 = new OneWayJunction();
        junction1.westboundFlow();
        assertEquals(junction1.getWestboundTraffic().getRedLightState(),true);
        assertEquals(junction1.getWestboundTraffic().getAmberLightState(),false);
        assertEquals(junction1.getWestboundTraffic().getGreenLightState(),false);
    }
    @Test
    public void eastboundFlowEndsOnRed() throws Exception {
        OneWayJunction junction1 = new OneWayJunction();
        junction1.eastboundFlow();
        assertEquals(junction1.getEastboundTraffic().getRedLightState(),true);
        assertEquals(junction1.getEastboundTraffic().getAmberLightState(),false);
        assertEquals(junction1.getEastboundTraffic().getGreenLightState(),false);
    }

    //------------------------------------------------------------------------------------------------------------------

    @Test
    public void westboundRedFollowingEastboundFlow() throws Exception { //should remain red until westboundFlow is executed
        OneWayJunction junction1 = new OneWayJunction();
        junction1.eastboundFlow();
        assertEquals(junction1.getWestboundTraffic().getRedLightState(),true);
        assertEquals(junction1.getWestboundTraffic().getAmberLightState(),false);
        assertEquals(junction1.getWestboundTraffic().getGreenLightState(),false);    }

    @Test
    public void eastboundRedFollowingWestboundFlow() throws Exception { //should remain red until eastboundFlow is executed
        OneWayJunction junction1 = new OneWayJunction();
        junction1.westboundFlow();
        assertEquals(junction1.getEastboundTraffic().getRedLightState(),true);
        assertEquals(junction1.getEastboundTraffic().getAmberLightState(),false);
        assertEquals(junction1.getEastboundTraffic().getGreenLightState(),false);
    }

    //------------------------------------------------------------------------------------------------------------------
    @Test
    public void executeJunctionEndsOnRed() throws Exception {
        OneWayJunction junction1 = new OneWayJunction();
        junction1.executeJunction();

        assertEquals(junction1.getWestboundTraffic().getRedLightState(),true);
        assertEquals(junction1.getWestboundTraffic().getAmberLightState(),false);
        assertEquals(junction1.getWestboundTraffic().getGreenLightState(),false);

        assertEquals(junction1.getEastboundTraffic().getRedLightState(),true);
        assertEquals(junction1.getEastboundTraffic().getAmberLightState(),false);
        assertEquals(junction1.getEastboundTraffic().getGreenLightState(),false);
    }

}
