package test.java.unittest;

import main.java.unittest.DoorInjector;
import main.java.unittest.IDoor;

public class InjectorStub implements DoorInjector {

    @Override
    public IDoor provideDoor(int doorId) {
        return new DoorStub(doorId);
    }
}
