/**
 * Step 3: Context (Vending Machine)
 */

public class VendingMachine {
    private VendingMachineState idleState;
    private VendingMachineState hasMoneyState;

    private VendingMachineState currentState;

    public VendingMachine() {
        idleState = new IdleState();
        hasMoneyState = new HasMoneyState();

        currentState = idleState; // Initial state
    }

    public void setState(VendingMachineState state) {
        this.currentState = state;
    }

    public void selectProductAndInsertMoney(int amount, String productName) {
        currentState.selectProductAndInsertMoney(amount, productName);
        if (currentState instanceof IdleState) {
            setState(hasMoneyState);
            System.out.println("State changed to: HasMoney");
        }
    }

    public void dispenseProduct() {
        currentState.dispenseProduct();
        if (currentState instanceof HasMoneyState) {
            setState(idleState);
            System.out.println("State changed to: Idle");
        }
    }
}
