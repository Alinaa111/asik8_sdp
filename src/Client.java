public class Client {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(new Book("The Murder of Roger Ackroyd - Agatha Christie", 2000.0));
        cart.addItem(new Clothing("Jacket", 90000.0));
        cart.addItem(new Electronics("Waffle-iron", 25000.0));

        PriceCalculator calculator = new PriceCalculator();

        cart.acceptVisitor(calculator);

        System.out.println("Total price: " + calculator.getTotalPrice());
    }
}