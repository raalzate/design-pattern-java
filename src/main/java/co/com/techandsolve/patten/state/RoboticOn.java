package co.com.techandsolve.patten.state;

/**
 * Created by MyMac on 18/04/18.
 */
public class RoboticOn implements RoboticState {
    private Robot context;

    public RoboticOn(Robot context){
        this.context = context;
    }
    public void on() {
        System.out.println("HeadColleague is switched on");
    }


    public void off() {
        this.context.setState(context.getOff());
        System.out.println("HeadColleague is switched off");
    }
}
