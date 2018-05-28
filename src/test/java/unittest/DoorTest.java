package test.java.unittest;

import main.java.unittest.IDoor;
import main.java.unittest.State;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.instanceOf;


import static org.junit.Assert.*;

public class DoorTest {
    private IDoor mDoor;

    @Before
    public void setup() {
        // setup phase
        mDoor = new DoorStub();
    }

    @Test
    public void shouldOpenedState (){
        State expectedState = State.OPENED;
        // exercise phase
        mDoor.setDoorState(State.OPENED);
        // verify phase
        assertSame(expectedState, mDoor.getState());
    }

    @Test
    public void shouldClosedState (){
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
    public void doorNameShouldInstanceOfString () {
        // verify
        assertThat(mDoor.getDoorName(), instanceOf(String.class));
    }

    @Test
    public void doorIdShouldBeInt() {
        // verify
        assertThat(mDoor.getDoorId(), instanceOf(Integer.class));
    }

    @Test
    public void doorIdShouldIsOneOrZero() {
        // verify
        assertEquals(0, mDoor.getDoorId());
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenStateNull() {
        mDoor.setDoorState(null);
    }

    @Test
    public void doorStateStringTypeShouldBeString() {
        // verify
        assertThat(mDoor.getDoorStateStringType(), instanceOf(String.class));
    }

    @Test
    public void doorStateShouldBeCorrectFormat() {
        // verify
        assertThat(mDoor.getState(), instanceOf(State.class));
    }
}
