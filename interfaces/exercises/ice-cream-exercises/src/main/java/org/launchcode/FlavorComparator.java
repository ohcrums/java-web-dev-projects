package org.launchcode;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {

    @Override
    public int compare(Flavor f1, Flavor f2) {
        return f1.getName().compareTo(f2.getName());
    }
}
