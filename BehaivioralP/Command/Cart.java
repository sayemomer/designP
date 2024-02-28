package BehaivioralP.Command;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    public Item item;

    List<Item> items;
    
    public Cart(){
        this.items=new ArrayList<Item>();
    }

    public void addItem(Item item){

        this.items.add(item);
        System.out.println(item.getName() + " Added to cart");
    }

    public void removeItem(Item item){
        this.items.remove(item);
        System.out.println(item.getName() +" Removed from cart");
    }
}
