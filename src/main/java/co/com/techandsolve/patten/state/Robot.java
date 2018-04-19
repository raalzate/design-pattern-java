package co.com.techandsolve.patten.state;

/**
 * Created by MyMac on 18/04/18.
 */
public class Robot implements RoboticState {
    private RoboticState off;
    private RoboticState on;

    private RoboticState state;

    public Robot(){
        this.off = new RoboticOff(this);
        this.on = new RoboticOn(this);

        this.state = on;
    }

    public void setState(RoboticState state){
        this.state = state;
    }

    public void on() {
        state.on();
    }

    public void off() {
        state.off();
    }

    public RoboticState getOn() {
        return on;
    }

    public RoboticState getOff() {
        return off;
    }

}
