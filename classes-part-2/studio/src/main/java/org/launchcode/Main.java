package org.launchcode;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // write your code here

        MenuItem hummus = new MenuItem("Hummus", 7.49, "Chickpeas blended with tahini, lemon juice, garlic, olive oil, and served with pita.", "Appetizer", false);
        MenuItem kibbah = new MenuItem("Kibbah", 8.75, "Crispy shell of cracked wheat, stuffed with sautéed beef and onions, served with yogurt sauce. (Kibbah may contain pine nuts).", "Appetizer", true);
        MenuItem chickenBiryani = new MenuItem("Chicken Biryani",16.49, "Cubes of chicken mixed with grilled onions, Basmati rice, and biryani spices. Spicy.", "Entree", false);

        ArrayList<MenuItem> newItems = new ArrayList<>();
        newItems.add(hummus);
        newItems.add(kibbah);
        newItems.add(chickenBiryani);

        Date currentTime = new Date();
        Date oldTime = new Date(2024, Calendar.MAY, 2);
        Menu menu = new Menu(oldTime, newItems);


        System.out.println(menu);
        System.out.println(hummus);
        menu.getItems().remove(0);
        menu.setLastUpdated(currentTime);
        System.out.println(menu);
    }
}
