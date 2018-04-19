package co.com.techandsolve.patten.facade;

/**
 * Created by Raul .A Alzate raul.alzate@techandsolve.com on 19/04/2018.
 */
public class Facade {

    public void print(){
        Cliente1 cliente1 = new Cliente1();
        Cliente2 cliente2 = new Cliente2();
        Cliente3 cliente3 = new Cliente3();
        cliente3.print(cliente1.operation(), cliente2.get());
    }
}
