package patterns.structural.flyweight.solution;

import patterns.structural.flyweight.problem.Circle;
import patterns.structural.flyweight.problem.Rectangle;

public class PaintApp {


    public void render(int numOfShapes) {
        Shape shape = null;
        for(int i = 1 ; i <= numOfShapes ; i ++) {
            if(i % 2 == 0) {
                shape = ShapeFactory.getShape("Circle");
                shape.draw(i, "red", "white");
            }
            else {
                shape = ShapeFactory.getShape("Rectangle");
                shape.draw(i , i + i , "dotted");
            }

        }
    }
}
