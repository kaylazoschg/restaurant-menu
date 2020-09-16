package restaurant;

import java.util.ArrayList;

public class Restaurant {

    public static void main (String[] args) {
        //create several items and add them to a menu
        MenuItem fries = new MenuItem("fries", 5.00, "delicious",
                "appetizer");
        MenuItem pizza = new MenuItem("pizza", 6.00, "the best ever",
                "entree");
        MenuItem cookie = new MenuItem("cookie", 3.00, "tasty",
                "dessert");
        ArrayList<MenuItem> miniMenu = new ArrayList<MenuItem>();
        miniMenu.add(fries);
        miniMenu.add(pizza);
        miniMenu.add(cookie);
        Menu newMenu = new Menu(miniMenu);
        //print entire updated menu to screen
        System.out.println(newMenu.toString());

        //print individual menu item to screen
        System.out.println(pizza.toString());

        //delete item from menu, then reprint menu
        newMenu.removeItem(pizza);
        System.out.println(newMenu.toString());
    }

}
