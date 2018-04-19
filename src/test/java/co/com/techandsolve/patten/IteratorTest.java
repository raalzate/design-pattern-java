package co.com.techandsolve.patten;

import co.com.techandsolve.patten.iterator.Car;
import co.com.techandsolve.patten.iterator.CarIterator;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by MyMac on 18/04/18.
 */
public class IteratorTest {
    @Test
    public void validPattern() {
        CarIterator carIterator = new CarIterator(
                new Car[]{
                        new Car("Car 1"),
                        new Car("Car 2"),
                        new Car("Car 3")
                }
        );
        while(carIterator.hasNext()){
            System.out.println(carIterator.next());
        }
    }
}
