package BehaivioralP.Command;

public class AddToCartCommand implements CommandI{

    private Cart cart;
    private Item item;

    public AddToCartCommand(Cart cart,Item item){
        this.cart = cart;
        this.item = item;
    }

    @Override
    public void execute() {
        cart.addItem(this.item);
    }
    
}
