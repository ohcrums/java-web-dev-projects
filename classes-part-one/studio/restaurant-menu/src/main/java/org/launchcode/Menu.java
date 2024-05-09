package org.launchcode;

import java.util.ArrayList;

public class Menu {
    public static ArrayList<String> menuList = new ArrayList<>();
    public static ArrayList<String> menuCategories = new ArrayList<>();

    public static void setCategory(String category) {
        if (!menuCategories.contains(category)) {
            menuCategories.add(category);
        }
    }

    public static ArrayList<String> getMenuCategories() {
        return menuCategories;
    }

    public static void setMenuList (String name) {
        if (!menuList.contains(name)){
            menuList.add(name);
        }
    }

    public static ArrayList<String> getMenuList() {
        return menuList;
    }

    public static String getMenuItem(int i){
        return menuList.get(i);
    }
}
