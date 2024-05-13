package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        Comparator<Flavor> alphabetize = new FlavorComparator();
        Comparator<Flavor> byCost = new ConeComparator();
        ArrayList<Cone> cones = menu.getCones();

        // DONE: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.

        // DONE: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.

        // DONE: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.

        System.out.println("\nUnsorted Flavors::");
        for (Flavor fl : flavors){
            System.out.println(fl.getName());
        }

        flavors.sort(alphabetize);
        System.out.println("\nAlphabetically Sorted Flavors::");
        for (Flavor fl : flavors){
            System.out.println(fl.getName());
        }

        System.out.println("\nNumerically Sorted Flavors::");
        flavors.sort(byCost);
        for (Flavor fl : flavors){
            System.out.println(fl.getName() + " costs " + fl.getCost());
        }

    }
}