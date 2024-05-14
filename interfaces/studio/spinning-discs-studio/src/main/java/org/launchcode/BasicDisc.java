package org.launchcode;

public abstract class BasicDisc {
    private final String name;
    private final int maxCapacity;
    private int usedCapacity;
    private int remainingCapacity;
    private final String diskType;
    private final String contents;

    public BasicDisc(String name, int maxCapacity, String diskType, String contents, int usedCapacity) {
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.diskType = diskType;
        this.contents = contents;
        this.usedCapacity = checkCapacity(usedCapacity);
        this.remainingCapacity = spaceLeft();
    }

    private int checkCapacity(int dataWritten) {
        return Math.min(maxCapacity, dataWritten);
    }

    private int spaceLeft(){
        return maxCapacity - usedCapacity;
    }

    public String diskInfo(){
        return String.format("%nDisk Name: %s%nMax capacity: %d%nSpace used: %d%nAvailable space: %d%n", name, maxCapacity, usedCapacity, remainingCapacity);
    }

    public String writeData(int dataSize){

        char lastChar = this.diskType.charAt(this.diskType.length() -1);

        if (lastChar != 'W') {
            return "Disc not writeable, its type is " + this.diskType;
        }

        if (dataSize > remainingCapacity){
            return "Not enough disc space!";
        }
        this.usedCapacity += dataSize;
        this.remainingCapacity -= dataSize;

        return "Data written to disc. Remaining space = " + this.remainingCapacity;
    }

    public String getContents() {
        return contents;
    }
}
