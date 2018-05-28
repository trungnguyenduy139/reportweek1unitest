package test.java.unittest;

import main.java.unittest.IDoor;
import main.java.unittest.State;

public class DoorStub implements IDoor {

    private State mState = State.CLOSED; //default door state
    public static final String NULL_STATE_EXCEPTION_MSG = "null state exception msg";
    private int mDoorId;

    public DoorStub(int doorId) {
        mDoorId = doorId;
    }

    private static final String MOCK_DOOR = "Mock door ";

    @Override
    public State getState() {
        return mState;
    }

    @Override
    public int getDoorId() {
        return mDoorId;
    }

    @Override
    public String getDoorName() {
        return MOCK_DOOR + mDoorId;
    }

    @Override
    public void setDoorState(State state) {
        if (state == null) {
            throw new NullPointerException(NULL_STATE_EXCEPTION_MSG);
        }
        mState = state;
    }

    @Override
    public String getDoorStateStringType() {
        return getState() == State.OPENED ? getDoorName() + " Opened" : getDoorName()+ " Closed";
    }
}
