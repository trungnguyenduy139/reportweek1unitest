package test.java.unittest;

import main.java.unittest.Controller;
import main.java.unittest.IDoor;
import main.java.unittest.State;

public class ControllerStub extends Controller {
    @Override
    public IDoor getDoor() {
        return super.getDoor();
    }

    @Override
    public void setDoor(IDoor door) {
        super.setDoor(door);
    }

    public State getCurrentState() {
        if (mDoor == null)
            throw new IllegalArgumentException();
        return mDoor.getState();
    }
}
