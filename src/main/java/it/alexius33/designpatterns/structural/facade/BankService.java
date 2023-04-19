package it.alexius33.designpatterns.structural.facade;

import it.alexius33.designpatterns.structural.facade.model.*;

import java.math.BigDecimal;
import java.util.HashMap;

public class BankService {
    private final HashMap<Integer, IAccount> bankAccounts;

    public BankService() {
        this.bankAccounts = new HashMap<>();
    }

    public int createNewAccount(AccountType type, BigDecimal initAmount) {
        final IAccount newAccount;
        switch (type) {
            case CHEQUING:
                newAccount = new Chequing(initAmount);
                break;
            case SAVING:
                newAccount = new Saving(initAmount);
                break;
            case INVESTMENT:
                newAccount = new Investment(initAmount);
                break;
            default:
                throw new IllegalArgumentException("Invalid accountType: " + type);
        }
        final int accountNumber = newAccount.getAccountNumber();
        bankAccounts.put(accountNumber, newAccount);
        return accountNumber;
    }

    public void transferMoney(int from, int to, BigDecimal amount){
        final IAccount fromAccount = this.bankAccounts.get(from);
        final IAccount toAccount = this.bankAccounts.get(to);
        fromAccount.withdraw(amount);
        toAccount.transfer(amount);
    }

    public BigDecimal getBalance(int account) {
        return this.bankAccounts.get(account).getBalance();
    }
}
