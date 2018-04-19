package co.com.techandsolve.patten.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Raul .A Alzate raul.alzate@techandsolve.com on 19/04/2018.
 */
public class Composite extends Component {
    private List<Component> componentList = new ArrayList<>();

    @Override
    public String getName() {
        return "parent";
    }

    @Override
    public void add(Component component) {
        componentList.add(component);
    }

    @Override
    public void remove(Component component) {
        componentList.remove(component);
    }

    @Override
    public List<Component> getAll() {
        return componentList;
    }
}
