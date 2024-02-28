package BehaivioralP.Command;

public class RemoveToCartCommand implements CommandI{

    private Cart cart;
    private Item item;

    public RemoveToCartCommand(Cart cart,Item item){
        this.cart = cart;
        this.item = item;
    }

    @Override
    public void execute() {
        cart.removeItem(this.item);
    }
    
}
