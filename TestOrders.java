import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item("mocha", 3.5);
        Item item2 = new Item("latte", 4.2);
        Item item3 = new Item("drip coffee", 2);
        Item item4 = new Item("cappuccino", 5.43);

        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");
        Order order5 = new Order("Steven");

        CoffeeKiosk kiosk = new CoffeeKiosk();
        kiosk.addMenuItem(item1.getName(), item1.getPrice());
        kiosk.addMenuItem(item2.getName(), item2.getPrice());
        kiosk.addMenuItem(item3.getName(), item3.getPrice());
        kiosk.addMenuItem(item4.getName(), item4.getPrice());
        kiosk.newOrder();
    }
}
