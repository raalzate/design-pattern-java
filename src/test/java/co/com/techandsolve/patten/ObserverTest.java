package co.com.techandsolve.patten;

import co.com.techandsolve.patten.observe.Observer;
import co.com.techandsolve.patten.observe.ObserverImp;
import co.com.techandsolve.patten.observe.Subject;
import co.com.techandsolve.patten.observe.SubjectImp;
import org.junit.Test;

/**
 * Created by MyMac on 18/04/18.
 */
public class ObserverTest {
    @Test
    public void validPatten(){
        Subject subject = new SubjectImp();

        Observer observer = new ObserverImp(subject);

        subject.setStatus("Hola mundo");

        subject.setStatus("Hola mundo2");

        observer.unSubscribe();

        subject.setStatus("Hola mundo3");



    }
}
