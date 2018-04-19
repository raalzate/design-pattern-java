package co.com.techandsolve.patten;

import co.com.techandsolve.patten.command.Email;
import co.com.techandsolve.patten.command.EmailCommand;
import co.com.techandsolve.patten.command.Executor;
import co.com.techandsolve.patten.command.Command;
import org.junit.Test;

/**
 * Created by MyMac on 18/04/18.
 */
public class CommandTest {
    @Test
    public void validPatten(){
        Command command = new EmailCommand(new Email());

        new Executor(command).execute();
    }
}
