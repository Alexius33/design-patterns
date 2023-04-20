package it.alexius33.designpatterns.behavioural.chainofresponsibility;

import java.math.BigDecimal;

public class Funder extends BaseHandler {

    private final BigDecimal maxFundableAmount;

    public Funder(BigDecimal maxFundableAmount) {
        this.maxFundableAmount = maxFundableAmount;
    }

    @Override
    protected boolean canHandle(FundRequest fundRequest) {
        return fundRequest.getAmount().compareTo(maxFundableAmount) <= 0;
    }

    @Override
    protected void doHandle(FundRequest fundRequest) {
        System.out.println("Funder with budget " + maxFundableAmount + " has funded the project");
    }
}
