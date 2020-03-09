package patterns.creational;

import org.junit.gen5.api.Test;
import patterns.creational.singleton.Singleton;

import static org.junit.gen5.api.Assertions.assertTrue;


public class SingletonTest {

    @Test
    public void testSingleton() {

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        assertTrue(singleton1==singleton2);
    }

}