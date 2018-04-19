package co.com.techandsolve.patten;

import co.com.techandsolve.patten.composite.Composite;
import co.com.techandsolve.patten.composite.Leaf;
import org.junit.Test;

/**
 * Created by Raul .A Alzate raul.alzate@techandsolve.com on 19/04/2018.
 */
public class CompositeTest {
    @Test
    public void validPattern(){

        Composite composite = new Composite();
        composite.add(new Leaf("Hoja 1"));
        composite.add( new Leaf("Hoja 2"));

        Composite composite2 = new Composite();
        composite2.add(new Leaf("Hoja 3"));

        composite.add(composite2);

    }
}
