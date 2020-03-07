package patterns.behavioral.chainofresponsibility;

public class Receiver1 extends RequestHandler {

    protected Receiver1(RequestHandler handler) {
        super(handler);
    }

    @Override
    public void handleRequest(Request req) {

        if(RequestType.REQUEST_ONE == req.getRequestType()) {
            printHandlingRequest(req);
            req.markHandled();
        }
        else {
            super.handleRequest(req);
        }

    }

    @Override
    public String toString() {
        return "Command1 ";
    }
}
