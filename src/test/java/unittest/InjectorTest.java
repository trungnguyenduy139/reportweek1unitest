package test.java.unittest;

import main.java.unittest.DoorInjector;
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
        // verify
        assertNotNull(mInjectorStub.provideDoor());
    }

    @Test
    public void doorInjectorShouldBeCorrectType() {
        assertThat(mInjectorStub.provideDoor(), instanceOf(DoorStub.class));
    }
}
