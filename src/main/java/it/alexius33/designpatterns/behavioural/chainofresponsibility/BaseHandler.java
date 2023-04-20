package it.alexius33.designpatterns.behavioural.chainofresponsibility;

public abstract class BaseHandler implements FundRequestHandler {

    private FundRequestHandler nextHandler;

    public final void handle(FundRequest request) {
        if (canHandle(request)) {
            System.out.println("Funder can handle request!");
            doHandle(request);
        } else {
            System.out.println("Passing request to next handler");
            nextHandler.handle(request);
        }
    }

    @Override
    public void setNext(FundRequestHandler handler) {
        this.nextHandler = handler;
    }

    abstract boolean canHandle(FundRequest request);
    abstract void doHandle(FundRequest request);
}
