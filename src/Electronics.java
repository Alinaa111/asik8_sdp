// Concrete Element
public class Electronics extends Item {
    // Constructor
    public Electronics(String name, double price) {
        super(name, price);
    }

    // Override method for accepting visitor from parent class
    @Override
    public void accept(CartVisitor visitor) {
        visitor.visit(this);
    }
}
