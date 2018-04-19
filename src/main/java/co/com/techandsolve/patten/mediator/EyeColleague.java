package co.com.techandsolve.patten.mediator;

/**
 * Created by MyMac on 18/04/18.
 */
public class EyeColleague implements Colleague {
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getPhoto(){
        return this.mediator.getPhoto();
    }
}
