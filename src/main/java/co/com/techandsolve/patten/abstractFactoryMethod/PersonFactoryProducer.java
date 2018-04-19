package co.com.techandsolve.patten.abstractFactoryMethod;

/**
 * Created by Raul .A Alzate raul.alzate@techandsolve.com on 19/04/2018.
 */
public final class PersonFactoryProducer {
    public static PersonFactory getFactory(){
        return new SpanishPeopleFactory();
    }
}
