package main.java.unittest;

public class Door implements IDoor {

    public static final String NULL_STATE_EXCEPTION_MSG = "null state exception msg";
    private State mState = State.CLOSED; // default door state
    private int mDoorId;

    public Door(int doorId) {
        mDoorId = doorId;
    }

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
        return "Door " + mDoorId;
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
        if (getState() == null)
            throw new NullPointerException(NULL_STATE_EXCEPTION_MSG);
        return getState() == State.OPENED ? getDoorName() +" Opened" : getDoorName()+ " Closed";
    }
}
