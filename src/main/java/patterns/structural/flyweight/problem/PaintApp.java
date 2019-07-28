package patterns.structural.flyweight.problem;

public class PaintApp {


    //the problem with this approach is that
    //it creates multiple objects
    //this can be solved using flyweight pattern by following the below steps
    // 1. separate the extrinsic state. eg. in Rectangle class the lenght breadth and fillStyle are extrinsic
    // 2. pass them as parameters
    // 3. create a factory class
    public void render(int numOfShapes) {

        Shape [] shapes = new Shape[numOfShapes];

        for(int i = 0; i < shapes.length ; i++) {
            if(i % 2 == 0) {
                shapes[i] = new Circle();
                ((Circle)shapes[i]).setRadius(i);
                ((Circle)shapes[i]).setFillColor("white");
                ((Circle)shapes[i]).setLineColor("red");
                shapes[i].draw();
            } else {
                shapes[i] = new Rectangle();
                ((Rectangle)shapes[i]).setLength(i);
                ((Rectangle)shapes[i]).setBreadth(i + 1);
                ((Rectangle)shapes[i]).setFillStyle("dotted");
                shapes[i].draw();
            }
        }
    }
}
