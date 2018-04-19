package co.com.techandsolve.patten.mediator;

/**
 * Created by MyMac on 18/04/18.
 */
public class CamaraMediator implements Mediator {
    private EyeColleague eyeColleague;
    private HeadColleague headColleague;
    public CamaraMediator(EyeColleague eyeColleague, HeadColleague headColleague){
        this.eyeColleague = eyeColleague;
        this.headColleague = headColleague;
    }

    public void open() {
        System.out.println("open...");
    }

    public void takePhoto() {
        System.out.println("take a photo...");
        System.out.println(eyeColleague.getPhoto());
    }

    public String getPhoto() {
        return "[PHOTO]";
    }
}
