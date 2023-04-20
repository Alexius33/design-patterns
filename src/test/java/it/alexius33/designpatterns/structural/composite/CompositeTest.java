package it.alexius33.designpatterns.structural.composite;

import org.junit.jupiter.api.Test;

class CompositeTest {

    @Test
    void test() {
        final Housing building = new Housing("123 Street");
        final Housing floor1 = new Housing("123 Street - First floor");
        final int firstFloor = building.addStructure(floor1);

        final Room washroom1m = new Room("1F - Men's Washroom");
        final Room washroom1w = new Room("1F - Women's Washroom");
        final Room common1 = new Room("1F - Common Area");

        final int firstMens = floor1.addStructure(washroom1m);
        final int firstWomens = floor1.addStructure(washroom1w);
        final int firstCommon = floor1.addStructure(common1);

        building.enter(); // enter the building
        building.location();
        final Housing currentFloor = (Housing) building.getStructure(firstFloor);
        currentFloor.enter(); // walk into first floor
        currentFloor.location();
        Room currentRoom = (Room) currentFloor.getStructure(firstMens);
        currentRoom.enter(); // walk into men's room
        currentRoom = (Room) currentFloor.getStructure(firstCommon);
        currentRoom.enter(); // walk into common area
    }
}