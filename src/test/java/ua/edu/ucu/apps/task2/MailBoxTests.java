package ua.edu.ucu.apps.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MailBoxTests {

    @Test
    public void testAddMailInfo() {
        MailBox mailBox = new MailBox();

        Client client = Client.builder()
                               .name("Alice")
                               .age(25)
                               .sex("Female")
                               .email("alice@example.com")
                               .build();

        MailInfo mailInfo = new MailInfo(client, new BirthdayMailCode());

        mailBox.addMailInfo(mailInfo);

        assertEquals(1, mailBox.getInfos().size());
    }

    @Test
    public void testSendAll() {
        MailBox mailBox = new MailBox();

        Client client1 = Client.builder()
                                .name("Alice")
                                .age(25)
                                .sex("Female")
                                .email("alice@example.com")
                                .build();
        Client client2 = Client.builder()
                                .name("Bob")
                                .age(30)
                                .sex("Male")
                                .email("bob@example.com")
                                .build();

        MailInfo mailInfo1 = new MailInfo(client1, new BirthdayMailCode());
        MailInfo mailInfo2 = new MailInfo(client2, new BirthdayMailCode());

        mailBox.addMailInfo(mailInfo1);
        mailBox.addMailInfo(mailInfo2);

        mailBox.sendAll();

        assertEquals(2, mailBox.getInfos().size());
    }
}
