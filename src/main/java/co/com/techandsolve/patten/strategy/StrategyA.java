package co.com.techandsolve.patten.strategy;

/**
 * Created by Raul .A Alzate raul.alzate@techandsolve.com on 19/04/2018.
 */
public class StrategyA implements Strategy {
    @Override
    public void format(String text) {
        System.out.println("[toLowerCase]: "+text.toLowerCase());

    }
}
