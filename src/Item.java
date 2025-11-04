// Abstract class Element
public abstract class Item {
    // Common attributes for each item
    private String name;
    private double price;

    // Constructor
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Accepting visitor
    public abstract void accept(CartVisitor visitor);
}
