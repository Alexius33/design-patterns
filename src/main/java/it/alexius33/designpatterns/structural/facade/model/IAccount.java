package it.alexius33.designpatterns.structural.facade.model;

import java.math.BigDecimal;

public interface IAccount {
    void deposit(BigDecimal amount);

    void withdraw(BigDecimal amount);

    void transfer(BigDecimal amount);

    int getAccountNumber();

    BigDecimal getBalance();
}
