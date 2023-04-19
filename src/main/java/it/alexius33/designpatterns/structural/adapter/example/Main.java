package it.alexius33.designpatterns.structural.adapter.example;

import it.alexius33.designpatterns.structural.adapter.model.WebAdapter;
import it.alexius33.designpatterns.structural.adapter.model.WebClient;
import it.alexius33.designpatterns.structural.adapter.thirdparty.WebService;

public class Main {

    public static void main(String[] args) {
        final WebService webService = new WebService("https://somehost.com/");

        final WebAdapter webAdapter = new WebAdapter();
        webAdapter.connect(webService);
        final WebClient webClient = new WebClient(webAdapter);
        webClient.doWork();
    }
}
