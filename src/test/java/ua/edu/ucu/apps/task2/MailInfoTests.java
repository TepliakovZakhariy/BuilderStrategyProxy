package ua.edu.ucu.apps.task2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MailInfoTests {

    @Test
    public void testMailInfoGenerateBirthdayMail() {
        Client client = Client.builder()
                               .name("Alice")
                               .age(25)
                               .sex("Female")
                               .email("alice@example.com")
                               .build();

        MailCode birthdayMailCode = new BirthdayMailCode();
        MailInfo mailInfo = new MailInfo(client, birthdayMailCode);

        String expected = "Hello Alice! Happy 25th birthday!";
        assertEquals(expected, mailInfo.generate());
    }
}
