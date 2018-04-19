package co.com.techandsolve.patten.abstractFactoryMethod;

/**
 * Created by Raul .A Alzate raul.alzate@techandsolve.com on 19/04/2018.
 */
public class SpanishPeopleFactory implements PersonFactory {
    public Person getPersonByType(Type type) {
        Person person = null;
        switch (type) {
            case COL:
                person = new COLPerson();
                break;
            case ESP:
                person = new ESPPerson();
                break;

        }
        return person;
    }
}
