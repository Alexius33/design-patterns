package it.alexius33.designpatterns.behavioural.state;

public class IdleState implements State {

    private static IdleState INSTANCE = null;

    private IdleState() {
    }

    public static IdleState getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new IdleState();
        }
        return INSTANCE;
    }

    @Override
    public void insertDollar(VendingMachine vendingMachine) {
        System.out.println("Dollar inserted");
        vendingMachine.setCurrentState(HasOneDollarState.getInstance());
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        System.out.println("No money to return");
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        System.out.println("Payment required");
    }
}
