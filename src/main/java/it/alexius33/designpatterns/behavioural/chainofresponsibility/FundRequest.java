package it.alexius33.designpatterns.behavioural.chainofresponsibility;

import java.math.BigDecimal;

public class FundRequest {

    private BigDecimal amount;

    public FundRequest(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
