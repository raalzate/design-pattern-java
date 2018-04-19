package co.com.techandsolve.patten.chainOfResponsibility;


/**
 * Created by MyMac on 18/04/18.
 */
public interface Handler {
    public void setHandler(Handler handler);
    public void process(Product product);
    public String getHandlerName();
}
