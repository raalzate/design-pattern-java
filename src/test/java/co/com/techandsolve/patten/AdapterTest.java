package co.com.techandsolve.patten;

import co.com.techandsolve.patten.adapter.FindPersonAdapter;
import co.com.techandsolve.patten.adapter.PersonReq;
import org.junit.Test;

/**
 * Created by Raul .A Alzate raul.alzate@techandsolve.com on 19/04/2018.
 */
public class AdapterTest {
    @Test
    public void validPattern(){
        FindPersonAdapter adapter = new FindPersonAdapter();
        adapter.request(new PersonReq());
        System.out.println(adapter.response().res);
    }
}
