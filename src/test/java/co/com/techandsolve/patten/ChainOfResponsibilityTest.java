package co.com.techandsolve.patten;

import co.com.techandsolve.patten.chainOfResponsibility.AppleHandler;
import co.com.techandsolve.patten.chainOfResponsibility.Handler;
import co.com.techandsolve.patten.chainOfResponsibility.OrangeHandler;
import co.com.techandsolve.patten.chainOfResponsibility.Product;
import org.junit.Test;

/**
 * Created by MyMac on 18/04/18.
 */
public class ChainOfResponsibilityTest {
    @Test
    public void validPatten(){
        Product product = new Product("Orange", "orange");

        Handler orangeHandler = new OrangeHandler("OrangeHandler");
        Handler appleHandler = new AppleHandler("AppleHandler");


        appleHandler.setHandler(orangeHandler);

        appleHandler.process(product);

    }
}
