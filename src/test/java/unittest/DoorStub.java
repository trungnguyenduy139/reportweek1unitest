package test.java.unittest;

import main.java.unittest.IDoor;
import main.java.unittest.State;

public class DoorStub implements IDoor {

    private State mState = State.CLOSED; //default door state

    private static final String MOCK_DOOR = "MOCK DOOR";

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
        if (state == null) {
            throw new IllegalArgumentException();
        }
        mState = state;
    }

    @Override
    public String getDoorStateStringType() {
        return getState() == State.OPENED ? "Door Opened" : "Door closed";
    }
}
