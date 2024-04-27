// Idle State
public class IdleState implements VendingMachineState {
    @Override
    public void selectProductAndInsertMoney(int amount, String productName) {
        System.out.println(amount + " received and " + productName + " selected.");
        // Transition to HasMoney state
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Please select product and add money first.");
    }
}

