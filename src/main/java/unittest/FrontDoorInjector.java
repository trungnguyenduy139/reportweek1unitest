package main.java.unittest;

public class FrontDoorInjector implements DoorInjector {
    @Override
    public IDoor provideDoor(int doorId) {
        return new FrontDoor(doorId);
    }
}
