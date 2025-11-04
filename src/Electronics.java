public class Electronics extends Item {
    public Electronics(String name, double price) {
        super(name, price);
    }

    @Override
    public void accept(CartVisitor visitor) {
        visitor.visit(this);
    }
}
