public class PriceCalculator implements CartVisitor {
    private double totalPrice = 0;

    @Override
    public void visit(Book book) {
        System.out.println("Calculating price for book: " + book.getName());
        totalPrice += book.getPrice();
    }

    @Override
    public void visit(Clothing clothing) {
        System.out.println("Calculating price for clothing: " + clothing.getName());
        totalPrice += clothing.getPrice();
    }

    @Override
    public void visit(Electronics electronics) {
        System.out.println("Calculating price for electronics: " + electronics.getName());
        totalPrice += electronics.getPrice();
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
