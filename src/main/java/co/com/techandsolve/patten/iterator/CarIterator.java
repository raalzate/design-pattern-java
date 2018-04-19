package co.com.techandsolve.patten.iterator;

import java.util.Iterator;

/**
 * Created by MyMac on 18/04/18.
 */
public class CarIterator implements Iterator<Car> {
    private Car[] cars;
    int pos;
    public CarIterator(Car[] cars){
        this.cars = cars;
    }

    public boolean hasNext() {
        if(pos >= cars.length || cars[pos] == null) {
            return false;
        }
        return true;
    }

    public Car next() {
        return cars[pos++];
    }

    public void remove() {
        if(pos <=0 ) {
            throw new IllegalStateException("Illegal position");
        }
        if(cars[pos-1] !=null){
            for (int i= pos-1; i<(cars.length-1);i++){
                cars[i] = cars[i+1];
            }
            cars[cars.length-1] = null;
        }
    }
}
