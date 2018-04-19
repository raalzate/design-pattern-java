package co.com.techandsolve.patten.adapter;

/**
 * Created by Raul .A Alzate raul.alzate@techandsolve.com on 19/04/2018.
 */
public class FindPersonAdapter extends Adapter<PersonReq, PersonResp> {

    Service service = new Service();
    private Object resp;
    @Override
    public void request(PersonReq payload) {
        resp = service.call(payload);
    }

    @Override
    public PersonResp response() {
        return  new PersonResp((String)resp);
    }
}
