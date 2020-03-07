package patterns.behavioral.visitor;

public interface Visitor {

    void visit(Mars mars);
    void visit(Moon moon);
    void visit(Earth earth);

}
