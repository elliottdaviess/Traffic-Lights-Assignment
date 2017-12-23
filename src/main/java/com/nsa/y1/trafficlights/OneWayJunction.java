package com.nsa.y1.trafficlights;

/**
 * Created by c1632130 on 06/03/2017.
 */
public class OneWayJunction {

    private TrafficLight westboundTraffic;
    private TrafficLight eastboundTraffic;



    public OneWayJunction() {
        westboundTraffic = new TrafficLight();
        eastboundTraffic = new TrafficLight();
    }

    public TrafficLight westboundGo() {
        westboundTraffic.go();
        return westboundTraffic;
    }
    public TrafficLight eastboundGo(){
        eastboundTraffic.go();
        return eastboundTraffic;
    }

    public TrafficLight westboundStop() {
        westboundTraffic.stop();
        return westboundTraffic;
    }
    public TrafficLight eastboundStop(){
        eastboundTraffic.stop();
        return eastboundTraffic;
    }



    public void westboundFlow(){
        westboundTraffic.go();
        westboundTraffic.stop();
    }

    public void eastboundFlow(){
        eastboundTraffic.go();
        eastboundTraffic.stop();
    }

    public void executeJunction(){
        eastboundFlow();
        westboundFlow();
    }

    public TrafficLight getWestboundTraffic(){
        return westboundTraffic;
    }

    public TrafficLight getEastboundTraffic(){
        return eastboundTraffic;
    }

}
