package patterns.behavioral.visitor;

/**
 *  The visitor pattern allows you to extend the interface of the primary type
 * by creating a separate class hierarchy of type Visitor to virtualize the
 * operations performed upon the primary type.
 *
 * The visitors visits the hierarchy and performs its operations on it.
 *
 */

public class App {

    public static void main(String[] args) {


        CelestialBody celestialBody[] = new CelestialBody[]{new Earth(), new Mars(), new Moon()};

        Visitor visitors[] = new Visitor[]{new SurveyorSpaceCraft(), new ObjectiveSpaceCraft("Deploy Bots")};

        for(CelestialBody c : celestialBody) {
            for(Visitor v : visitors) {
                c.accept(v);
            }
        }



    }
}
