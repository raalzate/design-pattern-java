package co.com.techandsolve.patten;

import co.com.techandsolve.patten.bridge.*;
import org.junit.Test;

/**
 * Created by Raul .A Alzate raul.alzate@techandsolve.com on 19/04/2018.
 */
public class BridgeTest {
    @Test
    public void validPattern(){
        Product product = new CentralLocking();
        Product product2 = new GearLocking();
        CarBridge car = new BigWheel(product , "BigWheel xz model");
        car.produceProduct();
        car.assemble();
        car.printDetails();

        System.out.println();

        car = new BigWheel(product2 , "BigWheel xz model");
        car.produceProduct();
        car.assemble();
        car.printDetails();

    }
}
