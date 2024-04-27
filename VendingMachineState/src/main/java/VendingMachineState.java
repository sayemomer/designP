/**
 * State Interface
 */

public interface VendingMachineState {
    void selectProductAndInsertMoney(int amount, String productName);
    void dispenseProduct();
}