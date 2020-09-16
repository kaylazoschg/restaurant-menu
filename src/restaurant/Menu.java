package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private Date dateUpdated;
    private ArrayList<MenuItem> items;

    public Menu(ArrayList<MenuItem> items) {
        this.dateUpdated = new Date();
        this.items = items;
    }

    public Date getDateUpdated () {
        return this.dateUpdated;
    }
    public void setDateUpdated (Date aDateUpdated) {
        this.dateUpdated = aDateUpdated;
    }

    public ArrayList<MenuItem> getItems () {
        return this.items;
    }
    public void setItems (ArrayList<MenuItem> anItems) {
        this.items = anItems;
    }

    public void addItem(MenuItem item) {
        items.add(item);
        this.dateUpdated = new Date();
    }

    public void removeItem(MenuItem item){
        items.remove(item);
        this.dateUpdated = new Date();
    }

    public Date checkLastUpdated() {
        return this.dateUpdated;
    }

    @Override
    public String toString() {
        return "Menu\n" +
                "Last updated " + dateUpdated + "\n" +
                "Items: " + items;
    }
}
