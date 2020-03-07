package patterns.behavioral.visitor;

public class ObjectiveSpaceCraft implements Visitor {


    private String objective;

    public ObjectiveSpaceCraft(String objective) {
        this.objective = objective;
    }


    @Override
    public void visit(Mars mars) {

        System.out.println("Objective spacecraft visiting mars to " + this.objective);
    }

    @Override
    public void visit(Moon moon) {

        System.out.println("Objective spacecraft visiting moon to " + this.objective);
    }

    @Override
    public void visit(Earth earth) {
        System.out.println("Objective spacecraft visiting earth to " + this.objective);
        if("Deploy Bots".equals(this.objective)) {
            System.out.println("Abort immediately...");
            return;
        }
        System.out.println("With an objective to " + this.objective);
    }
}
