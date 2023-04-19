package it.alexius33.designpatterns.structural.adapter.model;

public class WebClient {

    private final WebRequester webRequester;

    public WebClient(WebRequester webRequester) {
        this.webRequester = webRequester;
    }

    public void doWork() {
        final Object object = makeObject();
        final int status = webRequester.request(object);
        if (status == 200) {
            System.out.println("OK");
        } else {
            System.out.println("Not OK");
        }
    }

    private Object makeObject() {
        System.out.println("Building new Object..");
        return new Object();
    }
}
