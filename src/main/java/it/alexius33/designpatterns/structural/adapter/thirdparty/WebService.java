package it.alexius33.designpatterns.structural.adapter.thirdparty;

public class WebService {

    private final String host;

    public WebService(String host) {
        this.host = host;
    }

    public String handleRequest(String json) {
        System.out.printf("Third party WebService is sending the request: %s to host: %s\n", json, host);
        return "{\"status\": \"OK\"}";
    }
}
