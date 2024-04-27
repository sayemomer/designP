public class EmailAdapter extends OldEmailSystem{

    NewEmailClient newEmailClient;

    String serverAddress;
    public EmailAdapter(String serverAddress, NewEmailClient newEmailClient) {
        super(serverAddress);
        this.serverAddress = serverAddress;
        this.newEmailClient = newEmailClient;
    }

    @Override
    public void send(String to, String subject, String message) {
        newEmailClient.connectToServer(serverAddress);
        newEmailClient.sendEmail(to,subject,message);
    }
}
