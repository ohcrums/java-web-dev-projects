package org.launchcode;

public class CD extends BasicDisc implements OpticalDisc {

    public CD(String name, int maxCapacity, String diskType, String contents, int usedCapacity) {
        super(name, maxCapacity, diskType, contents, usedCapacity);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }

    @Override
    public void readData() {
        if (this.getContents().equalsIgnoreCase("music")) {
            System.out.println("You bump some sweet jams.");
        } else if (this.getContents().equalsIgnoreCase("pictures")) {
            System.out.println("You reminisce on good memories");
        }
    }

}
