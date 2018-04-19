package co.com.techandsolve.patten.bridge;

/**
 * Created by Raul .A Alzate raul.alzate@techandsolve.com on 19/04/2018.
 */
public abstract class CarBridge {
    private final Product product;
    private final String carType;
    public CarBridge(Product product,String carType){
        this.product = product;
        this.carType = carType;
    }
    public abstract void assemble();
    public abstract void produceProduct();
    public void printDetails(){
        System.out.println("Car: "+carType+", Product:"+product.productName());
    }

}
