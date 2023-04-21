package it.alexius33.designpatterns.behavioural.state;

public interface State {
    void insertDollar(VendingMachine vendingMachine);
    void ejectMoney(VendingMachine vendingMachine);
    void dispense(VendingMachine vendingMachine);
}
