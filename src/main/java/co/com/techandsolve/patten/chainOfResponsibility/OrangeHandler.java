package co.com.techandsolve.patten.chainOfResponsibility;

/**
 * Created by MyMac on 18/04/18.
 */
public class OrangeHandler implements Handler {
    private Handler handler;
    private String handlerName;

    public OrangeHandler(String handlerName){
        this.handlerName = handlerName;
    }

    public void setHandler(Handler handler) {
this.handler = handler;
    }

    public void process(Product product) {
        if("orange".equals(product.type)){
            System.out.println("Process product... by "+ handlerName);
        }else if(handler!=null){
            System.out.println(handlerName+" fowards request to "+handler.getHandlerName());
            handler.process(product);
        }else{
            System.out.println("Product not supported");
        }
    }

    public String getHandlerName() {
        return handlerName;
    }
}
