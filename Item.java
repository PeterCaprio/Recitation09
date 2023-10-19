// Item.java
public class Item {
    private String name;
    private double price;
    boolean isEdible;
    boolean isLiquid;

    // Constructor for the Item class
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter method for the name of the item
    public String getName() {
        return name;
    }

    // Getter method for the price of the item
    public double getPrice() {
        return price;
    }
}
