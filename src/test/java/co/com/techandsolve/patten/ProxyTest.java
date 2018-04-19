package co.com.techandsolve.patten;

import co.com.techandsolve.patten.proxy.Image;
import co.com.techandsolve.patten.proxy.ProxyImage;
import org.junit.Test;

/**
 * Created by Raul .A Alzate raul.alzate@techandsolve.com on 19/04/2018.
 */
public class ProxyTest {
    @Test
    public void validPattern(){
        Image image = new ProxyImage("test_10mb.jpg");

        image.display();
        System.out.println("");

        image.display();
    }
}
