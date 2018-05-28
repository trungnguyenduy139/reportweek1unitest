package test.java.unittest;

import main.java.unittest.IDoor;
import main.java.unittest.State;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.instanceOf;


import static org.junit.Assert.*;

public class DoorTest {
    private IDoor mDoorMock;

    @Before
    public void setup() {
        // setup phase
        mDoorMock = new DoorMock();
    }

    @Test
    public void shouldOpenedState (){
        State expectedState = State.OPENED;
        // exercise phase
        mDoorMock.setDoorState(State.OPENED);
        // verify phase
        assertSame(expectedState, mDoorMock.getState());
    }

    @Test
    public void shouldClosedState (){
        State expectedState = State.CLOSED;
        // exercise phase
        mDoorMock.setDoorState(State.CLOSED);
        // verify phase
        assertSame(expectedState, mDoorMock.getState());
    }

    @Test
    public void doorStateShouldOnlyIsClosedOrOpened() {
        // verify phase
        assertTrue(mDoorMock.getState() == State.CLOSED || mDoorMock.getState() == State.OPENED);
    }

    @Test
    public void doorNameShouldNotBeNull () {
        // verify
        assertNotNull(mDoorMock.getDoorName());
    }

    @Test
    public void doorNameShouldInstanceOfString () {
        // verify
        assertThat(mDoorMock.getDoorName(), instanceOf(String.class));
    }

    @Test
    public void doorIdShouldBeInt() {
        // verify
        assertThat(mDoorMock.getDoorId(), instanceOf(Integer.class));
    }

    @Test
    public void doorIdShouldIsOneOrZero() {
        // verify
        assertEquals(0, mDoorMock.getDoorId());
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenStateNull() {
        mDoorMock.setDoorState(null);
    }
}
