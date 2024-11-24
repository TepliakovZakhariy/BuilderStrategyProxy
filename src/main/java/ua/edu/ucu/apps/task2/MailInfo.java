package ua.edu.ucu.apps.task2;

import lombok.AllArgsConstructor;
import lombok.Data;

// client (Client object);
// mailCode (a parameter that specifies the type of email, for example, a birthday greeting or a gift letter).

@Data
@AllArgsConstructor
public class MailInfo {
    private Client client;
    private MailCode mailCode;

    public String generate() {
        return mailCode.generate(client);
    }
}
