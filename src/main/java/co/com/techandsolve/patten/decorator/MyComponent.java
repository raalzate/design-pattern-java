package co.com.techandsolve.patten.decorator;

/**
 * Created by Raul .A Alzate raul.alzate@techandsolve.com on 19/04/2018.
 */
public class MyComponent implements Component {
    @Override
    public String getName() {
        return "MyComponent";
    }

    @Override
    public void operation() {
        System.out.println("MyComponent.operation()");
    }
}
