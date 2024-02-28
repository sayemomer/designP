package BehaivioralP.Command;

public class CartInvoker {

    private CommandI slot;

    public CartInvoker() {}

    public void setCommand(CommandI command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
    
}
