package co.com.techandsolve.patten;

import co.com.techandsolve.patten.strategy.Context;
import co.com.techandsolve.patten.strategy.Strategy;
import co.com.techandsolve.patten.strategy.StrategyA;
import co.com.techandsolve.patten.strategy.StrategyB;
import org.junit.Test;

/**
 * Created by Raul .A Alzate raul.alzate@techandsolve.com on 19/04/2018.
 */
public class StrategyTest {
    @Test
    public void validPattern(){
        Strategy strategy = new StrategyB();
        Context context = new Context(strategy);
        context.execute("Hola Mundo");
    }
}
