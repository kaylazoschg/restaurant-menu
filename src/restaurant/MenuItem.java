package restaurant;

public class MenuItem {

    private String name;
    private double price;
    private String description;
    private String category;     //(appetizer, main course, or dessert)
    private boolean newItem;

    public MenuItem (String name, double price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.newItem = true;
    }

    public MenuItem (String name, double price, String description, String category, boolean newItem) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.newItem = newItem;
    }

    public String getName () {
        return this.name;
    }
    public void setName (String aName) {
        this.name = aName;
    }

    public double getPrice () {
        return this.price;
    }
    public void setPrice (double aPrice) {
        this.price = aPrice;
    }

    public String getDescription () {
        return this.description;
    }
    public void setDescription (String aDescription) {
        this.description = aDescription;
    }

    public String getCategory () {
        return this.category;
    }

    public boolean getNewItem () {
        return this.newItem;
    }
    public void setNewItem (boolean aNewItem) {
        this.newItem = aNewItem;
    }

}
