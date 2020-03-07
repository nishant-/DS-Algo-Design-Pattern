package patterns.behavioral.visitor;

public class Moon implements CelestialBody {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
