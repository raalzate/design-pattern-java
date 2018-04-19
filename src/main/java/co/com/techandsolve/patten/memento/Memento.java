package co.com.techandsolve.patten.memento;

/**
 * Created by Raul .A Alzate raul.alzate@techandsolve.com on 19/04/2018.
 */
public class Memento {
    private String state;

    public Memento(String stateToSave){
        state = stateToSave;
    }

    public String getSavedState(){
        return state;
    }
}
