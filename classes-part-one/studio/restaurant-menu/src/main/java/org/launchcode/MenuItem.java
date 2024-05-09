package org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;

public class MenuItem {
    private String name;
    private boolean newItem;
    private Double price;
    private String category;
    private String description;

    public MenuItem(String name, String category, boolean newItem, Double price, String description) {
        this.name = name;
        this.newItem = newItem;
        this.price = price;
        this.description = description;
        this.category = category;
        Menu.setCategory(category);
        Menu.setMenuList(name);
    }

    public MenuItem(String name, String category) {
        this(name, category, true, 5.50, "what is this?");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNewItem() {
        return newItem;
    }

    public void setNewItem(boolean newItem) {
        this.newItem = newItem;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

