package co.com.techandsolve.patten.decorator;

/**
 * Created by Raul .A Alzate raul.alzate@techandsolve.com on 19/04/2018.
 */
public class DecoradorConcretoB extends Decorador {
    private String property;
    public DecoradorConcretoB(Component componente) {
        super(componente);
    }

    @Override
    public String getName() {
        return "["+component.getName()+"]";
    }

    @Override
    public void operation() {
        this.property = getName();
        otherFunc();
    }

    private void otherFunc(){
        System.out.println("==> "+property);
    }
}
