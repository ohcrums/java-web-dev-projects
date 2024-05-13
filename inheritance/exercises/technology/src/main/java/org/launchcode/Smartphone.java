package org.launchcode;

import java.util.Random;

public class Smartphone extends Computer{
    private final String carrier;

    public Smartphone(String unitName, Double ageInYears, Double warrantyLength, boolean damageCoverage, String carrier) {
        super(unitName, ageInYears, warrantyLength, damageCoverage);
        this.carrier = carrier;
    }

    public void canYouHearMeNow(){
        Random rand = new Random();
        int signalStrength = rand.nextInt(10);
        if (signalStrength < 5) {
            System.out.println("Hello? Hello? Can anyone hear me? Ugh!! I hate " + carrier);
        } else {
            System.out.println("Hello friend! I can hear you crystal clear! I love " + carrier + "!");
        }
    }

}
