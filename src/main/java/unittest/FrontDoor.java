package main.java.unittest;

public class FrontDoor implements IDoor {

    boolean mIsOpened = false;

    State mState = State.CLOSED;

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
        return "Front Door";
    }

    @Override
    public void setDoorState(State state) {
        mState = state;
    }
}