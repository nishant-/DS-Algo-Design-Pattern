package patterns.creational.factory;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class PizzaStoreTest {

    @Test
    public void orderPizza() {
        PizzaStore pizzaStore = new PizzaStore();
        Pizza p = pizzaStore.orderPizza("chicken");
        assertTrue(p instanceof ChickenPizza);
    }
}