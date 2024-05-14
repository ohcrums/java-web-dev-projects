package org.launchcode;

public class DVD extends BasicDisc implements OpticalDisc {

    public DVD(String name, int maxCapacity, String diskType, String contents, int usedCapacity) {
        super(name, maxCapacity, diskType, contents, usedCapacity);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void readData() {
        if (this.getContents().equalsIgnoreCase("game")) {
            System.out.println("Pew pew! Wow, you made it on the leaderboard!");
        } else if (this.getContents().equalsIgnoreCase("movie")) {
            System.out.println("*Sniffle* What a masterpiece!");
        }
    }

}
