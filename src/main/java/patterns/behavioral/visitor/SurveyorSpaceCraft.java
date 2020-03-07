package patterns.behavioral.visitor;

public class SurveyorSpaceCraft implements Visitor {


    @Override
    public void visit(Mars mars) {
        System.out.println("Surveyor visiting mars");
    }

    @Override
    public void visit(Moon moon) {

        System.out.println("Surveyor visiting moon");
    }

    @Override
    public void visit(Earth earth) {
        System.out.println("Surveyor visiting earth");
    }
}
