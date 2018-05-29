package main.java.unittest;

public abstract class ControllerImp implements IController {

    protected IDoor mDoor;

    public ControllerImp() {
        mDoor = new DoorInjectorImp().provideDoor(1);
    }

    @Override
    public IDoor getDoor() {
        return mDoor;
    }

    @Override
    public void setDoor(IDoor door) {
        mDoor = door;
    }

    @Override
    public void closeDoor() {
        if (mDoor.getState() == State.OPENED)
            mDoor.setDoorState(State.CLOSED);
    }

    @Override
    public void openDoor() {
        if (mDoor.getState() == State.CLOSED)
            mDoor.setDoorState(State.OPENED);
    }

    @Override
    public State getCurrentState() {
        return mDoor.getState();
    }
}
