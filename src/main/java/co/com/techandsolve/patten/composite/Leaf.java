package co.com.techandsolve.patten.composite;

/**
 * Created by Raul .A Alzate raul.alzate@techandsolve.com on 19/04/2018.
 */
public class Leaf extends Component {
    private final String name;
    public Leaf(String name){
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
}
