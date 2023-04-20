package it.alexius33.designpatterns.behavioural.chainofresponsibility;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class ChainOfResponsibilityTest {

    @Test
    void test() {
        final FundRequest request = new FundRequest(new BigDecimal("1000"));

        final Funder tenFounder = new Funder(new BigDecimal("10"));
        final Funder hundredFounder = new Funder(new BigDecimal("100"));
        final Funder thousandFounder = new Funder(new BigDecimal("1000"));
        final Funder tenThousandFounder = new Funder(new BigDecimal("10000"));

        tenFounder.setNext(hundredFounder);
        hundredFounder.setNext(thousandFounder);
        thousandFounder.setNext(tenThousandFounder);

        tenFounder.handle(request);
    }
}
