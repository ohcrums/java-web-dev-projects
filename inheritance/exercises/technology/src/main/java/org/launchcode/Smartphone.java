package org.launchcode;

import java.util.Random;

public class Smartphone extends Computer{
    private String carrier;
    private int signalStrength;

    public Smartphone(Double ageInYears, Double warrantyLength, boolean damageCoverage, String carrier) {
        super(ageInYears, warrantyLength, damageCoverage);
        this.carrier = carrier;
    }

    public void canYouHearMeNow(){
        Random rand = new Random();
        this.signalStrength = rand.nextInt(10);
        if (this.signalStrength < 5) {
            System.out.println("Hello? Hello? Can anyone hear me? Ugh!! I hate " + carrier);
        } else {
            System.out.println("Hello friend! I can hear you crystal clear! I love " + carrier + "!");
        }
    }

}
