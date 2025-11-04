import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void acceptVisitor(CartVisitor visitor) {
        for (Item item : items) {
            item.accept(visitor);
        }
    }

}
