import java.util.ArrayList;

public class Order {
    private String name;
    // private double total;
    private boolean ready;
    private ArrayList<Item> items;

    public Order(){
        this.name = "Guest";
        this.items = new ArrayList<Item>();
        this.ready = false;
    }

    public Order(String guestName){
        this.name = guestName;
        this.items = new ArrayList<Item>();
        this.ready = false;
    }

    public void setReady (){
        this.ready = true;
    }

    public void addItem (Item item){
        this.items.add(item);
    }

    public String getStatusMessage () {
        if (this.ready){
            return "Your order is ready.";
        } else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public double getOrderTotal (){
        double runningSum = 0;
        for (Item item : this.items) {
            runningSum += item.getPrice();
        }
        return runningSum;
    }

    public void display () {
        System.out.println("Customer Name: " + this.name);
        for (Item item : this.items) {
            System.out.println(item.getName() + " - " + item.getPrice());
        }
        System.out.println("Total: " + this.getOrderTotal());
    }
}
