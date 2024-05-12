package org.launchcode;

public class Main {
    public static void main(String[] args) {
        Laptop junk = new Laptop(1.2, 1.0, false, true);

        junk.spillWater();

        Smartphone callMe = new Smartphone(1.1, 2.0, true, "Mint Mobile");

        callMe.canYouHearMeNow();

    }
}