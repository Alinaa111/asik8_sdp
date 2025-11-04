public class Clothing extends Item {
    public Clothing(String name, double price) {
        super(name, price);
    }

    @Override
    public void accept(CartVisitor visitor) {
        visitor.visit(this);
    }
}
