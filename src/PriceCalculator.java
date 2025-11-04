// Concrete Visitor implementation
public class PriceCalculator implements CartVisitor {
    // Attribute for total price
    private double totalPrice = 0;

    // Override methods for visit and count price for each item type
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

    // Getting overall price for all items in cart
    public double getTotalPrice() {
        return totalPrice;
    }
}
