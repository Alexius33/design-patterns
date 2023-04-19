package it.alexius33.designpatterns.structural.facade.model;

import java.math.BigDecimal;
import java.util.Random;

public class Chequing implements IAccount {

    private final int accountNumber;
    private BigDecimal balance;

    public Chequing() {
        this(new Random().nextInt(Integer.MAX_VALUE), BigDecimal.ZERO);
    }

    public Chequing(int accountNumber) {
        this(accountNumber, BigDecimal.ZERO);
    }

    public Chequing(BigDecimal balance) {
        this(new Random().nextInt(Integer.MAX_VALUE), balance);
    }

    public Chequing(int accountNumber, BigDecimal balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public void deposit(BigDecimal amount) {
        System.out.printf("Chequing account: %s, depositing: %s\n", getAccountNumber(), amount);
        this.balance = this.balance.add(amount);
    }

    @Override
    public void withdraw(BigDecimal amount) {
        System.out.printf("Chequing account: %s, withdrawing: %s\n", getAccountNumber(), amount);
        this.balance = this.balance.subtract(amount);
    }

    @Override
    public void transfer(BigDecimal amount) {
        System.out.printf("Chequing account: %s, transferring: %s\n", getAccountNumber(), amount);
        this.balance = this.balance.subtract(amount);
    }

    @Override
    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public BigDecimal getBalance() {
        return balance;
    }
}
