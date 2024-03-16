package SCModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Item class represents an item in a shopping cart.
 * An item has a name and a price.
 * The name is a String and the price is an int.
 */


public class Cart extends Observable {

        class Item {
        private String name;
        private int price;

        public Item(String name, int price){
            this.name = name;
            this.price = price;
        }

        public String getName(){
            return name;
        }

        public int getPrice(){
            return price;
        }
    }

    // List of items
    public List<Item> items;

    public Cart(){
        this.items=new ArrayList<Item>();
    }

    public void addItem(String name, int price){
        Item item = new Item(name, price);
        this.items.add(item);
        notifyObservers(this);
    }

    public void removeItem(String name, int price){
        Item item = new Item(name, price);
        this.items.remove(item);
        notifyObservers(this);
    }

    public int calculateTotal(){
        int sum = 0;
        for(Item item : items){
            sum += item.getPrice();
        }
        return sum;
    }

    public void showCart(){
        for (Item item : items) {
            System.out.println("Name: " + item.getName() + " Price: " + item.getPrice());
        }
    }
}
