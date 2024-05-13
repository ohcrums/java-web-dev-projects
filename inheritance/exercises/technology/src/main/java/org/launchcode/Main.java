package org.launchcode;

public class Main {
    public static void main(String[] args) {
        Laptop junk = new Laptop("junker",1.2, 1.0, false, true);

        junk.spillWater();

        Smartphone callMe = new Smartphone( "hotline",1.1, 2.0, true, "Mint Mobile");

        callMe.canYouHearMeNow();

        System.out.println(junk.getIdentity());
        System.out.println(junk.getUnitName());
        // another way to find a unit id, with its name instead of getter
        System.out.println(junk.findUnit(junk.getIdentity()));

        System.out.println(callMe.getIdentity());

        // print whole catalogue
        System.out.println(AbstractEntity.getCatalogue());


    }
}