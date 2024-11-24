package ua.edu.ucu.apps.task2;

public class BirthdayMailCode implements MailCode {
    @Override
    public String generate(Client client) {
        return String.format("Hello %s! Happy %dth birthday!", client.getName(), client.getAge());
    }
    
}
