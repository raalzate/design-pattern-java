package co.com.techandsolve.patten;

import co.com.techandsolve.patten.mediator.Mediator;
import co.com.techandsolve.patten.mediator.CamaraMediator;
import co.com.techandsolve.patten.mediator.EyeColleague;
import co.com.techandsolve.patten.mediator.HeadColleague;
import org.junit.Test;

/**
 * Created by MyMac on 18/04/18.
 */
public class MediatorTest {
    @Test
    public void validPatten(){
        EyeColleague eyeColleague = new EyeColleague();
        HeadColleague headColleague = new HeadColleague();
        Mediator mediator = new CamaraMediator(
                eyeColleague, headColleague
        );

        eyeColleague.setMediator(mediator);
        headColleague.setMediator(mediator);

        headColleague.openCamara();
    }
}
