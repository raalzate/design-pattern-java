package co.com.techandsolve.patten.templateMethod;

/**
 * Created by MyMac on 18/04/18.
 */
public abstract class  AbsTemplate {

    public void pintarNombre(){
        System.out.println(primerNombre()+", "+segundNombre()+", "+tercerNombre());
    }

    public abstract String primerNombre();
    public abstract String segundNombre();
    public abstract String tercerNombre();

}
