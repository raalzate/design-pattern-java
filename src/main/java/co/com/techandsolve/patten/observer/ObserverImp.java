package co.com.techandsolve.patten.observer;

/**
 * Created by MyMac on 18/04/18.
 */
public class ObserverImp extends Observer{

    public ObserverImp(Subject subject) {
        super(subject);
    }

    public void update() {
        System.out.println("Estado Actual => "+subject.getStatus());
    }
}
