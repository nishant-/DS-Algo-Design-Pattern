package patterns.behavioral.chainofresponsibility;

public class Receiver2 extends RequestHandler {

    protected Receiver2(RequestHandler handler) {
        super(handler);
    }

    @Override
    public void handleRequest(Request req) {

        if(RequestType.REQUEST_TWO == req.getRequestType()) {
            printHandlingRequest(req);
            req.markHandled();
        }
        else {
            super.handleRequest(req);
        }

    }

    @Override
    public String toString() {
        return "Command2 ";
    }
}
