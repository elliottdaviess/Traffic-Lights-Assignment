package com.nsa.y1.trafficlights;

/**
 * Created by c1632130 on 09/03/2017.
 */
public class TwoWayJunctionLeftTurn {
    private TrafficLightWithLeftArrow westboundTraffic;
    private TrafficLightWithLeftArrow eastboundTraffic;
    private TrafficLightWithLeftArrow southboundTraffic;
    private TrafficLightWithLeftArrow northboundTraffic;

    public TwoWayJunctionLeftTurn() {
        westboundTraffic = new TrafficLightWithLeftArrow();
        eastboundTraffic = new TrafficLightWithLeftArrow();
        southboundTraffic = new TrafficLightWithLeftArrow();
        northboundTraffic = new TrafficLightWithLeftArrow();
    }

    //-------------------------------------

    //test these next

    public void northSouthArrowFlow(){
        southboundTraffic.leftarrowGoStop();
        northboundTraffic.leftarrowGoStop();
    }

    public void westEastArrowFlow(){
        westboundTraffic.leftarrowGoStop();
        eastboundTraffic.leftarrowGoStop();
    }

    public void executeTwoWayJunctionLeftArrow(){
        northSouthArrowFlow();
        westEastArrowFlow();
    }

    //-------------------------------------

    public TrafficLightWithLeftArrow westboundGo() {
        westboundTraffic.leftarrowGo();
        return westboundTraffic;
    }
    public TrafficLightWithLeftArrow eastboundGo(){
        eastboundTraffic.leftarrowGo();
        return eastboundTraffic;
    }

    public TrafficLightWithLeftArrow southboundGo(){
        southboundTraffic.leftarrowGo();
        return southboundTraffic;
    }

    public TrafficLightWithLeftArrow northboundGo(){
        northboundTraffic.leftarrowGo();
        return northboundTraffic;
    }

    public TrafficLightWithLeftArrow westboundStop() {
        westboundTraffic.leftarrowStop();
        return westboundTraffic;
    }
    public TrafficLightWithLeftArrow eastboundStop(){
        eastboundTraffic.leftarrowStop();
        return eastboundTraffic;
    }

    public TrafficLightWithLeftArrow southboundStop(){
        southboundTraffic.leftarrowStop();
        return southboundTraffic;
    }

    public TrafficLightWithLeftArrow northboundStop(){
        northboundTraffic.leftarrowStop();
        return northboundTraffic;
    }

    //-------------------------------------

    public TrafficLightWithLeftArrow getNorthboundTrafficLeftTurn(){
        return northboundTraffic;
    }

    public TrafficLightWithLeftArrow getSouthboundTrafficLeftTurn(){
        return southboundTraffic;
    }

    public TrafficLightWithLeftArrow getWestboundTrafficLeftTurn(){
        return westboundTraffic;
    }

    public TrafficLightWithLeftArrow getEastboundTrafficLeftTurn(){
        return eastboundTraffic;
    }
}
