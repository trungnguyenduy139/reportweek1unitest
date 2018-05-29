package test.java.unittest;

public class ControllerManagerStub {

    private ControllerStub mController;

    public void setController(ControllerStub controller) {
        if (controller == null)
            throw new NullPointerException();
        mController = controller;
    }

    public ControllerStub getController() {
        return mController;
    }
}
