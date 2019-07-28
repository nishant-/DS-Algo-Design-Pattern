package patterns.structural.flyweight.solution;

/**
 * flyweight patterns can help solve this problem of creating large number of similar objects
 * hence helps in saving the memory
 * */
public abstract class Shape {

    public void draw(int radius, String fillColor, String lineColor){}

    public void draw(int lenght, int breadth, String fillStyle){}
}
