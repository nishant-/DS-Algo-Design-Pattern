package patterns.behavioral.visitor;

public class Mars implements CelestialBody {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
