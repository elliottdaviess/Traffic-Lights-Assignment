package com.nsa.y1.trafficlights;

/**
 * Created by c1632130 on 08/03/2017.
 */
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class TwoWayJunctionTest {
    private TwoWayJunction testTwoWayJunction;

    //------------------------------------------------------------------------------------------------------------------
    @Before
    public void createTwoWayJunction() throws Exception {
        TwoWayJunction junction2 = new TwoWayJunction(); //test default constructor
    }

    //------------------------------------------------------------------------------------------------------------------

    @Test
    public void eastboundGoEndsOnGreen() throws Exception {
        TwoWayJunction junction1 = new TwoWayJunction();
        junction1.eastboundGo();
        assertEquals(junction1.getEastboundTraffic().getRedLightState(),false);
        assertEquals(junction1.getEastboundTraffic().getAmberLightState(),false);
        assertEquals(junction1.getEastboundTraffic().getGreenLightState(),true);
    }

    @Test
    public void westboundGoEndsOnGreen() throws Exception {
        TwoWayJunction junction1 = new TwoWayJunction();
        junction1.westboundGo();
        assertEquals(junction1.getWestboundTraffic().getRedLightState(),false);
        assertEquals(junction1.getWestboundTraffic().getAmberLightState(),false);
        assertEquals(junction1.getWestboundTraffic().getGreenLightState(),true);
    }

    @Test
    public void southboundGoEndsOnGreen() throws Exception {
        TwoWayJunction junction1 = new TwoWayJunction();
        junction1.southboundGo();
        assertEquals(junction1.getSouthboundTraffic().getRedLightState(),false);
        assertEquals(junction1.getSouthboundTraffic().getAmberLightState(),false);
        assertEquals(junction1.getSouthboundTraffic().getGreenLightState(),true);
    }

    @Test
    public void northboundGoEndsOnGreen() throws Exception {
        TwoWayJunction junction1 = new TwoWayJunction();
        junction1.northboundGo();
        assertEquals(junction1.getNorthboundTraffic().getRedLightState(),false);
        assertEquals(junction1.getNorthboundTraffic().getAmberLightState(),false);
        assertEquals(junction1.getNorthboundTraffic().getGreenLightState(),true);
    }

    //------------------------------------------------------------------------------------------------------------------

    @Test
    public void eastboundStopEndsOnRed() throws Exception {
        TwoWayJunction junction1 = new TwoWayJunction();
        junction1.eastboundGo();
        junction1.eastboundStop();
        assertEquals(junction1.getEastboundTraffic().getRedLightState(),true);
        assertEquals(junction1.getEastboundTraffic().getAmberLightState(),false);
        assertEquals(junction1.getEastboundTraffic().getGreenLightState(),false);
    }

    @Test
    public void westboundStopEndsOnRed() throws Exception {
        TwoWayJunction junction1 = new TwoWayJunction();
        junction1.westboundGo();
        junction1.westboundStop();
        assertEquals(junction1.getWestboundTraffic().getRedLightState(),true);
        assertEquals(junction1.getWestboundTraffic().getAmberLightState(),false);
        assertEquals(junction1.getWestboundTraffic().getGreenLightState(),false);
    }

    @Test
    public void southboundStopEndsOnRed() throws Exception {
        TwoWayJunction junction1 = new TwoWayJunction();
        junction1.southboundGo();
        junction1.southboundStop();
        assertEquals(junction1.getSouthboundTraffic().getRedLightState(),true);
        assertEquals(junction1.getSouthboundTraffic().getAmberLightState(),false);
        assertEquals(junction1.getSouthboundTraffic().getGreenLightState(),false);
    }

    @Test
    public void northboundStopEndsOnRed() throws Exception {
        TwoWayJunction junction1 = new TwoWayJunction();
        junction1.northboundGo();
        junction1.northboundStop();
        assertEquals(junction1.getNorthboundTraffic().getRedLightState(),true);
        assertEquals(junction1.getNorthboundTraffic().getAmberLightState(),false);
        assertEquals(junction1.getNorthboundTraffic().getGreenLightState(),false);
    }

    //------------------------------------------------------------------------------------------------------------------

    @Test
    public void eastWestFlowEndsOnRed() throws Exception {
        TwoWayJunction junction1 = new TwoWayJunction();
        junction1.westEastFlow();
        assertEquals(junction1.getEastboundTraffic().getRedLightState(),true);
        assertEquals(junction1.getEastboundTraffic().getAmberLightState(),false);
        assertEquals(junction1.getEastboundTraffic().getGreenLightState(),false);

        assertEquals(junction1.getWestboundTraffic().getRedLightState(),true);
        assertEquals(junction1.getWestboundTraffic().getAmberLightState(),false);
        assertEquals(junction1.getWestboundTraffic().getGreenLightState(),false);
    }

    @Test
    public void northSouthFlowEndsOnRed() throws Exception {
        TwoWayJunction junction1 = new TwoWayJunction();
        junction1.northSouthFlow();
        assertEquals(junction1.getNorthboundTraffic().getRedLightState(),true);
        assertEquals(junction1.getNorthboundTraffic().getAmberLightState(),false);
        assertEquals(junction1.getNorthboundTraffic().getGreenLightState(),false);

        assertEquals(junction1.getSouthboundTraffic().getRedLightState(),true);
        assertEquals(junction1.getSouthboundTraffic().getAmberLightState(),false);
        assertEquals(junction1.getSouthboundTraffic().getGreenLightState(),false);
    }

    //------------------------------------------------------------------------------------------------------------------

    //testing the state of the lights not in use during the two flows

    @Test
    public void otherLightsStateDuringEastWestFlow() throws Exception {
        TwoWayJunction junction1 = new TwoWayJunction();
        junction1.westEastFlow();
        assertEquals(junction1.getNorthboundTraffic().getRedLightState(),true);
        assertEquals(junction1.getNorthboundTraffic().getAmberLightState(),false);
        assertEquals(junction1.getNorthboundTraffic().getGreenLightState(),false);

        assertEquals(junction1.getSouthboundTraffic().getRedLightState(),true);
        assertEquals(junction1.getSouthboundTraffic().getAmberLightState(),false);
        assertEquals(junction1.getSouthboundTraffic().getGreenLightState(),false);
    }

    @Test
    public void otherLightsStateDuringNorthSouthFlow() throws Exception {
        TwoWayJunction junction1 = new TwoWayJunction();
        junction1.westEastFlow();
        assertEquals(junction1.getWestboundTraffic().getRedLightState(),true);
        assertEquals(junction1.getWestboundTraffic().getAmberLightState(),false);
        assertEquals(junction1.getWestboundTraffic().getGreenLightState(),false);
        assertEquals(junction1.getEastboundTraffic().getRedLightState(),true);
        assertEquals(junction1.getWestboundTraffic().getAmberLightState(),false);
        assertEquals(junction1.getWestboundTraffic().getGreenLightState(),false);
    }

    //------------------------------------------------------------------------------------------------------------------

    @Test
    public void executeTwoWayJunctionEndsOnRed() throws Exception {
        TwoWayJunction junction1 = new TwoWayJunction();
        junction1.executeTwoWayJunction();
        assertEquals(junction1.getWestboundTraffic().getRedLightState(),true);
        assertEquals(junction1.getEastboundTraffic().getRedLightState(),true);
        assertEquals(junction1.getNorthboundTraffic().getRedLightState(),true);
        assertEquals(junction1.getSouthboundTraffic().getRedLightState(),true);
    }

}


