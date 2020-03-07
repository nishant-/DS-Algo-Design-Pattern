package patterns.behavioral.visitor;

//this accepts visitors
public interface CelestialBody {

    void accept(Visitor visitor);

}
