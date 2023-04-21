package it.alexius33.designpatterns.behavioural.state;

import org.junit.jupiter.api.Test;

class StateTest {

    @Test
    void test() {
        final VendingMachine vendingMachine = new VendingMachine(1);
        vendingMachine.insertDollar();
        vendingMachine.dispense();
    }

    @Test
    void testReturnMoney() {
        final VendingMachine vendingMachine = new VendingMachine(1);
        vendingMachine.insertDollar();
        vendingMachine.doReturnMoney();
    }
}
