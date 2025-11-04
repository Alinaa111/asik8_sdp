// Client class
public class Client {
    public static void main(String[] args) {
        // Making array (cart) of items
        Item[] items = new Item[] {
            new Book("The Murder of Roger Ackroyd - Agatha Christie", 2000.0),
            new Clothing("Jacket", 90000.0),
            new Electronics("Waffle-iron", 25000.0)
        };

        // Creating price calculator (visitor)
        PriceCalculator calculator = new PriceCalculator();

        // Iterating through items and accept calculator
        for (Item item : items) {
            item.accept(calculator);
        }

        // Showing total price of all items
        System.out.println("Total price: " + calculator.getTotalPrice());
    }
}