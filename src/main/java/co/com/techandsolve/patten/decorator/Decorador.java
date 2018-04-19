package co.com.techandsolve.patten.decorator;

/**
 * Created by Raul .A Alzate raul.alzate@techandsolve.com on 19/04/2018.
 */
public abstract class Decorador implements Component{
    public Component component;

    public Decorador(Component component){
        this.component = component;
    }

    public void operation(){
        System.out.println("Decorador.operation()");
    }
}
