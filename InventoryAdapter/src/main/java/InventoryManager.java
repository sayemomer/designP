public class InventoryManager implements InventorySystem{
    @Override
    public void updateQuantity(String productID, int quantity) {
        System.out.println("Updating the product Id" +' ' + productID + ' ' +"by" + ' ' + quantity);
    }
}
