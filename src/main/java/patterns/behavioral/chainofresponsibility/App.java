package patterns.behavioral.chainofresponsibility;

public class App {

    public static void main(String[] args) {

        RequestSender requestSender = new RequestSender();
        requestSender.makeRequest(new Request(RequestType.REQUEST_ONE, "Request1"));
        requestSender.makeRequest(new Request(RequestType.REQUEST_TWO, "Request2"));
        requestSender.makeRequest(new Request(RequestType.REQUEST_THREE, "Request3"));


    }
}
