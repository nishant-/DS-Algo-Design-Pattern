package patterns.behavioral.chainofresponsibility;

public abstract class RequestHandler {

    private RequestHandler next;

    protected RequestHandler(RequestHandler next) {
        this.next = next;
    }

    public void handleRequest(Request req) {

        if(next != null) {
            next.handleRequest(req);
        }
    }

    protected void printHandlingRequest(Request req) {
        System.out.println(this + "Handling " + req);
    }



}
