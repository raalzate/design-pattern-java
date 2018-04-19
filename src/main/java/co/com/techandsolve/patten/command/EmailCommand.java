package co.com.techandsolve.patten.command;

/**
 * Created by MyMac on 18/04/18.
 */
public class EmailCommand extends Command<Email> {
    public EmailCommand(Email email){
       super(email);
    }

    public void run() {
        payload.sendEmail();
    }
}
