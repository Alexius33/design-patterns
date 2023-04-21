package it.alexius33.designpatterns.behavioural.state;

public class OutOfStockState implements State {

    private static State INSTANCE = null;

    private OutOfStockState() {
    }

    public static State getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new OutOfStockState();
        }
        return INSTANCE;
    }

    @Override
    public void insertDollar(VendingMachine vendingMachine) {
        System.out.println("Machine is currently out of stock");
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        System.out.println("Machine is currently out of stock");
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        System.out.println("Machine is currently out of stock");
    }
}
