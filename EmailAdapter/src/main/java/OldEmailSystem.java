public class OldEmailSystem {
    private String serverAddress;

    public OldEmailSystem(String serverAddress) {
        this.serverAddress = serverAddress;
    }

    public void send(String to, String subject, String message) {
        System.out.println(to + ' ' + subject + ' ' + message);
    }
}