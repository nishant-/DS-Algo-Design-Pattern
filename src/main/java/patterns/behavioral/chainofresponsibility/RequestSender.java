package patterns.behavioral.chainofresponsibility;

/**
 * Sender builds a chain of receivers to handle the request
 * The request handler will make a request on the chain to handle the request
 */


public class RequestSender {



    private RequestHandler chain;

    public RequestSender() {
        //build the chain
        buildChain();
    }

    private void buildChain() {

        chain = new Receiver1(new Receiver2(new Receiver3(null)));
    }

    public void makeRequest(Request req) {

        chain.handleRequest(req);

    }
}
