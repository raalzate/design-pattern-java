package co.com.techandsolve.patten.command;


/**
 * Created by MyMac on 18/04/18.
 */
public class Executor {
    private Command[] command;
    public Executor(Command... command){
        this.command = command;
    }
    public void execute(){
        for (int i = 0; i < command.length; i++){
            command[i].run();
        }
    }
}
