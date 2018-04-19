package co.com.techandsolve.patten;

import co.com.techandsolve.patten.memento.Caretaker;
import co.com.techandsolve.patten.memento.Originator;
import org.junit.Test;

/**
 * Created by Raul .A Alzate raul.alzate@techandsolve.com on 19/04/2018.
 */
public class MementoTest {
    @Test
    public void validPattern(){
        Caretaker  caretaker = new Caretaker();

        Originator originator = new Originator();
        originator.set("State1");
        originator.set("State2");
        caretaker.addMemento( originator.saveToMemento() );
        originator.set("State3");
        caretaker.addMemento( originator.saveToMemento() );
        originator.set("State4");

        originator.restoreFromMemento( caretaker.getMemento(1) );
    }
}
