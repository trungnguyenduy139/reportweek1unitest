package main.java.unittest;

public class DoorInjectorImp implements DoorInjector {
    @Override
    public IDoor provideDoor(int doorId) {
        return new Door(doorId);
    }
}
