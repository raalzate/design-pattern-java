package co.com.techandsolve.patten;

import co.com.techandsolve.patten.abstractFactoryMethod.Person;
import co.com.techandsolve.patten.abstractFactoryMethod.PersonFactory;
import co.com.techandsolve.patten.abstractFactoryMethod.PersonFactoryProducer;
import org.junit.Test;

/**
 * Created by Raul .A Alzate raul.alzate@techandsolve.com on 19/04/2018.
 */
public class AbstractFactoryMethodTest {
    @Test
    public void validPattern(){
        PersonFactory factory = PersonFactoryProducer.getFactory();
        Person person = factory.getPersonByType(PersonFactory.Type.ESP);
        System.out.println(person.name());
    }
}
