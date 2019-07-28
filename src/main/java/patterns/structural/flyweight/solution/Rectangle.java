package patterns.structural.flyweight.solution;


public class Rectangle extends Shape {

    private String label;

    public Rectangle() {
        label = "Rectangle";
    }

    public void draw(int length, int breadth, String fillStyle) {
        System.out.println("Drawing a " + label + " length = " + length + ", fill style = "+ fillStyle
        + " breadth" + breadth );
    }
}
