package org.launchcode;

public abstract class AbstractEntity {
//    each class has one Id property
    private int identity;

    public int getIdentity() {
        return identity;
    }

    public void setIdentity(int identity) {
        this.identity = identity;
    }

    // no two objects created from any class may have the same value for Id

    // behavior to assign a unique Id for each class that extends it
    public int assignId (String unitName) {
        identity = identity++;
        return identity;
    }

    // behavior to access a unique Id for each class that extends it
}
