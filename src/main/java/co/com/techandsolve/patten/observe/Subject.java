package co.com.techandsolve.patten.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MyMac on 18/04/18.
 */
public  abstract class Subject<T> {
    protected List<Observer> observerList = new ArrayList<Observer>();
    public void subscribeObserver(Observer observer) {
        observerList.add(observer);
    }

    public void unSubscribeObserve(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }
    public abstract void setStatus(T obj);
    public abstract T getStatus();
}
