public class Book extends Item {
    public Book(String name, double price) {
        super(name, price);
    }

    @Override
    public void accept(CartVisitor visitor) {
        visitor.visit(this);
    }
}
