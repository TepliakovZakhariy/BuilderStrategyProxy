package ua.edu.ucu.apps.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ProxyImageTests {

    @Test
    public void testLazyLoading() {
        ProxyImage proxyImage = new ProxyImage("test.jpg");

        assertNull(proxyImage.getRealImage());

        proxyImage.display();

        assertNotNull(proxyImage.getRealImage());
    }

    @Test
    public void testDisplayCalledTwice() {
        ProxyImage proxyImage = new ProxyImage("test.jpg");

        assertNull(proxyImage.getRealImage());

        proxyImage.display();
        proxyImage.display();

        assertNotNull(proxyImage.getRealImage());
    }
}
