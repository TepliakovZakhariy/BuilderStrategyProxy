package ua.edu.ucu.apps.task2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ClientTests {

    @Test
    public void testClientName() {
        Client client = Client.builder()
                               .name("Alice")
                               .age(22)
                               .sex("Female")
                               .email("alice@example.com")
                               .build();

        assertEquals("Alice", client.getName());
    }

    @Test
    public void testClientAge() {
        Client client = Client.builder()
                               .name("Bob")
                               .age(40)
                               .sex("Male")
                               .email("bob@example.com")
                               .build();

        assertEquals(40, client.getAge());
    }

    @Test
    public void testClientSex() {
        Client client = Client.builder()
                               .name("Charlie")
                               .age(35)
                               .sex("Non-Binary")
                               .email("charlie@example.com")
                               .build();

        assertEquals("Non-Binary", client.getSex());
    }

    @Test
    public void testClientEmail() {
        Client client = Client.builder()
                               .name("Diana")
                               .age(28)
                               .sex("Female")
                               .email("diana@example.com")
                               .build();

        assertEquals("diana@example.com", client.getEmail());
    }
}
