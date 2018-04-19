package co.com.techandsolve.patten.state;

/**
 * Created by MyMac on 18/04/18.
 */
public class RoboticOff implements RoboticState {
    private Robot context;

    public RoboticOff(Robot context){
        this.context = context;
    }

    public void on() {
        this.context.setState(context.getOn());
        System.out.println("HeadColleague is switched on");
    }


    public void off() {
        System.out.println("HeadColleague is switched off");
    }
}
