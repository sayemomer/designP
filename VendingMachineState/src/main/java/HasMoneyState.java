// HasMoney State
public class HasMoneyState implements VendingMachineState {
    @Override
    public void selectProductAndInsertMoney(int amount, String productName) {
        System.out.println("Already have money. Please wait for the product to be dispensed.");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Dispensing product.");
        // Transition to Idle state
    }
}