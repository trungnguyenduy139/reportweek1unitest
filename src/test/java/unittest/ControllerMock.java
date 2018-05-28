package test.java.unittest;

import main.java.unittest.Controller;
import main.java.unittest.IDoor;
import main.java.unittest.State;

public class ControllerMock extends Controller {
    @Override
    public IDoor getDoor() {
        return super.getDoor();
    }

    @Override
    public void setDoor(IDoor door) {
        super.setDoor(door);
    }

    public State getCurrentState() {
        return mDoor.getState();
    }
}
