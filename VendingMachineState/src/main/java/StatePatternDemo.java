/**
 * Step 4: Using the Vending Machine
 */

public class StatePatternDemo {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.selectProductAndInsertMoney(50, "Chips");
        vendingMachine.dispenseProduct();

        // Trying to dispense without selecting product and inserting money
        vendingMachine.dispenseProduct();
    }
}