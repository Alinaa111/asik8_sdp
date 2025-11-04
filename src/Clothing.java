// Concrete Element
public class Clothing extends Item {
    // Constructor
    public Clothing(String name, double price) {
        super(name, price);
    }

    // Override method for accepting visitor from parent class
    @Override
    public void accept(CartVisitor visitor) {
        visitor.visit(this);
    }
}
