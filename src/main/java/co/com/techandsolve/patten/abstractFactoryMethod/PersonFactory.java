package co.com.techandsolve.patten.abstractFactoryMethod;

/**
 * Created by Raul .A Alzate raul.alzate@techandsolve.com on 19/04/2018.
 */
public interface PersonFactory {
     enum Type {
          COL, ESP
     }
     Person getPersonByType(Type type);
}
