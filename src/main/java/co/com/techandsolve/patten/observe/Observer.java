package co.com.techandsolve.patten.observe;

/**
 * Created by MyMac on 18/04/18.
 */
public abstract class Observer {
    public abstract void update();
    protected Subject subject;
    public Observer(Subject subject){
        this.subject = subject;
        this.subject.subscribeObserver(this);
    }
    public void unSubscribe() {
        subject.unSubscribeObserve(this);
    }
}
