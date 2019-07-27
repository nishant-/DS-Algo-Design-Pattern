package patterns.creational;


import org.junit.Assert;
import org.junit.Test;


public class SingletonTest {

    @Test
    public void testSingleton() {

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        Assert.assertTrue(singleton1==singleton2);
    }

}