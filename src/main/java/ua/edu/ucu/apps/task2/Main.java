package ua.edu.ucu.apps.task2;

public class Main {
    public static void main(String[] args) {
        Client client = Client.builder()
                .name("John")
                .age(25).email("test@test").build();

        MailInfo mailInfo = new MailInfo(client, client1 -> "Hello random mail" + client1.getEmail());

        MailSender mailSender = new MailSender();
        mailSender.sendMail(mailInfo);
    }
}
