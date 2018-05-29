package main.java.unittest;

public class ControllerManager {

    private IController mController;

    public ControllerManager(IController controller) {
        mController = controller;
    }

    public void setController(IController controller) {
        if (controller == null)
            throw new NullPointerException();
        mController = controller;
    }

    public IController getController() {
        return mController;
    }

    public void closeDoor() {
        mController.closeDoor();
    }

    public void openDoor() {
        mController.openDoor();
    }

    public void setDoor(IDoor door) {
        mController.setDoor(door);
    }
}
