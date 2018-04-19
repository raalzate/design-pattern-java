package co.com.techandsolve.patten.decorator;

/**
 * Created by Raul .A Alzate raul.alzate@techandsolve.com on 19/04/2018.
 */
public class DecoradorConcretoA extends Decorador {
    public DecoradorConcretoA(Component componente) {
        super(componente);
    }

    @Override
    public String getName() {
        return "/"+component.getName()+"/";
    }

    @Override
    public void operation() {
        component.operation();
        System.out.println(getName());
    }
}
