package patterns.behavioral.visitor;


public class Earth implements CelestialBody {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
