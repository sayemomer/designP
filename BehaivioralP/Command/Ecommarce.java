package BehaivioralP.Command;

public class Ecommarce {

    public static void main(String[] args) {
        // TODO code application logic here

        //before command pattern

        // ShoppingCart cart = new ShoppingCart();
        // Item item1 = new Item("Potato",10);
        // Item item2 = new Item("Rice",40);
        // cart.addItem(item1);
        // cart.addItem(item2);

        // cart.removeItem(item2);

        // cart.showCart();

        // After command pattern

        CartInvoker cartInvoker = new CartInvoker(); 
        Cart cart = new Cart();
        Item item1 = new Item("potato", 6);
        Item item2 = new Item("Apple", 4);

        AddToCartCommand addItem1 = new AddToCartCommand(cart, item1);
        cartInvoker.setCommand(addItem1);
        cartInvoker.buttonWasPressed();
        AddToCartCommand addItem2 = new AddToCartCommand(cart, item2);
        cartInvoker.setCommand(addItem2);
        cartInvoker.buttonWasPressed();

        RemoveToCartCommand removeItem1 = new RemoveToCartCommand(cart, item1);
        cartInvoker.setCommand(removeItem1);
        cartInvoker.buttonWasPressed();
    }
    
}
