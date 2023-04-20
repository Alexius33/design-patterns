package it.alexius33.designpatterns.behavioural.chainofresponsibility;

public interface FundRequestHandler {
    void setNext(FundRequestHandler handler);
    void handle(FundRequest fundRequest);
}
