package org.launchcode;

import java.util.Comparator;

public class ConeComparator implements Comparator<Flavor> {

    @Override
    public int compare(Flavor f1, Flavor f2){
        Double df1 = f1.getCost();
        Double df2 = f2.getCost();
        return df1.compareTo(df2);
    }
}
