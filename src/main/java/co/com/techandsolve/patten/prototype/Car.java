package co.com.techandsolve.patten.prototype;

/**
 * Created by MyMac on 18/04/18.
 */
public abstract class Car implements Cloneable{

    private String name;

    @Override
    public Car clone() throws CloneNotSupportedException {
        return (Car) super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return name;
    }
}
