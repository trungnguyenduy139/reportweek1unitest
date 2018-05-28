package main.java.unittest;

public class FrontDoorInjector implements DoorInjector {
    @Override
    public IDoor provideDoor() {
        return new FrontDoor();
    }
}
