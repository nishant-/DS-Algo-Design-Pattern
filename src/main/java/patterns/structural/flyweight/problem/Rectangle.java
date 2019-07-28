package patterns.structural.flyweight.problem;

public class Rectangle implements Shape {

    private String fillStyle;
    private String label;
    private int length;
    private int breadth;

    public Rectangle() {
        label = "Rectangle";
    }

    public String getFillStyle() {
        return fillStyle;
    }

    public void setFillStyle(String fillStyle) {
        this.fillStyle = fillStyle;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + label + " length = " + length + ", fill style = "+ fillStyle
        + " breadth" + breadth );
    }
}
