package it.alexius33.designpatterns.structural.adapter;

import it.alexius33.designpatterns.structural.adapter.model.WebAdapter;
import it.alexius33.designpatterns.structural.adapter.model.WebClient;
import it.alexius33.designpatterns.structural.adapter.thirdparty.WebService;
import org.junit.jupiter.api.Test;

class AdapterTest {

    @Test
    void test() {
        final WebService webService = new WebService("https://somehost.com/");

        final WebAdapter webAdapter = new WebAdapter();
        webAdapter.connect(webService);
        final WebClient webClient = new WebClient(webAdapter);
        webClient.doWork();
    }
}