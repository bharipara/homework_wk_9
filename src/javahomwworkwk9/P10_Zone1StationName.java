package javahomwworkwk9;

import java.util.ArrayList;

public class P10_Zone1StationName {

    //static method
    public static void bakerStreet() {
        ArrayList<String> bakerstreet = new ArrayList();
        bakerstreet.add("Bakerloo");
        bakerstreet.add("Jubliee");
        bakerstreet.add("Metropolitan");
        bakerstreet.add("Hammersmith & City");
        for (String station : bakerstreet) {
            System.out.println("Baker Street Station Serves : " + station + "Line");
        }
    }

    //static method
    public static void greenPark() {
        ArrayList<String> greenpark = new ArrayList<>();
        greenpark.add("Victoria");
        greenpark.add("Jubilee");
        greenpark.add("Piccadilly");
        for (String station : greenpark) {
            System.out.println("GreenPark Station Serves :" + "Line");
        }
    }

    //static method
    public static void westMinster() {
        ArrayList<String> westminster = new ArrayList<>();
        westminster.add("District");
        westminster.add("Circle");
        westminster.add("Jubilee");
        for (String station : westminster) {
            System.out.println("Westminster Station Serves : " + station + "Line");
        }
    }

    //static method
    public static void oxfordCircle() {
        ArrayList<String> oxfordcircle = new ArrayList<>();
        oxfordcircle.add("Bakerloo");
        oxfordcircle.add("Central");
        oxfordcircle.add("Victoria");
        for (String station : oxfordcircle) {
            System.out.println("Oxford Circle Station Serves : " + station + "List");
        }
    }

    public static void bank() {
        ArrayList<String> bank = new ArrayList<>();
        bank.add("Northern");
        bank.add("DLR");
        bank.add("Central");
        bank.add("Waterloo and City");
        for (String station : bank) {
            System.out.println("Bank Station Serves :" + station + "Line");
        }
    }
}
