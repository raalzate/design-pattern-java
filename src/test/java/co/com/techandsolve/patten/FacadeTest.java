package co.com.techandsolve.patten;

import co.com.techandsolve.patten.facade.Facade;
import org.junit.Test;

/**
 * Created by Raul .A Alzate raul.alzate@techandsolve.com on 19/04/2018.
 */
public class FacadeTest {
    @Test
    public void validPattern(){
        Facade facade = new Facade();
        facade.print();
    }
}
