package it.alexius33.designpatterns.behavioural.state;

public class HasOneDollarState implements State {

    private static HasOneDollarState INSTANCE = null;

    private HasOneDollarState() {
    }

    public static HasOneDollarState getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new HasOneDollarState();
        }
        return INSTANCE;
    }

    @Override
    public void insertDollar(VendingMachine vendingMachine) {
        System.out.println("Money already in");
        vendingMachine.doReturnMoney();
        vendingMachine.setCurrentState(IdleState.getInstance());
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        System.out.println("Returning money");
        vendingMachine.doReturnMoney();
        vendingMachine.setCurrentState(IdleState.getInstance());
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        System.out.println("Dispensing product");
        if(vendingMachine.getCount() > 1) {
            vendingMachine.doReleaseProduct();
            vendingMachine.setCurrentState(IdleState.getInstance());
        } else {
            vendingMachine.doReleaseProduct();
            vendingMachine.setCurrentState(OutOfStockState.getInstance());
        }
    }
}
