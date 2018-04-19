package co.com.techandsolve.patten.prototype;

/**
 * Created by MyMac on 18/04/18.
 */
public class CarNano extends Car{
    private String type = "nano";
    public CarNano clone() throws CloneNotSupportedException {
        return (CarNano)super.clone();
    }

}
