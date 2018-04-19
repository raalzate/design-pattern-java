package co.com.techandsolve.patten;

import co.com.techandsolve.patten.builder.Person;
import org.junit.Test;

/**
 * Created by Raul .A Alzate raul.alzate@techandsolve.com on 19/04/2018.
 */
public class BuilderTest {
    @Test
    public void validPattern(){
       Person person = new  Person.PersonBuilder()
               .setName("Raul")
               .setSurname("Alzate")
               .createPerson();

       System.out.println(person.getName()+" "+person.getSurname());
    }
}
