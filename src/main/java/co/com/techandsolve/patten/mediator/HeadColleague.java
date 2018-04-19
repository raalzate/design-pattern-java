package co.com.techandsolve.patten.mediator;

/**
 * Created by MyMac on 18/04/18.
 */
public class HeadColleague implements Colleague {
    private Mediator mediator;
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void openCamara(){
        mediator.open();
        mediator.takePhoto();
    }

}
