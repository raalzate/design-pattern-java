package co.com.techandsolve.patten.factoryMethod;

/**
 * Created by MyMac on 18/04/18.
 */
public class ProductFactoryImp implements ProductFactory {
    public Product getProduct() {
        return new ProductImp();
    }
}
