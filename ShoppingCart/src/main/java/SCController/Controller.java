package SCController;

import SCModel.Cart;
import SCView.View;

import java.util.Scanner;

public class Controller {
    public void start() {

        Cart cart = new Cart();
        View view = new View(cart);
        //user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to proceed");
        System.out.println("Enter 4 to exit");

        int n = sc.nextInt();

        while (n!=4) {
            System.out.println("Enter 1 to add item to the cart");
            System.out.println("Enter 2 to remove item from the cart");
            System.out.println("Enter 3 to show the items in the cart");
            System.out.println("Enter 4 to exit from the cart");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Add item to the cart");
                    System.out.println("Enter the number of items to add to the cart");
                    n = sc.nextInt();

                    for (int i = 0; i < n; i++) {
                        System.out.println("Enter the name of the item");
                        String name = sc.next();
                        System.out.println("Enter the price of the item");
                        int price = sc.nextInt();
                        cart.addItem(name, price);
                    }
                    System.out.println("Total price of the items in the cart: " + cart.calculateTotal());
                    break;
                case 2:
                    System.out.println("Remove item from the cart");
                    System.out.println("Enter the number of items to remove from the cart");
                    n = sc.nextInt();

                    for (int i = 0; i < n; i++) {
                        System.out.println("Enter the name of the item");
                        String name = sc.next();
                        System.out.println("Enter the price of the item");
                        int price = sc.nextInt();
                        cart.removeItem(name, price);
                    }
                    System.out.println("Total price of the items in the cart: " + cart.calculateTotal());
                    break;
                case 3:
                    System.out.println("Show the items in the cart");
                    cart.showCart();
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }
}
