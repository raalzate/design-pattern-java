package co.com.techandsolve.patten.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Raul .A Alzate raul.alzate@techandsolve.com on 19/04/2018.
 */
public class Caretaker {
    private List<Memento> savedStates = new ArrayList<>();

    public void addMemento(Memento m) {
        savedStates.add(m);
    }

    public Memento getMemento(int index){
        return savedStates.get(index);
    }
}

