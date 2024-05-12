package org.launchcode;

public class Laptop extends Computer {
    private boolean isCheap;

    public Laptop(Double ageInYears, Double warrantyLength, boolean damageCoverage, boolean isCheap) {
        super(ageInYears, warrantyLength, damageCoverage);
        this.isCheap = isCheap;
    }


    public void spillWater(){
        // call to warrantyCheck method
        System.out.println("oh no, i spilled water on my laptop! Time to take it in for repairs...");
        if (isRepairFree(true)) {
            System.out.println("Good thing I have accidental damage coverage! :D");

        } else {
            System.out.println("Time to buy a new laptop...");
            if (isCheap) {
                System.out.println("Oh well, it was a pile junk anyway!");
            } else {
                System.out.println("The laptop was expensive, but at least I'm rich!");
            }
        }

        System.out.println("Hm? Data transfer? No thanks, I'm on the cloud. Antivirus? What's that?");



    }



}
