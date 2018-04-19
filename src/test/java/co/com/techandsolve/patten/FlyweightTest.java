package co.com.techandsolve.patten;

import co.com.techandsolve.patten.flyweight.Code;
import co.com.techandsolve.patten.flyweight.Platform;
import co.com.techandsolve.patten.flyweight.PlatformFactory;
import org.junit.Test;

/**
 * Created by Raul .A Alzate raul.alzate@techandsolve.com on 19/04/2018.
 */
public class FlyweightTest {
    @Test
    public void validPattern(){
        Code code = new Code();
        Platform platform = PlatformFactory.getPlatformInstance("java");
        platform.execute(code);

        System.out.println("*************************");
        platform = PlatformFactory.getPlatformInstance("javascript");
        platform.execute(code);

    }
}
