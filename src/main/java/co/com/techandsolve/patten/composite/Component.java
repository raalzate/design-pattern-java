package co.com.techandsolve.patten.composite;

import java.util.List;

/**
 * Created by Raul .A Alzate raul.alzate@techandsolve.com on 19/04/2018.
 */
public abstract class  Component {
    public abstract String getName();
    public void add(Component component){
        throw new UnsupportedOperationException("Is not support");
    }
    public void remove(Component component){
        throw new UnsupportedOperationException("Is not support");
    }
    public List<Component> getAll(){
        throw new UnsupportedOperationException("Is not support");
    }
}
