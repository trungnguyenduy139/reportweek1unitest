package test.java.unittest;

import main.java.unittest.IController;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;


public class ControllerManagerTest {
    private ControllerManagerStub mManagerStub;
    private ControllerStub mController;

    @Before
    public void setup() {
        // setup phase
        mManagerStub = new ControllerManagerStub();
        mController = new ControllerStub();
    }

    @Test(expected = NullPointerException.class)
    public void shouldThrowNullPointerExceptionWhenNullControllerIsSet() {
        // exercise
        mManagerStub.setController(null);
    }

    @Test
    public void shouldControllerIsInstanceOfIController() {
        // exercise
        mManagerStub.setController(mController);

        // verify
        Assert.assertThat(mManagerStub.getController(), instanceOf(IController.class));
    }
}
