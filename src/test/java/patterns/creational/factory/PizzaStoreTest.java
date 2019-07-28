package patterns.creational.factory;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PizzaStoreTest {

    @Test
    public void orderPizza() {

        PizzaStore pizzaStore = new PizzaStore();
        Pizza p = pizzaStore.orderPizza("chicken");
        Assert.assertTrue(p instanceof ChickenPizza);


    }
}