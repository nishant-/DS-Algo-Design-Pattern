package patterns.creational.factory;

public class PizzaFactory {

    public static Pizza createPizza(String type) {

        Pizza p = null;


        if(type.equals("cheese"))
            p = new PlainCheesePizza();
        else if(type.equals("chicken"))
            p = new ChickenPizza();

return p;
    }
}
