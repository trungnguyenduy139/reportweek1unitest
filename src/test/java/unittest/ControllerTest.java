package test.java.unittest;

import main.java.unittest.State;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ControllerTest {

    ControllerMock mController;

    DoorMock mMockDoor;

    @Before
    public void setup() {
        mController = new ControllerMock();
        mMockDoor = new DoorMock();
    }

    @Test
    public void doorShouldNotBeNull () {
        mController.setDoor(mMockDoor);
        assertNotNull(mController.getDoor());
    }

    @Test
    public void doorStateShouldOnlyIsClosedOrOpened() {
        assertTrue(mMockDoor.getState() == State.CLOSED || mMockDoor.getState() == State.OPENED);
    }

}
