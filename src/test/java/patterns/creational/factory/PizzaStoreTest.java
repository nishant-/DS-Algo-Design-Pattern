package patterns.creational.factory;

import org.junit.gen5.api.Test;

import static org.junit.gen5.api.Assertions.assertTrue;

public class PizzaStoreTest {

    @Test
    public void orderPizza() {

        PizzaStore pizzaStore = new PizzaStore();
        Pizza p = pizzaStore.orderPizza("chicken");
        assertTrue(p instanceof ChickenPizza);


    }
}