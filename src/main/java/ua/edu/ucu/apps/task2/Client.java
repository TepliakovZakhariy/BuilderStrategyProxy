package ua.edu.ucu.apps.task2;

import java.util.concurrent.atomic.AtomicInteger;

import lombok.Builder;
import lombok.Data;

// id (this parameter should be assigned automatically in order from 0);
// name;
// age;
// sex;

@Data
@Builder
public class Client {
    private static AtomicInteger counter = new AtomicInteger();
    private final int id = counter.incrementAndGet();
    private String name;
    private int age;
    private String sex;
    private String email;
}
