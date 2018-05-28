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
        mDoor = new DoorStub();
    }

    @Test
    public void doorShouldNotBeNull() {
        // exercise
        mController.setDoor(mDoor);
        assertNotNull(mController.getDoor());
    }

    @Test
    public void closeDoorMethodShouldWorkFine() {
        // exercise
        mController.setDoor(mDoor);
        mController.closeDoor();

        State expectedState = State.CLOSED;

        // verify
        assertSame(expectedState, mController.getCurrentState());
    }

    @Test
    public void openDoorMethodShouldWorkFine() {
        // exercise
        mController.setDoor(mDoor);
        mController.openDoor();

        State expectedState = State.OPENED;

        // verify
        assertSame(expectedState, mController.getCurrentState());
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenDoorNull() {
        // exercise
        mController.setDoor(null);
        mController.getCurrentState();
    }

}
