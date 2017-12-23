package com.nsa.y1.trafficlights;

/**
 * Created by c1632130 on 08/03/2017.
 */
public class TwoWayJunction {

    private TrafficLight westboundTraffic;
    private TrafficLight eastboundTraffic;
    private TrafficLight southboundTraffic;
    private TrafficLight northboundTraffic;

    public TwoWayJunction() {
        westboundTraffic = new TrafficLight();
        eastboundTraffic = new TrafficLight();
        southboundTraffic = new TrafficLight();
        northboundTraffic = new TrafficLight();
    }

    //--------------------------------------

    public void northSouthFlow(){
        southboundTraffic.go();
        northboundTraffic.go();

        southboundTraffic.stop();
        northboundTraffic.stop();
    }

    public void westEastFlow(){
        westboundTraffic.go();
        eastboundTraffic.go();

        westboundTraffic.stop();
        eastboundTraffic.stop();
    }

    public void executeTwoWayJunction(){
        northSouthFlow();
        westEastFlow();
    }

    //------------------------------------------

    public TrafficLight westboundGo() {
        westboundTraffic.go();
        return westboundTraffic;
    }
    public TrafficLight eastboundGo(){
        eastboundTraffic.go();
        return eastboundTraffic;
    }

    public TrafficLight southboundGo(){
        southboundTraffic.go();
        return southboundTraffic;
    }

    public TrafficLight northboundGo(){
        northboundTraffic.go();
        return northboundTraffic;
    }

    public TrafficLight westboundStop() {
        westboundTraffic.stop();
        return westboundTraffic;
    }
    public TrafficLight eastboundStop(){
        eastboundTraffic.stop();
        return eastboundTraffic;
    }

    public TrafficLight southboundStop(){
        southboundTraffic.stop();
        return southboundTraffic;
    }

    public TrafficLight northboundStop(){
        northboundTraffic.stop();
        return northboundTraffic;
    }

    //-------------------------------------

    public TrafficLight getNorthboundTraffic(){
        return northboundTraffic;
    }

    public TrafficLight getSouthboundTraffic(){
        return southboundTraffic;
    }

    public TrafficLight getWestboundTraffic(){
        return westboundTraffic;
    }

    public TrafficLight getEastboundTraffic(){
        return eastboundTraffic;
    }

}
