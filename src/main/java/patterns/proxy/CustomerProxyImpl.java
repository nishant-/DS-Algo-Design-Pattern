package patterns.proxy;


import java.util.ArrayList;
import java.util.List;

public class CustomerProxyImpl implements Customer {

    private CustomerImpl customerImpl = new CustomerImpl();

    @Override
    public int getId() {
        return customerImpl.getId();
    }
    @Override
    public List<Order> getOrders() {
        List<Order> orders = new ArrayList<Order>();
        Order order1 = new Order();
        order1.setId(1);
        order1.setProductName("Book");
        order1.setQuantity(10);
        Order order2 = new Order();
        order2.setId(2);
        order2.setProductName("Kindle");
        order2.setQuantity(10);
        orders.add(order1);
        orders.add(order2);
        return orders;
    }
}
