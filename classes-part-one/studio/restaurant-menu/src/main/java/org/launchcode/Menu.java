package org.launchcode;
import java.time.LocalDate;
import java.util.ArrayList;
public class Menu {
    //fields
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;

    //getter and setter
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
}
