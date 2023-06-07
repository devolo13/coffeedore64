public class Item {
    private String name;
    private double price;
    private int index;

    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName (){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }

    public int getIndex(){
        return this.index;
    }

    public int setIndex(int newIndex){
        this.index = newIndex;
        return this.index;
    }
}