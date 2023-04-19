package it.alexius33.designpatterns.structural.adapter.model;

import it.alexius33.designpatterns.structural.adapter.thirdparty.WebService;

public class WebAdapter implements WebRequester {

    private WebService webService;

    public void connect(WebService webService) {
        this.webService = webService;
    }

    @Override
    public int request(Object object) {
        final String json = this.toJson(object);
        final String response = webService.handleRequest(json);
        if (response != null) {
            return 200;
        }
        return 500;
    }

    private String toJson(Object object) {
        System.out.println("Serialising object into JSON..");
        return "{\"someKey\": \"someValue\"}";
    }
}


