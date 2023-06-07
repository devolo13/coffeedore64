import java.util.ArrayList;

public class CoffeeKiosk {
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    public CoffeeKiosk(){
        this.menu = new ArrayList<Item>();
        this.orders = new ArrayList<Order>();
    }

    public void addMenuItem(String name, double price){
        Item item = new Item(name, price);
        item.setIndex(this.menu.size());
        this.menu.add(item);
    }

    public void displayMenu(){
        for (Item item : this.menu){
            System.out.println(item.getIndex() + " " + item.getName() + " -- " + item.getPrice());
        }
    }

    // public void newOrder(){
    //     System.out.println("Please enter customer name for new order:");
    //     String name = System.console().readLine();
    //     Order order = new Order(name);
    //     this.displayMenu();
    //     System.out.println("Please enter a menu item index or q to quit:");
    //     String itemNumber = System.console().readLine();
    //     while(!itemNumber.equals("q")){
    //         itemNumber = System.console().readLine();
    //         if(!itemNumber.equals("")){
    //             for (Item item : this.menu){
    //                 if (itemNumber.equals(item.getIndex())){
    //                     order.addItem(item);
    //                     System.out.println("Enter another menu item or hit q to quit.");
    //                     break;
    //                 }
    //             }
    //         }
    //     }
    //     order.display();
    // }

    public void newOrder(){
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
        Order order = new Order(name);
        this.displayMenu();
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = "";
        while(!itemNumber.equals("q")){
            itemNumber = System.console().readLine();
            order.addItem(handleOrder(itemNumber));
            System.out.println("Enter another menu item or hit q to quit.");
        }
        order.display();
    }

    private Item handleOrder(String itemNumber){
        for (Item item : this.menu){
            if (itemNumber.equals(item.getIndex())){
                return item;
            }
        }
        return null;
    }
}