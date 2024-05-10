package org.launchcode;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    @Override
    public String toString() {
        StringBuilder loopItems = new StringBuilder();
        for (MenuItem item : items) {
            loopItems.append(item.toString());
        }
         return String.format("***%nCool Restaurant Menu %nLast Updated on %s %nOur dishes include: %n%s***",this.lastUpdated, loopItems.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return Objects.equals(lastUpdated, menu.lastUpdated) && Objects.equals(items, menu.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastUpdated, items);
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }
}


