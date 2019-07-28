package patterns.structural.flyweight.problem;

public class Circle implements Shape {

    private String fillColor;
    private String lineColor;
    private String label;
    private int radius;

    public String getFillColor() {
        return fillColor;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    public String getLineColor() {
        return lineColor;
    }

    public void setLineColor(String lineColor) {
        this.lineColor = lineColor;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle () {
        label = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + label + " radius = " + radius + ", fill color = "+ fillColor
        + "line color " + lineColor );
    }
}
