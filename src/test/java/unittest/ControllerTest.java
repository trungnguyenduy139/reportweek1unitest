package test.java.unittest;

import main.java.unittest.State;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

public class ControllerTest {

    private ControllerMock mController;

    private DoorMock mMockDoor;

    @Before
    public void setup() {
        mController = new ControllerMock();
        mMockDoor = new DoorMock();
    }

    @Test
    public void doorShouldNotBeNull() {
        // exercise
        mController.setDoor(mMockDoor);
        assertNotNull(mController.getDoor());
    }

    @Test
    public void closeDoorMethodShouldWorkFine() {
        // exercise
        mController.setDoor(mMockDoor);
        mController.closeDoor();

        State expectedState = State.CLOSED;

        // verify
        assertSame(expectedState, mController.getCurrentState());
    }

    @Test
    public void openDoorMethodShouldWorkFine() {
        // exercise
        mController.setDoor(mMockDoor);
        mController.openDoor();

        State expectedState = State.OPENED;

        // verify
        assertSame(expectedState, mController.getCurrentState());
    }

}
