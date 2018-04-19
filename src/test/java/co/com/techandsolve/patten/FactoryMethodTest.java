package co.com.techandsolve.patten;

import co.com.techandsolve.patten.factoryMethod.ProductFactory;
import co.com.techandsolve.patten.factoryMethod.ProductFactoryImp;
import org.junit.Test;

/**
 * Created by MyMac on 18/04/18.
 */
public class FactoryMethodTest {
    @Test
    public void validPatten(){
        ProductFactory factory = new ProductFactoryImp();

        factory.getProduct().build();
    }
}
