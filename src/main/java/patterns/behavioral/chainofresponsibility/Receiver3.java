package patterns.behavioral.chainofresponsibility;

public class Receiver3 extends RequestHandler {

    protected Receiver3(RequestHandler handler) {
        super(handler);
    }

    @Override
    public void handleRequest(Request req) {

        if(RequestType.REQUEST_THREE == req.getRequestType()) {
            printHandlingRequest(req);
            req.markHandled();
        }
        else {
            super.handleRequest(req);
        }

    }

    @Override
    public String toString() {
        return "Command3 ";
    }
}
