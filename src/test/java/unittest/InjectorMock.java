package test.java.unittest;

import main.java.unittest.DoorInjector;
import main.java.unittest.IDoor;

public class InjectorMock implements DoorInjector {
    @Override
    public IDoor provideDoor() {
        return new DoorMock();
    }
}
