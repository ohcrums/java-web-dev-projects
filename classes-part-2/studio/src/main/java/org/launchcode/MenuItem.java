package org.launchcode;

import java.util.Objects;

public class MenuItem {
    private final String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(String n, double p, String d, String c, boolean iN) {
        this.name = n;
        this.price = p;
        this.description = d;
        this.category = c;
        this.isNew = iN;
    }

    @Override
    public String toString() {
//        return "MenuItem{" +
//                "price=" + price +
//                ", description='" + description + '\'' +
//                ", category='" + category + '\'' +
//                ", isNew=" + isNew +
//                '}';
        if (this.isNew) {
            return String.format("---%n%s (%s) *New Item!*%nPrice: %2f %n%s%n", this.name, this.category, this.price, this.description);
        }else {
            return String.format("---%n%s (%s) %nPrice: %2f %n%s%n", this.name, this.category, this.price, this.description);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(price, menuItem.price) == 0 && isNew == menuItem.isNew && Objects.equals(description, menuItem.description) && Objects.equals(category, menuItem.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, description, category, isNew);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}

