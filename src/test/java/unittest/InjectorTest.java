package test.java.unittest;

import main.java.unittest.IDoor;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class InjectorTest {
    private InjectorStub mInjectorStub;

    @Before
    public void setup() {
        // setup
        mInjectorStub = new InjectorStub();
    }

    @Test
    public void injectorShouldNotProvideNullDoor () {
        // exercise
        IDoor door = mInjectorStub.provideDoor(1);
        // verify
        assertNotNull(door);
    }

    @Test
    public void doorInjectorShouldBeCorrectedType() {
        assertThat(mInjectorStub.provideDoor(1), instanceOf(DoorStub.class));
    }
}
