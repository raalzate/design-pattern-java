package co.com.techandsolve.patten.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MyMac on 18/04/18.
 */
public class SubjectImp extends Subject<String> {
    private String obj;
    public void setStatus(String obj) {
        notifyObservers();
        this.obj = obj;
    }

    public String getStatus() {
        return this.obj;
    }
}
