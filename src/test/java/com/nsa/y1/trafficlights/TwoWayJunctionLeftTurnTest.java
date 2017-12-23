package com.nsa.y1.trafficlights;

/**
 * Created by c1632130 on 09/03/2017.
 */

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoWayJunctionLeftTurnTest {
    private TwoWayJunctionLeftTurn testTwoWayLeftTurn;

    //------------------------------------------------------------------------------------------------------------------
    @Before
    public void createTwoWayJunction() throws Exception {
        TwoWayJunction junction2 = new TwoWayJunction(); //test default constructor
    }

    //------------------------------------------------------------------------------------------------------------------

    @Test
    public void greenLightArrowOnAfterEastboundGo() throws Exception {
        TwoWayJunctionLeftTurn junction1 = new TwoWayJunctionLeftTurn();
        junction1.eastboundGo();
        assertEquals(junction1.getEastboundTrafficLeftTurn().getGreenLightState(),true);
        assertEquals(junction1.getEastboundTrafficLeftTurn().getGreenLeftArrowState(),true);
    }

    @Test
    public void greenLightArrowOnAfterWestboundGo() throws Exception {
        TwoWayJunctionLeftTurn junction1 = new TwoWayJunctionLeftTurn();
        junction1.westboundGo();
        assertEquals(junction1.getWestboundTrafficLeftTurn().getGreenLightState(),true);
        assertEquals(junction1.getWestboundTrafficLeftTurn().getGreenLeftArrowState(),true);
    }

    @Test
    public void greenLightArrowOnAfterSouthboundGo() throws Exception {
        TwoWayJunctionLeftTurn junction1 = new TwoWayJunctionLeftTurn();
        junction1.southboundGo();
        assertEquals(junction1.getSouthboundTrafficLeftTurn().getGreenLightState(),true);
        assertEquals(junction1.getSouthboundTrafficLeftTurn().getGreenLeftArrowState(),true);
    }

    @Test
    public void greenLightArrowOnAfterNorthboundGo() throws Exception {
        TwoWayJunctionLeftTurn junction1 = new TwoWayJunctionLeftTurn();
        junction1.northboundGo();
        assertEquals(junction1.getNorthboundTrafficLeftTurn().getGreenLightState(),true);
        assertEquals(junction1.getNorthboundTrafficLeftTurn().getGreenLeftArrowState(),true);
    }

    //------------------------------------------------------------------------------------------------------------------

    @Test
    public void eastboundStopEndsOnRed() throws Exception {
        TwoWayJunctionLeftTurn junction1 = new TwoWayJunctionLeftTurn();
        junction1.eastboundGo();
        junction1.eastboundStop();
        assertEquals(junction1.getEastboundTrafficLeftTurn().getRedLightState(),true);
        assertEquals(junction1.getEastboundTrafficLeftTurn().getGreenLeftArrowState(),false);

    }

    @Test
    public void westboundStopEndsOnRed() throws Exception {
        TwoWayJunctionLeftTurn junction1 = new TwoWayJunctionLeftTurn();
        junction1.westboundGo();
        junction1.westboundStop();
        assertEquals(junction1.getWestboundTrafficLeftTurn().getRedLightState(),true);
        assertEquals(junction1.getWestboundTrafficLeftTurn().getGreenLeftArrowState(),false);

    }

    @Test
    public void southboundStopEndsOnRed() throws Exception {
        TwoWayJunctionLeftTurn junction1 = new TwoWayJunctionLeftTurn();
        junction1.southboundGo();
        junction1.southboundStop();
        assertEquals(junction1.getSouthboundTrafficLeftTurn().getRedLightState(),true);
        assertEquals(junction1.getSouthboundTrafficLeftTurn().getGreenLeftArrowState(),false);

    }
    @Test
    public void northboundStopEndsOnRed() throws Exception {
        TwoWayJunctionLeftTurn junction1 = new TwoWayJunctionLeftTurn();
        junction1.northboundGo();
        junction1.northboundStop();
        assertEquals(junction1.getNorthboundTrafficLeftTurn().getRedLightState(),true);
        assertEquals(junction1.getNorthboundTrafficLeftTurn().getGreenLeftArrowState(),false);

    }

    //------------------------------------------------------------------------------------------------------------------
    @Test
    public void eastWestFlowEndsOnRed() throws Exception {
        TwoWayJunctionLeftTurn junction1 = new TwoWayJunctionLeftTurn();
        junction1.westEastArrowFlow();
        assertEquals(junction1.getEastboundTrafficLeftTurn().getRedLightState(),true);
        assertEquals(junction1.getEastboundTrafficLeftTurn().getGreenLeftArrowState(),false);

        assertEquals(junction1.getWestboundTrafficLeftTurn().getRedLightState(),true);
        assertEquals(junction1.getWestboundTrafficLeftTurn().getGreenLeftArrowState(),false);

    }

    @Test
    public void northSouthFlowEndsOnRed() throws Exception {
        TwoWayJunctionLeftTurn junction1 = new TwoWayJunctionLeftTurn();
        junction1.northSouthArrowFlow();
        assertEquals(junction1.getNorthboundTrafficLeftTurn().getRedLightState(),true);
        assertEquals(junction1.getNorthboundTrafficLeftTurn().getGreenLeftArrowState(),false);

        assertEquals(junction1.getSouthboundTrafficLeftTurn().getRedLightState(),true);
        assertEquals(junction1.getSouthboundTrafficLeftTurn().getGreenLeftArrowState(),false);

    }

    //------------------------------------------------------------------------------------------------------------------
    //checking states of other lights during flows

    @Test
    public void northSouthlightsOffDuringeastWestFlow() throws Exception {
        TwoWayJunctionLeftTurn junction1 = new TwoWayJunctionLeftTurn();
        junction1.westEastArrowFlow();
        assertEquals(junction1.getNorthboundTrafficLeftTurn().getRedLightState(),true);
        assertEquals(junction1.getNorthboundTrafficLeftTurn().getAmberLightState(),false);
        assertEquals(junction1.getNorthboundTrafficLeftTurn().getGreenLightState(),false);
        assertEquals(junction1.getNorthboundTrafficLeftTurn().getGreenLeftArrowState(),false);

        assertEquals(junction1.getSouthboundTrafficLeftTurn().getRedLightState(),true);
        assertEquals(junction1.getSouthboundTrafficLeftTurn().getAmberLightState(),false);
        assertEquals(junction1.getSouthboundTrafficLeftTurn().getGreenLightState(),false);
        assertEquals(junction1.getSouthboundTrafficLeftTurn().getGreenLeftArrowState(),false);

    }

    @Test
    public void westEastlightsOffDuringeastWestFlow() throws Exception {
        TwoWayJunctionLeftTurn junction1 = new TwoWayJunctionLeftTurn();
        junction1.westEastArrowFlow();
        assertEquals(junction1.getEastboundTrafficLeftTurn().getRedLightState(),true);
        assertEquals(junction1.getEastboundTrafficLeftTurn().getAmberLightState(),false);
        assertEquals(junction1.getEastboundTrafficLeftTurn().getGreenLightState(),false);
        assertEquals(junction1.getEastboundTrafficLeftTurn().getGreenLeftArrowState(),false);

        assertEquals(junction1.getWestboundTrafficLeftTurn().getRedLightState(),true);
        assertEquals(junction1.getWestboundTrafficLeftTurn().getAmberLightState(),false);
        assertEquals(junction1.getWestboundTrafficLeftTurn().getGreenLightState(),false);
        assertEquals(junction1.getWestboundTrafficLeftTurn().getGreenLeftArrowState(),false);

    }
    //------------------------------------------------------------------------------------------------------------------

    @Test
    public void executeJuncEndsOnRed() throws Exception {
        TwoWayJunctionLeftTurn junction1 = new TwoWayJunctionLeftTurn();
        junction1.executeTwoWayJunctionLeftArrow();
        assertEquals(junction1.getEastboundTrafficLeftTurn().getRedLightState(),true);
        assertEquals(junction1.getEastboundTrafficLeftTurn().getAmberLightState(),false);
        assertEquals(junction1.getEastboundTrafficLeftTurn().getGreenLightState(),false);
        assertEquals(junction1.getEastboundTrafficLeftTurn().getGreenLeftArrowState(),false);

        assertEquals(junction1.getWestboundTrafficLeftTurn().getRedLightState(),true);
        assertEquals(junction1.getWestboundTrafficLeftTurn().getAmberLightState(),false);
        assertEquals(junction1.getWestboundTrafficLeftTurn().getGreenLightState(),false);
        assertEquals(junction1.getWestboundTrafficLeftTurn().getGreenLeftArrowState(),false);

        assertEquals(junction1.getNorthboundTrafficLeftTurn().getRedLightState(),true);
        assertEquals(junction1.getNorthboundTrafficLeftTurn().getAmberLightState(),false);
        assertEquals(junction1.getNorthboundTrafficLeftTurn().getGreenLightState(),false);
        assertEquals(junction1.getNorthboundTrafficLeftTurn().getGreenLeftArrowState(),false);

        assertEquals(junction1.getSouthboundTrafficLeftTurn().getRedLightState(),true);
        assertEquals(junction1.getSouthboundTrafficLeftTurn().getAmberLightState(),false);
        assertEquals(junction1.getSouthboundTrafficLeftTurn().getGreenLightState(),false);
        assertEquals(junction1.getSouthboundTrafficLeftTurn().getGreenLeftArrowState(),false);

    }



}
