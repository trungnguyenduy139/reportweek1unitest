package test.java.unittest;

import main.java.unittest.State;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

public class ControllerTest {

    private ControllerStub mController;

    private DoorStub mDoor;

    @Before
    public void setup() {
        mController = new ControllerStub();
        mDoor = new DoorStub(1);
    }

    @Test
    public void doorShouldNotBeNull() {
        // exercise
        mController.setDoor(mDoor);
        assertNotNull(mController.getDoor());
    }

    @Test
    public void closeDoorMethod() {
        // exercise
        mController.closeDoor(mDoor);

        State expectedState = State.CLOSED;

        // verify
        assertSame(expectedState, mController.getCurrentState());
    }

    @Test
    public void openDoorMethod() {
        // exercise
        mController.openDoor(mDoor);

        State expectedState = State.OPENED;

        // verify
        assertSame(expectedState, mController.getCurrentState());
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionWhenDoorIsNull() {
        // exercise
        mController.setDoor(null);
        mController.getCurrentState();
    }

}
