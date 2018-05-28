package test.java.unittest;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class InjectorTest {
    private InjectorMock mInjectorMock;

    @Before
    public void setup() {
        // setup
        mInjectorMock = new InjectorMock();
    }

    @Test
    public void injectorShouldNotProvideNullDoor () {
        // verify
        assertNotNull(mInjectorMock.provideDoor());
    }
}
