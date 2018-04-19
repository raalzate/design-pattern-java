package co.com.techandsolve.patten;

import co.com.techandsolve.patten.prototype.Car;
import co.com.techandsolve.patten.prototype.CarNano;
import co.com.techandsolve.patten.prototype.CarTiny;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by MyMac on 18/04/18.
 */
public class PrototypeTest {
    @Test
    public void validPatten() throws CloneNotSupportedException {
        Car carNano = new CarNano();
        carNano.setName("CaR1");

        Car carTiny = new CarTiny();
        carTiny.setName("CaR2");

        List<Car> cars = Arrays.asList(carNano.clone(), carTiny.clone());

        Car c2 = cars.get(0);
        c2.setName("Cambio");
        System.out.println(c2);
        System.out.println(carNano);

    }
}
