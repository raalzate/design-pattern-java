package co.com.techandsolve.patten;

import co.com.techandsolve.patten.state.Robot;
import org.junit.Test;

/**
 * Created by MyMac on 18/04/18.
 */
public class StateTest {
    @Test
    public void validPatten(){
        Robot robot = new Robot();
        robot.off();
        robot.on();
        robot.off();

    }
}
