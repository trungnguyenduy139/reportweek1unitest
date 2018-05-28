package test.java.unittest;

import main.java.unittest.IDoor;
import main.java.unittest.State;

public class DoorMock implements IDoor {

    private State mState = State.CLOSED;

    public static final String MOCK_DOOR = "MOCK DOOR";

    @Override
    public State getState() {
        return mState;
    }

    @Override
    public int getDoorId() {
        return 0;
    }

    @Override
    public String getDoorName() {
        return MOCK_DOOR;
    }

    @Override
    public void setDoorState(State state) {
        mState = state;
    }
}
