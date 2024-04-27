public class EmailDriver {

    public static void main(String[] args) {

         NewEmailClient newEmailClient = new NewEmailClient();
         EmailAdapter emailAdapter = new EmailAdapter("127.0.0.1" , newEmailClient);

        emailAdapter.send("sayemomer@gmail.com"," Subject: Hello","Message: Hello from design pattern");

    }
}
