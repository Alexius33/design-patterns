package it.alexius33.designpatterns.structural.facade.example;

import it.alexius33.designpatterns.structural.facade.BankService;

import java.math.BigDecimal;

import static it.alexius33.designpatterns.structural.facade.model.AccountType.INVESTMENT;
import static it.alexius33.designpatterns.structural.facade.model.AccountType.SAVING;

public class Main {

    public static void main(String[] args) {
        //acts as a facade for banking operations
        final BankService bankService = new BankService();

        final int mySaving = bankService.createNewAccount(SAVING, new BigDecimal("500"));
        final BigDecimal mySavingBalance = bankService.getBalance(mySaving);
        System.out.println("Saving balance: " + mySavingBalance);

        final int myInvestment = bankService.createNewAccount(INVESTMENT, new BigDecimal("1000"));
        final BigDecimal myInvestmentBalance = bankService.getBalance(myInvestment);
        System.out.println("Investment balance: " + myInvestmentBalance);

        bankService.transferMoney(mySaving, myInvestment, new BigDecimal(200));
        System.out.println("Transferred 200 from saving to investment account");

        final BigDecimal newSavingBalance = bankService.getBalance(mySaving);
        System.out.println("New saving balance: " + newSavingBalance);
        final BigDecimal newInvestmentBalance = bankService.getBalance(myInvestment);
        System.out.println("New investment balance: " + newInvestmentBalance);

    }
}
