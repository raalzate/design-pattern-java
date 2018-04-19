package co.com.techandsolve.patten;

import co.com.techandsolve.patten.singleton.PersonSingleton;
import org.junit.Test;

/**
 * Created by Raul .A Alzate raul.alzate@techandsolve.com on 19/04/2018.
 */
public class PersonReqSingletonTest {
    @Test
    public void validPattern(){
        PersonSingleton.getInstance().setFullname("Raul Andres");
    }

    @Test
    public void validPattern_reValid(){
        System.out.println(PersonSingleton.getInstance().getFullname());
    }
}
