package co.com.techandsolve.patten;

import co.com.techandsolve.patten.decorator.DecoradorConcretoA;
import co.com.techandsolve.patten.decorator.DecoradorConcretoB;
import co.com.techandsolve.patten.decorator.MyComponent;
import org.junit.Test;

/**
 * Created by Raul .A Alzate raul.alzate@techandsolve.com on 19/04/2018.
 */
public class DecoradorTest {
    @Test
    public void validPattern(){
        MyComponent c = new MyComponent();
        DecoradorConcretoA d1 = new DecoradorConcretoA(c);

        DecoradorConcretoB d2 = new DecoradorConcretoB(d1);
        c.operation();
        d2.operation();
        d1.operation();
    }
}
