package co.com.techandsolve.patten.bridge;

/**
 * Created by Raul .A Alzate raul.alzate@techandsolve.com on 19/04/2018.
 */
public class CentralLocking implements Product{
    @Override
    public String productName() {
        return "CentralLocking";
    }

    @Override
    public void produce() {
        System.out.println("Producing Central Locking");
    }
}
