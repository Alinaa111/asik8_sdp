// Concrete Element
public class Book extends Item {
    // Constructor
    public Book(String name, double price) {
        super(name, price);
    }

    // Override method for accepting visitor from parent class
    @Override
    public void accept(CartVisitor visitor) {
        visitor.visit(this);
    }
}
