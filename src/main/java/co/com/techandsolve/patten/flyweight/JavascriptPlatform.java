package co.com.techandsolve.patten.flyweight;

/**
 * Created by Raul .A Alzate raul.alzate@techandsolve.com on 19/04/2018.
 */
public class JavascriptPlatform implements Platform {
    @Override
    public void execute(Code code) {
        System.out.println("Javascript code.");
    }
}
