package it.alexius33.designpatterns.behavioural.state;

public class VendingMachine {

    private State currentState;
    private int count;

    public VendingMachine(int count) {
        if (count > 0) {
            this.currentState = IdleState.getInstance();
            this.count = count;
        } else {
            this.currentState = OutOfStockState.getInstance();
            this.count = 0;
        }
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void insertDollar() {
        currentState.insertDollar(this);
    }

    public void ejectMoney() {
        currentState.ejectMoney(this);
    }

    public void dispense() {
        currentState.dispense(this);
    }

    public void doReturnMoney() {
        System.out.println("Returning money...");
    }

    public void doReleaseProduct() {
        System.out.println("Releasing product...");
    }
}
