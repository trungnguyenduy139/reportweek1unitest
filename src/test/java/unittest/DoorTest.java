package test.java.unittest;

import main.java.unittest.IDoor;
import main.java.unittest.State;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.instanceOf;


import static org.junit.Assert.*;

public class DoorTest {
    private IDoor mDoor;

    @Rule
    public final ExpectedException thrown = ExpectedException.none();

    @Before
    public void setup() {
        // setup phase
        mDoor = new DoorStub(1);
    }

    @Test
    public void openDoor (){
        State expectedState = State.OPENED;
        // exercise phase
        mDoor.setDoorState(State.OPENED);
        // verify phase
        assertSame(expectedState, mDoor.getState());
    }

    @Test
    public void closeDoor (){
        State expectedState = State.CLOSED;
        // exercise phase
        mDoor.setDoorState(State.CLOSED);
        // verify phase
        assertSame(expectedState, mDoor.getState());
    }

    @Test
    public void doorStateShouldOnlyIsClosedOrOpened() {
        // verify phase
        assertTrue(mDoor.getState() == State.CLOSED || mDoor.getState() == State.OPENED);
    }

    @Test
    public void doorNameShouldNotBeNull () {
        // verify
        assertNotNull(mDoor.getDoorName());
    }

    @Test
    public void doorNameShouldBeString () {
        // verify
        assertThat(mDoor.getDoorName(), instanceOf(String.class));
    }

    @Test
    public void doorIdShouldBeInt() {
        // verify
        assertThat(mDoor.getDoorId(), instanceOf(Integer.class));
    }

    @Test
    public void doorIdShouldBeCorrectedValue() {
        // verify
        assertTrue(mDoor.getDoorId() == 1 || mDoor.getDoorId() == 2);
    }

    @Test
    public void shouldThrowNullPointerExceptionWhenDoorStateIsNull() {
        // Using ExpectedException rule to verify an exception
       thrown.expect(NullPointerException.class);
       thrown.expectMessage(DoorStub.NULL_STATE_EXCEPTION_MSG);
       mDoor.setDoorState(null);
    }

    @Test
    public void doorStateStringTypeShouldBeString() {
        // verify
        assertThat(mDoor.getDoorStateStringType(), instanceOf(String.class));
    }

    @Test
    public void doorStateShouldBeCorrectedFormat() {
        // verify
        assertThat(mDoor.getState(), instanceOf(State.class));
    }
}
