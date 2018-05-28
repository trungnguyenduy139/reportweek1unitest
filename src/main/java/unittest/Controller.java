package main.java.unittest;

public class Controller {
    protected IDoor mDoor;

    public Controller() {

    }

    public void setDoor(IDoor door) {
        mDoor = door;
    }

    public IDoor getDoor() {
        return mDoor;
    }

    public void closeDoor() {
        if (mDoor.getState() == State.OPENED)
            mDoor.setDoorState(State.CLOSED);
    }

    public void openDoor() {
        if (mDoor.getState() == State.CLOSED) {
            mDoor.setDoorState(State.OPENED);
        }
    }
}
