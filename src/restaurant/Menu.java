package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private Date dateUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date dateUpdated, ArrayList<MenuItem> items) {
        this.dateUpdated = dateUpdated;
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

}
