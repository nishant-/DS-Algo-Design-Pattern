package patterns.creational.builder;

import java.math.BigDecimal;

public class App {

    public static void main(String[] args) {

        ComplexObject complexObject = new ComplexObject.Builder().bigDecimalProperty(new BigDecimal("0.00"))
                .booleanProperty(true).intProperty(21).stringProperty("Builder-example").build();
        System.out.println(complexObject);
    }
}
