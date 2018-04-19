package co.com.techandsolve.patten.strategy;

/**
 * Created by Raul .A Alzate raul.alzate@techandsolve.com on 19/04/2018.
 */
public class Context {
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void execute(String text){
        strategy.format(text);
    }
}
