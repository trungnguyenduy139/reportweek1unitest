package main.java.unittest;

public class Controller {
    protected IDoor mDoor;

    // empty constructor
    public Controller() {

    }

    public void setDoor(IDoor door) {
        mDoor = door;
    }

    public IDoor getDoor() {
        return mDoor;
    }

    public void closeDoor(IDoor door) {
        mDoor = door;
        if (mDoor.getState() == State.OPENED)
            mDoor.setDoorState(State.CLOSED);
    }

    public void openDoor(IDoor door) {
        mDoor = door;
        if (mDoor.getState() == State.CLOSED) {
            mDoor.setDoorState(State.OPENED);
        }
    }

    public State getCurrentState() {
        if (mDoor == null)
            throw new IllegalArgumentException();
        return mDoor.getState();
    }
}
