package patterns.structural.flyweight.solution;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    private static Map<String, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String type) {

        Shape shape = null;
        if (shapeMap.get(type) != null) {
            shape = shapeMap.get(type);
        }
        else {
            if ("Rectangle".equals(type)) {
                shape = new Rectangle();
            } else if ("Circle".equals(type)) {
                shape = new Circle();
            }
            shapeMap.put(type, shape);
        }
        return shape;
    }
}
