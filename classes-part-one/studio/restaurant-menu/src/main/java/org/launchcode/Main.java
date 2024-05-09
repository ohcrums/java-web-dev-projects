package org.launchcode;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        MenuItem materSoup = new MenuItem("Tomato Soup", "Soup");
        MenuItem goodDip = new MenuItem("Hummus", "Appetizer");
        MenuItem bigHonker = new MenuItem("BIG Sammy", "Sandwich");
        MenuItem genericMeal = new MenuItem("Enter the entree", "Dinner");

        System.out.println("Check it out:");
        for (MenuItem currentItem : new MenuItem[]{materSoup, goodDip, bigHonker, genericMeal}){
            System.out.println(currentItem.getName());
            System.out.println(currentItem.getPrice());
            System.out.println(currentItem.getCategory());
            System.out.println(currentItem.getDescription());
            if (currentItem.isNewItem()) {
                System.out.println("This is a new item! :D");
            }
        }


        System.out.println("Menu Categories: " + Menu.getMenuCategories());
        System.out.println("Menu List: " + Menu.getMenuList());
        System.out.println("Get Menu Item: " + Menu.getMenuItem(0));


    }
}
