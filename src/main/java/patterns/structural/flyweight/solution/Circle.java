package patterns.structural.flyweight.solution;


public class Circle extends Shape {

    private String label;


    public Circle() { label = "Circle"; }


    public void draw(int radius, String fillColor, String lineColor) {
        System.out.println("Drawing a " + label + " radius = " + radius + ", fill color = "+ fillColor
        + "line color " + lineColor );
    }
}
