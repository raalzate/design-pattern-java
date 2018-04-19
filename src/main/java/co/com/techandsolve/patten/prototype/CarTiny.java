package co.com.techandsolve.patten.prototype;

/**
 * Created by MyMac on 18/04/18.
 */
public class CarTiny extends Car{
    private String type = "tiny";
    public CarTiny clone() throws CloneNotSupportedException {
        return (CarTiny)super.clone();
    }
}
