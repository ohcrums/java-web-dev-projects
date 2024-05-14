package org.launchcode;

public class Main {
    public static void main(String[] args) {

        CD spinny = new CD("mystery disc", 700, "CD-RW", "music", 330);
        DVD bigSpinny = new DVD("big donker", 4700, "DVD-R", "game", 4550);

        spinny.spinDisc();
        System.out.println(spinny.diskInfo());
        System.out.println(spinny.writeData(200));
        System.out.println(spinny.diskInfo());
        spinny.readData();

        bigSpinny.spinDisc();
        System.out.println(bigSpinny.diskInfo());
        System.out.println(bigSpinny.writeData(30));
        System.out.println(bigSpinny.diskInfo());
        bigSpinny.readData();

    }
}