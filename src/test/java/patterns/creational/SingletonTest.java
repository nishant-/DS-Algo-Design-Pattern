package patterns.creational;

import org.junit.jupiter.api.Test;
import patterns.creational.singleton.Singleton;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class SingletonTest {

    @Test
    public void testSingleton() {

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        assertTrue(singleton1==singleton2);
    }

}