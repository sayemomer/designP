package SCView;

import SCModel.Cart;
import SCModel.Observable;

public class View implements Observer {

    public View(Cart cart) {
        cart.attach(this);
    }

//    public void showCart(){
//        Cart cart = new Cart();
//        cart.showCart();
//    }

    @Override
    public void update(Observable p_observable_state) {
        Cart cart = (Cart) p_observable_state;
        cart.showCart();
    }
}
